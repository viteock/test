package day61_exceptions.checked_exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FilesCheck {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\viteock\\IdeaProjects\\java-programming\\src\\day61_exceptions\\checked_exceptions\\data1.txt";
        List<String> abc = Files.readAllLines(Paths.get(filePath));
        System.out.println(abc.toString());
    }
}
