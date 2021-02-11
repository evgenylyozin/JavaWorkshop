import java.io.IOException;

public class ch11_2 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        
        try {
            Process process = runtime.exec("firefox");
        } catch (IOException e) {
            System.out.println("WARNING: something happened with exec");
        }
    }
}
