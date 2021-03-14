import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DoubleClick extends KlasaBazowa {

    @Test
    public void doubleClickTest(){

        driver.get("E:/ProjektyzProgramowania/tutorialselenium/src/main/potrzebneMaterialy/DoubleClick.html");
        WebElement button = driver.findElement(By.id("bottom"));
        Actions doubleClick = new Actions(driver);
        doubleClick.doubleClick(button).build().perform();
        Assert.assertTrue(driver.getWindowHandles().size() > 1);
    }


}

