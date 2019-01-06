import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Home_Bundle_Save_Page;
import pages.Home_Cars;

import java.util.concurrent.TimeUnit;

public class TestBase {
    private WebDriver driver;
    protected Home_Bundle_Save_Page homeBundleSavePage;
    protected Home_Cars homeCars;
    protected Logger logger;


    @Before
    public void setUp() {
        logger = LogManager.getLogger();
        logger.info("Executing setup");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        homeBundleSavePage = new Home_Bundle_Save_Page(driver, logger);
        homeCars = new Home_Cars(driver, logger);
    }

    @After
    public void close() {
        logger.info("Test was executed.");
        driver.quit();
    }
}
