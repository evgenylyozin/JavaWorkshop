import java.io.*;
import java.util.concurrent.TimeUnit;

public class ch11_06 {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        Process process = null;

        try {
            process = runtime.exec("java -cp .:ch11_5");
        } catch (IOException ioe) {
            System.out.println("WARNING: couldn't start your app");
       }
       try {
        process.waitFor(5, TimeUnit.SECONDS);
       } catch (InterruptedException ie) {
        System.out.println("WARNING: interrupted exception fired");
        }

        OutputStream out = process.getOutputStream();
        Writer writer = new OutputStreamWriter(out);
        try {
            writer.write("This is how we roll!\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        InputStream in = process.getInputStream();
        Reader reader = new InputStreamReader(in);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line = bufferedReader.readLine();
        System.out.println(line);
        process.destroy();
    }
}
