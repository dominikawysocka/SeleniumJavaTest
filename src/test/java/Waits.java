import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class Waits extends KlasaBazowa {

    @Test
    public void waits() {

        //driver.manage().timeouts().implicitlyWait(21, TimeUnit.SECONDS); //lepsze niż thread.sleep, bo jak nie może znaleźć elementu/coś sie nie zgadza, to wtedy czeka X czasu
        driver.get("E://ProjektyzProgramowania//tutorialselenium//src//main//potrzebneMaterialy//Waits2.html");
        driver.findElement(By.id("clickOnMe")).click();
        waitForWebElement(By.tagName("p"));
        //Thread.sleep(5005); // NIECACY METODA - NIEBEZPIECZNA
        WebElement paragraf = driver.findElement(By.tagName("p"));
        // Assert.assertTrue(driver.findElement(By.tagName("p")).getText().equals("Dopiero się pojawiłem!"));
        assertEquals(paragraf.getText(), "Dopiero się pojawiłem!");
    }

    private void waitForWebElement(By location) {
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.pollingEvery(Duration.ofMillis(500)); //pinguje czy już jest
        wait.withTimeout(Duration.ofSeconds(10L));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(location));
    }

}
