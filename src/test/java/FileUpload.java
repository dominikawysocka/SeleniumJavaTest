import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;

public class FileUpload extends KlasaBazowa{


    @Test
    public void FileUploadTest(){

        driver.get("file:///E:/ProjektyzProgramowania/tutorialselenium/src/main/potrzebneMaterialy/FileUpload.html");
        WebElement buton = driver.findElement(By.id("myFile"));
        String path = new File("src/main/potrzebneMaterialy/test.png").getAbsolutePath();
        buton.sendKeys(path);


    }
}
