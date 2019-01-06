package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Home_Cars extends HomePage_Tabs {

    Select pickupTimeSelect;
    Select dropoffTimeSelect;
    private By pickingUp = By.id("car-pickup-hp-car");
    private By droppingOff = By.id("car-dropoff-hp-car");
    private By pickupDate = By.id("car-pickup-date-hp-car");
    private By pickupTime = By.id("car-pickup-time-hp-car");
    private By dropoffDate = By.id("car-dropoff-date-hp-car");
    private By dropoffTime = By.id("car-dropoff-time-hp-car");
    private By searchButton = By.xpath("(//button[@class='btn-primary btn-action gcw-submit'])[3]");
    private By aarpCheckbox = By.id("aarp-car-rates-check-hp-car");


    public Home_Cars(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

    private Home_Cars enterPickingUp(String pickupLocation) {
        enterText(this.pickingUp, pickupLocation);
        return this;
    }

    private Home_Cars enterDroppingOff(String dropoffLocation) {
        enterText(this.droppingOff, dropoffLocation);
        return this;
    }

    public void enterPickupDropoffLocations(String pickupLocation, String dropoffLocation) {
        enterPickingUp(pickupLocation).enterDroppingOff(dropoffLocation);
    }

    private Home_Cars enterPickingUpDate(String pickupDate) {
        enterText(this.pickupDate, pickupDate);
        return this;
    }

    private Home_Cars enterDroppingOffDate(String dropOffDate) {
        enterText(this.dropoffDate, dropOffDate);
        return this;
    }

    public void enterPickupDropoffDates(String pickupDate, String dropoffDate) {
        enterPickingUpDate(pickupDate).enterDroppingOffDate(dropoffDate);
    }

    public void checkAarpCheckbox() {
        checkCheckbox(this.aarpCheckbox);
    }

    public void uncheckAarpCheckbox() {
        uncheckCheckbox(this.aarpCheckbox);
    }

    private Home_Cars selectPickupTime(String time) {
        pickupTimeSelect = new Select(driver.findElement(this.pickupTime));
        pickupTimeSelect.selectByValue(time);
        return this;
    }

    private Home_Cars selectDropoffTime(String time) {
        dropoffTimeSelect = new Select(driver.findElement(this.dropoffTime));
        dropoffTimeSelect.selectByValue(time);
        return this;
    }

    public void selectPickupDropoffTimes(String pickupTime, String dropoffTime) {
        selectPickupTime(pickupTime).selectDropoffTime(dropoffTime);
    }

    public void clickSearchButton() {
        clickButton(searchButton);
    }

}
