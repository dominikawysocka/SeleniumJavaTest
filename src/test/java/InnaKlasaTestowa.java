import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;
import java.util.Set;

public class InnaKlasaTestowa extends KlasaBazowa {


       // private WebDriver driver;



        @Test
        public void otherOpenTest() throws InterruptedException {


            driver.get("https://www.google.com/webhp?hl=pl&sa=X&ved=0ahUKEwiZpqGMj43vAhWl-ioKHbyJCCIQPAgI");

            driver.switchTo().frame(0);
            WebElement adreeButton = driver.findElement(By.id("introAgreeButton"));
            adreeButton.click();
            WebElement wpisywanka = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input"));
            wpisywanka.sendKeys("Marcinek");
            WebElement szukaj = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[3]/center/input[1]"));
            szukaj.click();
            WebElement linkacz = driver.findElement(By.xpath("//a[@href='http://marcinek.poznan.pl/']"));
            linkacz.click();

            String expectedTitle = "";
            Assert.assertEquals(driver.getTitle(), expectedTitle);


        }


        @Test
        public void googleOpenTest2() throws InterruptedException {

            driver.get("https://www.google.com");
            // driver.switchTo().frame(0);
            //WebElement adreeButton = driver.findElement(By.id("introAgreeButton"));
            // adreeButton.click();
            WebElement wpisywanka = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input"));
            wpisywanka.sendKeys("Marcinek");
            WebElement szukaj = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[3]/center/input[1]"));
            szukaj.sendKeys(Keys.ENTER);
            WebElement linkacz = driver.findElement(By.xpath("//a[@href='http://marcinek.poznan.pl/']"));
            linkacz.click();

            String expectedTitle = "";
            Assert.assertEquals(driver.getTitle(), expectedTitle);



        }


        private void switchToNewWindow(final WebDriver driver, final String currentWindowName) {

            Set<String> windows = driver.getWindowHandles();

            for (String window : windows) {
                if (!window.equals(currentWindowName)) {
                    driver.switchTo().window(window);
                    System.out.println(driver.getCurrentUrl());
                }
            }

        }

        public boolean checkIfElementExist(By locator, WebDriver driver) {

            return driver.findElements(locator).size() > 0;
        }

        public void checkIfElementExist(WebDriver driver, By locator) {
            try {
                driver.findElements(locator);
                System.out.println("jest");
            } catch (NoSuchElementException exc) {
                System.out.println("Ni maaa");

            }

        }


    }





