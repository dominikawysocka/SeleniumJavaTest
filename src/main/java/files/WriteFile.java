package files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("E:\\ProjektyzProgramowania\\tutorialselenium\\src\\main\\java\\text");
        System.out.println("mam plik");
        writer.write("some text");
        System.out.println("napisalem");
        writer.close();
        System.out.println("zamknałem");


    }
}
