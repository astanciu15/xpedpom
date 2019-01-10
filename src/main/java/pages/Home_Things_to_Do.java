package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_Things_to_Do extends HomePage_Tabs {

    private By destination = By.id("activity-destination-hp-activity");
    private By fromDate = By.id("activity-start-hp-activity");
    private By toDate = By.id("activity-end-hp-activity");
    private By searchButton = By.xpath("(//div[5][@class='cols-nested ab25184-submit'])");


    public Home_Things_to_Do(WebDriver driver, Logger logger){
        super(driver, logger);
    }

    public Home_Things_to_Do enterDestination(String destination){
        enterText(this.destination, destination);
        logger.info("Enter destination: " + destination);
        return this;
    }

    private Home_Things_to_Do enterFromDate(String fromDate){
        enterText(this.fromDate, fromDate);
        return this;
    }

    private  Home_Things_to_Do enterToDate(String toDate){
        enterText(this.toDate, toDate);
        return this;
    }

    public void enterFromToDate(String fromDate, String toDate){
        enterFromDate(fromDate).enterToDate(toDate);
        logger.info("Entering from date: " + fromDate + ", and to date: " + toDate);
    }

    public void clickSearchButton() {
        clickButton(searchButton);
        logger.info("Click on Search button");
    }

}
