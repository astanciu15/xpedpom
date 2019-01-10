package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage_Tabs extends BasePage {
    private By bundleAndSaveTab = By.id("tab-package-tab-hp");
    private By carsTab = By.id("tab-car-tab-hp");
    private By cruisesTab = By.id("tab-cruise-tab-hp");
    private By thingsToDoTab = By.id("tab-activity-tab-hp");

    public HomePage_Tabs(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

    public void navigateToBasePage() {
        navigateToUrl("https://www.expedia.com/");
    }

    public void clickBundleAndSaveTab() {
        clickButton(bundleAndSaveTab);
        logger.info("Click on Bundle and Save tab.");
    }

    public void clickCarsTab() {
        clickButton(carsTab);
        logger.info("Click on Cars tab.");
    }

    public void clickCruisesTab() {
        clickButton(cruisesTab);
        logger.info("Click on Cruises tab.");
    }

    public void clickThingsToDoTab() {
        clickButton(thingsToDoTab);
        logger.info("Click on Things to Do tab.");
    }

}
