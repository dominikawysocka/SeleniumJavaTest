import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class FirstSeleniumTest {

    @Test
    public void googleOpenTest() {

        String driverPath = "E://ProjektyzProgramowania//tutorialselenium//src//main//executables//drivers//chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);

        // Dimension dimension = new Dimension(1000, 650);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("E://ProjektyzProgramowania//tutorialselenium//src//main//potrzebneMaterialy//Test.html");
        WebElement firstNameInput = driver.findElement(By.id("fname"));
        WebElement name = driver.findElement(By.name("username"));
        WebElement linkTeskt = driver.findElement(By.linkText("Visit W3Schools.com!"));
        WebElement linkTesktPoKawalku = driver.findElement(By.partialLinkText("Visit W3Schools"));
        WebElement searchByClass = driver.findElement(By.className("topSecret"));
        WebElement searchByTag = driver.findElement(By.tagName("input"));


        WebElement clickOnMe = driver.findElement(By.cssSelector("#clickOnMe"));
        WebElement link = driver.findElement(By.cssSelector("a"));
        WebElement topSecret = driver.findElement(By.cssSelector(".topSecret"));
        WebElement table = driver.findElement(By.cssSelector("td:first-child"));


        WebElement clickOnMeXpath = driver.findElement(By.xpath("/html/body/button"));
        WebElement clickOnMeXpath1 = driver.findElement(By.xpath("//button"));
        WebElement linkXpath = driver.findElement(By.xpath("//a"));
        WebElement linkText = driver.findElement(By.xpath("//a[text()='Visit W3Schools.com!']"));
        WebElement classXpath = driver.findElement(By.xpath("//p[@class='topSecret']"));
        WebElement classXpath2 = driver.findElement(By.xpath("//*[@class='topSecret']"));




        //driver.quit();
    }


}
