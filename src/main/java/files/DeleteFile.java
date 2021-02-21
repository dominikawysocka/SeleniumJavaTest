package files;

import java.io.File;

public class DeleteFile {

    public static void main(String[] args) {

        File file = new File("E://ProjektyzProgramowania//tutorialselenium//src//main//java//text");
        if(file.delete()){
            System.out.println("usuniety");
        }
        else{
            System.out.println("nie udalo sie");
        }
    }
}
