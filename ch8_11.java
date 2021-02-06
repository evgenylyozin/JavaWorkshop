import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class ch8_11 {
    public static void main(String[] args) {
        String pathString = System.getProperty("user.home") + "/javaTemp/numbers.txt";
    
        Path pathFile = Paths.get(pathString);

        if(Files.notExists(pathFile)) {
            int[] numbers = new int[10];
            for (int i = 0; i < 10; i++) {
                numbers[i] = (int) (Math.random() * 10);
            }
        }
    
    }

}
