package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_Cars extends HomePage_Tabs {

    private By pickingUp = By.id("car-pickup-hp-car");
    private By droppingOff = By.id("car-dropoff-hp-car");
    private By pickupDate = By.id("car-pickup-date-hp-car");
    private By pickupTime = By.id("car-pickup-time-hp-car");
    private By dropoffDate = By.id("car-dropoff-date-hp-car");
    private By dropoffTime = By.id("car-dropoff-time-hp-car");
    //private By searchButton = By.xpath("(//button[@class='btn-primary btn-action gcw-submit']/span[contains(text(), 'Search')])[3]");
    private By searchButton = By.xpath("(//button[@class='btn-primary btn-action gcw-submit']/span[text()='Search'])[3]");
    private By aarpCheckbox = By.id("aarp-car-rates-check-hp-car");


    public Home_Cars(WebDriver driver) {
        super(driver);
    }

    public void checkAarpCheckbox() {
        checkCheckbox(aarpCheckbox);
        waitForDOM(5000);
    }

    public void uncheckAarpCheckbox(){
        uncheckCheckbox(aarpCheckbox);
        waitForDOM(5000);
    }

}
