import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import java.sql.SQLOutput;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class FirstSeleniumTest {

    @Test
    public void googleOpenTest() throws InterruptedException {

        String driverPath = "E://ProjektyzProgramowania//tutorialselenium//src//main//executables//drivers//chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);

        // Dimension dimension = new Dimension(1000, 650);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //driver.get("E://ProjektyzProgramowania//tutorialselenium//src//main//potrzebneMaterialy//Test.html");
        driver.get("https://www.google.com/webhp?hl=pl&sa=X&ved=0ahUKEwiZpqGMj43vAhWl-ioKHbyJCCIQPAgI");
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
//        WebElement topSicretElement = driver.findElement(By.className("topSecret"));
//        if(topSicretElement.isDisplayed()) {
//            System.out.println(topSicretElement.getText());
//        }
//        else
//            System.out.println(topSicretElement.getAttribute("textContent"));

        //Sprawdzenie czy element istnieje
//        boolean exist = checkIfElementExist(By.cssSelector("#fname"), driver);
//        checkIfElementExist(driver,By.cssSelector("#fname"));
//        System.out.println(exist);

//        WebElement clickMe = driver.findElement(By.cssSelector("#newPage"));
//        String currentWindowName = driver.getWindowHandle();
//        clickMe.click();
//        Thread.sleep(1000);
//        switchToNewWindow(driver, currentWindowName);
//        driver.switchTo().frame(0);
//        WebElement adreeButton = driver.findElement(By.id("introAgreeButton"));
//        adreeButton.click();
//       // switchToNewWindow(driver, currentWindowName);
//        driver.close();
//        driver.switchTo().window(currentWindowName);
//        driver.findElement(By.name("username")).sendKeys("ss");


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
       // System.out.println("tytuł: " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(),expectedTitle);

        driver.quit();
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



