import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;
import pages.Home_Bundle_Save_Page;

import java.util.concurrent.TimeUnit;

public class RoughTest {

    WebDriver driver;
    WebDriverWait wait;
    Actions action;
    Home_Bundle_Save_Page homeBundleSavePage;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        action = new Actions(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        homeBundleSavePage = new Home_Bundle_Save_Page(driver, wait, action);
    }

    @Test
    public void testMethod(){
        homeBundleSavePage.navigateTo();
        homeBundleSavePage.enterOrigin("Luqa, Malta (MLA-Malta Intl.)");
        homeBundleSavePage.enterDestination("Bucharest, Romania");
        homeBundleSavePage.enterDepartingDate("03/11/2019");
        homeBundleSavePage.enterReturningDate("03/17/2019");
        homeBundleSavePage.clickSearchButton();
    }

    @After
    public void close(){
    driver.quit();
    }

}
