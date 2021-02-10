import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeleniumTest {

    public static void main(String[] args) {
//System.setProperty("webdriver.chrome.driver","E:/TesterOprogramowania/Selenium/selenium jars and drivers/drivers/chromeDriver/chromeDriver.exe");
        // WebDriver driver = new ChromeDriver();

        Prostokat pro1 = new Prostokat(1, 2);
        Kwadrat kwa1 = new Kwadrat(1);
        Trojkat tro1 = new Trojkat(1, 2, 3);
        Prostokat pro2 = new Prostokat(3, 4);

        List<Figura> lista = new ArrayList<>();
        lista.add(pro1);
        lista.add(kwa1);
        lista.add(tro1);
        lista.add(pro2);

        List<Figura> lista1 = Arrays.asList(pro1, kwa1, tro1);

        for (Figura figura : lista) {
            figura.display();
        }

        for (final Figura fig : lista) {
            fig.display();
        }

    }

    @Test
    public void simpleTest() {

        System.out.println("hello");
    }
}
