import org.openqa.selenium.WebDriver;

public class Config {

    public Config (WebDriver driver) {

        this.driver = driver;
    }
    public Config() {}

    public String url= "http://localhost:8080/testlink/index.php";
    protected   WebDriver driver;

    public String login = "user";
    public String password = "test";

    public String nameTestSuite_1 = "test Suite 1";
    public String nameCasePrefix = "otus_";



}
