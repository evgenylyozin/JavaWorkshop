import java.io.*;
import java.nio.file.*;
import java.util.*;



public class ch5_9 {
    public static void main(String[] args) throws IOException {

    List<String> lines = Collections.emptyList();

    try {
        lines = Files.readAllLines(Paths.get("readme.txt"));
       } catch (NoSuchFileException e) {
            System.out.println("File not Found!");
       }

    }
}