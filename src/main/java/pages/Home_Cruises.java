package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Home_Cruises extends HomePage_Tabs {

    private Select dropDestination;
    private Select dropDepartureMonth;
    private By goingTo = By.id("cruise-destination-hp-cruise");
    private By departureMonth = By.id("cruise-departure-month-hp-cruise");
    private By searchButton = By.xpath("(//button[@class='btn-primary btn-action gcw-submit ab14933'])");

    public Home_Cruises(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

    public Home_Cruises enterGoingTo(String goingTo) {
        dropDestination = new Select(driver.findElement(this.goingTo));
        dropDestination.selectByValue(goingTo);
        logger.info("Entering going to location: " + goingTo);
        return this;
    }

    public Home_Cruises enterDepartureMonth(String departureMonth) {
        waitForDOM(1000);
        dropDepartureMonth = new Select(driver.findElement(this.departureMonth));
        dropDepartureMonth.selectByValue(departureMonth);
        logger.info("Entering departure month: " + departureMonth);
        return this;
    }

    public void clickSearchButton() {
        clickButton(searchButton);
        logger.info("Click on Search button");
    }
}
