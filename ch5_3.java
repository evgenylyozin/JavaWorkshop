import java.nio.file.*;
import java.util.*;

public class ch5_3 {
    public static void main(String[] args) {
        
       List<String> lines = Collections.emptyList();

       lines = Files.readAllLines(Paths.get("readme.txt"));

       
    }
}