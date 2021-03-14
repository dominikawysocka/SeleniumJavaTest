import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalTime;

public class Screenshot {

    private WebDriver driver;

    public Screenshot(WebDriver newDriver) {
        this.driver = newDriver;

    }

    public void takeScreenshot() {
        TakesScreenshot screenhoter = (TakesScreenshot) driver;
        File screenshot = screenhoter.getScreenshotAs(OutputType.FILE);
        String path = "src/main/potrzebneMaterialy/test" + LocalTime.now().getNano() + ".png";
        try {
            Files.copy(screenshot.toPath(), Paths.get(path));
        } catch (IOException e) {
            System.out.println("bład kopiowania");
        }
    }
}
