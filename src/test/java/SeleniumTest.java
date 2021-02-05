import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {

    public static void main(String[] args) {
//System.setProperty("webdriver.chrome.driver","E:/TesterOprogramowania/Selenium/selenium jars and drivers/drivers/chromeDriver/chromeDriver.exe");
                WebDriver driver = new ChromeDriver();
    }

    @Test
    public void simpleTest(){
        System.out.println("hello");
    }
}
