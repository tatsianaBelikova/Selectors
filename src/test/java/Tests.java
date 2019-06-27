import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tests extends Config  {


    @Before
    public void begin() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }


    @Test
    public void test1() {

        Actions actions = new Actions(driver);
        actions.OpenPage();
        actions.Login();
        actions.CreateProject();

        actions.OpenTestSpecification();
        actions.CreateTestSuit();
        actions.CreateTestCase();

    }


    @After
    public void End() {
        // driver.quit();
    }
}
