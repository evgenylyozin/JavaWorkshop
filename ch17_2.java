import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ch17_2 {
    public static void main(String[] args) {
        
        Supplier<String> supplier = new Supplier<String>(){
            int index;
            @Override
            public String get() {
                String[] data = getStrings();
                if (index < data.length - 1) {
                    return data[index++];
                } else {
                    return null;
                }
            }
        };

        NumberPublisher publisher = new NumberPublisher(supplier);
        NumberProcessor processor = new NumberProcessor();
        publisher.subscribe(processor);
        processor.subscribe(new Flow.Subscriber<>(){
            Flow.Subscription subscription;

            @Override
            public void onSubscribe(Flow.Subscription subscription) {
                this.subscription = subscription;
                subscription.request(1);
            }

            @Override
            public void onNext(String item) {
                System.out.println("onNext: " + item);
                subscription.request(1);
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("onError: " + throwable.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("onComplete()");
            }
        });
    }

    private static String[] getStrings() {
        String filePath = "numbers.txt";

        try (Stream<String> words = Files.lines(Paths.get(filePath))) {
            return words.flatMap((line) -> Arrays.stream(line.split("[\\s\\n]+")))
            .filter((word) -> word.length() > 0)
            .toArray(String[]::new);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

class NumberPublisher extends SubmissionPublisher<String> {
    final Timer timer = new Timer();
    final TimerTask timerTask = new TimerTask(){
        @Override
        public void run() {
            try {
                submit(supplier.get());
            } catch (Exception e) {
                closeExceptionally(e);
            }
            
        }
    };

    public NumberPublisher(Supplier<String> supplier){
        this.supplier = supplier;
        this.timer.schedule(timerTask, 1000, 1000);
    }

    final Supplier<String> supplier;

    @Override
    public void close() {
        timer.cancel();
        super.close();
    }
}

class NumberProcessor extends SubmissionPublisher<String>
implements Flow.Processor<String, String> {

    private Flow.Subscription subscription;

    private Predicate<String> predicate = new Predicate<String>() {
        @Override
        public boolean test(String s) {
            try {
                Integer.valueOf(s);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
    };

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        this.subscription.request(1);
    }
    @Override
    public void onNext(String item) {
        if (predicate.test(item)) {
            submit(item);
        }
        this.subscription.request(1);
    }
    @Override
    public void onError(Throwable throwable) {
        closeExceptionally(throwable);
    }
    @Override
    public void onComplete() {
        close();
    }
}