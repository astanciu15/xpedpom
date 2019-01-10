import listeners.TestSuiteListener;
import listeners.TestTestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestTestListener.class})
public class RoughTest extends TestBase {

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

    @Test
    public void testMethod3(){
        homeCruises.navigateToBasePage();
        homeCruises.clickCruisesTab();
        homeCruises.enterGoingTo("cuba");
        homeCruises.enterDepartureMonth("2019-09-01");
        homeCruises.clickSearchButton();
    }

    @Test
    public void testMethod4(){
        homeThingstoDo.navigateToBasePage();
        homeThingstoDo.clickThingsToDoTab();
        homeThingstoDo.enterDestination("Argentina, Spain");
        homeThingstoDo.enterFromToDate("05/15/2019", "05/20/2019");
        homeThingstoDo.clickSearchButton();
    }
}
