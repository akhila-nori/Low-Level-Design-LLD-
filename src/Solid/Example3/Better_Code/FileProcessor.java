package Solid.Example3.Better_Code;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

//This FileProcessor utility is used for doing -  IO on file (read, write) the data

public class FileProcessor {
    private String filePath;

    public FileProcessor(String filePath){
        this.filePath = filePath;
    }

    public String readAllText() throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(this.filePath)));
        return content;
    }

    public void writeToFile(String text) throws IOException {
        String outputFilePath = Paths.get(this.filePath).getFileName().toString().replaceFirst("[.][^.]+$", "") + ".html";
        System.out.println(outputFilePath);
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFilePath))) {
            writer.write(text);
        }
    }
}
