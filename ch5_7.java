import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class ch5_7 {
    public static void main(String[] args) {
        
       List<String> lines = Collections.emptyList();

       try {
        lines = Files.readAllLines(Paths.get("readme.txt"));
       } catch (NullPointerException | IOException e) {
           if (e instanceof IOException) {

                System.out.println("IOException");

           }
           if (e instanceof NullPointerException) {
                System.out.println("NullPointerException");
           }
       }
       

       
    }
}