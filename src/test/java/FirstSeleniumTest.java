import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import java.sql.SQLOutput;
import java.util.List;

public class FirstSeleniumTest {

    @Test
    public void googleOpenTest() {

        String driverPath = "E://ProjektyzProgramowania//tutorialselenium//src//main//executables//drivers//chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);

        // Dimension dimension = new Dimension(1000, 650);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("E://ProjektyzProgramowania//tutorialselenium//src//main//potrzebneMaterialy//Test.html");
//        WebElement firstNameInput = driver.findElement(By.id("fname"));
//        WebElement name = driver.findElement(By.name("username"));
//        WebElement linkTeskt = driver.findElement(By.linkText("Visit W3Schools.com!"));
//        WebElement linkTesktPoKawalku = driver.findElement(By.partialLinkText("Visit W3Schools"));
//        WebElement searchByClass = driver.findElement(By.className("topSecret"));
//        WebElement searchByTag = driver.findElement(By.tagName("input"));
//
//        //cssSelector
//        WebElement clickOnMe = driver.findElement(By.cssSelector("#clickOnMe"));
//        WebElement link = driver.findElement(By.cssSelector("a"));
//        WebElement topSecret = driver.findElement(By.cssSelector(".topSecret"));
//        WebElement table = driver.findElement(By.cssSelector("td:first-child"));
//
//        //xpath
//        WebElement clickOnMeXpath = driver.findElement(By.xpath("/html/body/button"));
//        WebElement clickOnMeXpath1 = driver.findElement(By.xpath("//button"));
//        WebElement linkXpath = driver.findElement(By.xpath("//a"));
//        WebElement linkText = driver.findElement(By.xpath("//a[text()='Visit W3Schools.com!']"));
//        WebElement classXpath = driver.findElement(By.xpath("//p[@class='topSecret']"));
//        WebElement classXpath2 = driver.findElement(By.xpath("//*[@class='topSecret']"));

        //pobranie listy elementów
//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        //System.out.println("Znaleziono " + links.size() + " linków");
//
//        WebElement clickOnMeButtonCss = driver.findElement(By.cssSelector("#clickOnMe"));
//        WebElement clickOnMeButtonxPath = driver.findElement(By.xpath("//*[@id=\'clickOnMe\']"));


//        WebElement clickOnMe = driver.findElement(By.id("clickOnMe"));
//        clickOnMe.click();
        //Obsługa alertu
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
//
        // Wstawianie wartości do pola
//        WebElement firstName = driver.findElement(By.xpath("//input[@id='fname']"));
//        firstName.sendKeys("Dominiczka");
//        firstName.clear();
//        firstName.sendKeys("Marcinek");

//        Select carSelect = new Select(driver.findElement(By.tagName("select")));
//        carSelect.selectByIndex(2);
//        carSelect.selectByValue("mercedes");


//        WebElement tekst = driver.findElement(By.name("username"));
//        String coTamJest = tekst.getAttribute("value");
//        System.out.println(coTamJest);

//        WebElement tekst1 = driver.findElement(By.xpath("//input[@type='checkbox']"));
//        //String coTamJest = tekst1.getText();
//        System.out.println(tekst1.getText());

        //Pobranie tekstu z elementu / sprawdzenie zaznaczenia checkboxa
//        WebElement checkboxes = driver.findElement(By.xpath("//input[@id='checkbox']"));
//       // checkboxes.click();
//        if(checkboxes.isSelected()) {
//            System.out.println("zaznaczony");
//        }
//        else{
//            System.out.println("nie zaznaczony");
//        }
//        String x = checkboxes.getText();
//        System.out.println(x);

//        WebElement radiobutton = driver.findElement(By.xpath("//input[@value='female']"));
//        radiobutton.click();

        // Pobranie tektu z ukrytego elementu
//        WebElement hidden = driver.findElement(By.cssSelector(".topSecret"));
//        System.out.println(hidden.getAttribute("textContent"));

        //Sprawdzenie czy obrazek się załadował prawidłowo
//        WebElement image = driver.findElement(By.id("smileImage"));
//        System.out.println(image.getSize());
//        System.out.println(image.getAttribute("naturalHeight"));

        //Sprawdzenie czy element jest edytowalny
//        WebElement firstElement = driver.findElement(By.cssSelector("#fname"));
//        if(firstElement.isEnabled())
//        firstElement.sendKeys("Dominiczka");

        //Sprawdzenie czy jest widoczny
        WebElement topSicretElement = driver.findElement(By.className("topSecret"));
        if(topSicretElement.isDisplayed()) {
            System.out.println(topSicretElement.getText());
        }
        else
            System.out.println(topSicretElement.getAttribute("textContent"));





        //driver.quit();
    }


}
