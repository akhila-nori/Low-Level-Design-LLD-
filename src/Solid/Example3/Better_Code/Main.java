package Solid.Example3.Better_Code;

public class Main {
    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor("../../");
        TextProcessor textProcessor = new TextProcessor(fileProcessor);
        textProcessor.convertText();

    }
}
