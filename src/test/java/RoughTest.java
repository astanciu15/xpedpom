import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Home_Bundle_Save_Page;
import pages.Home_Cars;

import java.util.concurrent.TimeUnit;

public class RoughTest {

    WebDriver driver;
    Home_Bundle_Save_Page homeBundleSavePage;
    Home_Cars homeCars;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        homeBundleSavePage = new Home_Bundle_Save_Page(driver);
        homeCars = new Home_Cars(driver);

    }

    @Test
    public void testMethod1() {
//        homeBundleSavePage.navigateTo();
//        homeBundleSavePage.enterOrigin("Luqa, Malta (MLA-Malta Intl.)");
//        homeBundleSavePage.enterDestination("Bucharest, Romania");
//        homeBundleSavePage.enterDepartingDate("03/11/2019");
//        homeBundleSavePage.enterReturningDate("03/17/2019");
//        homeBundleSavePage.clickSearchButton();
        homeBundleSavePage.navigateToBasePage();
        homeBundleSavePage
                .enterOrigin("Luqa, Malta (MLA-Malta Intl.)")
                .enterDestination("Bucharest, Romania")
                .enterDepartingDate("03/11/2019")
                .enterReturningDate("03/17/2019")
                .clickSearchButton();
    }

    @Test
    public void testMethod2() {
        homeCars.navigateToBasePage();
        homeCars.clickCarsTab();
        homeCars.enterPickupDropoffLocations("Malta, Montana", "New York, New York");
        homeCars.enterPickupDropoffDates("03/11/2019", "03/17/2019");
        homeCars.selectPickupDropoffTimes("0415AM", "0930PM");
        homeCars.checkAarpCheckbox();
        homeCars.clickSearchButton();
    }


    @After
    public void close() {
        driver.quit();
    }

}
