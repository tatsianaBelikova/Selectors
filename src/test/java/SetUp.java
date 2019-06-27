import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SetUp extends Config {

    public SetUp(WebDriver driver) {

        super(driver);
    }
    public SetUp() {

    }

    public void waiting (WebElement element) {
        org.openqa.selenium.support.ui.WebDriverWait waiting = new WebDriverWait(driver, 10);
        waiting.until(ExpectedConditions.elementToBeClickable(element));

    }
}
