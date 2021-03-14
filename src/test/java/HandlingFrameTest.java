import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class HandlingFrameTest extends KlasaBazowa {

    @Test
    public static void handlingFrameTest() {

        driver.get("file:///E:/ProjektyzProgramowania/tutorialselenium/src/main/potrzebneMaterialy/iFrameTest.html");
        driver.switchTo().frame(0);

        WebElement clickOnMeButton = driver.findElement(By.id("clickOnMe"));
        clickOnMeButton.click();
        driver.switchTo().alert().accept();
        List<WebElement> headers = driver.findElements(By.tagName("h1"));
        System.out.println(headers.size());
        Assert.assertEquals(headers.size(),1);

    }

}





