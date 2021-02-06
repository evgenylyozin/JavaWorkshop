import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

public class ch8_5 {
    public static void main(String[] args) throws IOException {
        String pathString = System.getProperty("user.home");

        List<Path> subDirectories = Files.walk(Paths.get(pathString), 1)
        .filter(Files::isDirectory)
        .collect(Collectors.toList());

        for (int i = 0; i < 5; i++) {
            Path filePath = subDirectories.get(i);
            String fileType = Files.isDirectory(filePath) ? "Dir" : "Fil";
            System.out.println(fileType + " " + filePath);
        }
    }
}
