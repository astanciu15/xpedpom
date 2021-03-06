import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.Home_Bundle_Save_Page;
import pages.Home_Cars;
import pages.Home_Cruises;
import pages.Home_Things_to_Do;

import java.util.concurrent.TimeUnit;

public class TestBase {
    private WebDriver driver;
    protected Home_Bundle_Save_Page homeBundleSavePage;
    protected Home_Cars homeCars;
    protected Home_Cruises homeCruises;
    protected Home_Things_to_Do homeThingstoDo;
    protected Logger logger;


    @BeforeTest (groups = { "tag1" })
    public void setUp() {
        logger = LogManager.getLogger();
        logger.info("Executing setup");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        homeBundleSavePage = new Home_Bundle_Save_Page(driver, logger);
        homeCars = new Home_Cars(driver, logger);
        homeCruises = new Home_Cruises(driver, logger);
        homeThingstoDo = new Home_Things_to_Do(driver, logger);
    }

    @AfterTest (groups = { "tag1" })
    public void close() {
        logger.info("Test was executed.");
        driver.quit();
    }
}
