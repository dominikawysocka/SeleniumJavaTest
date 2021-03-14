import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class DragAndDrop extends KlasaBazowa {

    @Test
    public void dragAndDropTest() {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement agreeCookies = driver.findElement(By.id("onetrust-accept-btn-handler"));
        agreeCookies.click();


        WebElement duzeKolko = driver.findElement(By.id("droptarget"));
        WebElement maleKolko = driver.findElement(By.id("draggable"));
        Actions drop = new Actions(driver);
        drop.dragAndDrop(maleKolko,duzeKolko).build().perform();

    }


}
