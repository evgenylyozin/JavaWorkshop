import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.concurrent.SubmissionPublisher;
import java.util.stream.Stream;

public class ch17_1 {
    public static void main(String[] args) {
        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
        LipsumSubscriber lipsumSubscriber = new LipsumSubscriber();
        publisher.subscribe(lipsumSubscriber);
        String filePath = "lipsum.txt";

        try (Stream<String> words = Files.lines(Paths.get(filePath))) {
            words.flatMap((l) -> Arrays.stream(l.split("[\\s.,\\n]+"))).
            forEach(publisher::submit);
            publisher.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

class LipsumSubscriber implements Flow.Subscriber<String> {
        
    private Flow.Subscription subscription;
    
    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        this.subscription.request(1);
    }
    @Override
    public void onNext(String item) {
        System.out.println(item);
        this.subscription.request(1);
    }
    @Override
    public void onError(Throwable throwable) {
        System.out.println(throwable.getMessage());
    }
    @Override
    public void onComplete() {
        System.out.println("completed");
    }
}