import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class ch8_8 {
    public static void main(String[] args) {

    String pathString = System.getProperty("user.home") + "/javaTemp/temp.txt";
    Path pathFile = Paths.get(pathString);

        try {
            List<String> fileContent = Files.readAllLines(pathFile);

            for (String content:fileContent){
                System.out.println(content);
            }
        } catch (IOException ioe) {
            System.out.println("WARNING: there was an issue with the file");

        }
    }
}
