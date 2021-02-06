import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;

public class ch8_3 {
    public static void main(String[] args) throws IOException {
        String pathString = System.getProperty("java.io.tmpdir");

        Path path = Paths.get(pathString);
        
        Stream<Path> fileNames = Files.list(path);

        fileNames.limit(5).forEach(System.out::println);

        fileNames.close();
    }
}
