import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;


public abstract class KlasaBazowa {

    protected WebDriver driver;
    //ustawienia początkowe
    @BeforeClass
    public void setup() {

        String driverPath = "E://ProjektyzProgramowania//tutorialselenium//src//main//executables//drivers//chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);

        // Dimension dimension = new Dimension(1000, 650);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @AfterClass
    public void tearDown() {
        //System.out.println("dupa");
        driver.quit();
    }

}


