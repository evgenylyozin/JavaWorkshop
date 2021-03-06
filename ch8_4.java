import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class ch8_4 {
    public static void main(String[] args) throws IOException {
        String pathString = System.getProperty("java.io.tmpdir");

        List<String> fileNames = new ArrayList<>();
        DirectoryStream<Path> directoryStream;

        directoryStream = Files.newDirectoryStream(Paths.get(pathString));

        for (Path path : directoryStream) {
            fileNames.add(path.toString());
        }

        for (int i = 0; i < 5; i++ ) {
            String filePath = fileNames.get(i);
            String fileType = Files.isDirectory(Paths.get(filePath)) ? "Dir" : "Fil";
            System.out.println(fileType + " " + filePath);
        }

        directoryStream.close();
    }
}
