package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_Bundle_Save_Page extends HomePage_Tabs {

    private By origin = By.id("package-origin-hp-package");
    private By destination = By.id("package-destination-hp-package");
    private By departingDate = By.id("package-departing-hp-package");
    private By returningDate = By.id("package-returning-hp-package");
    private By searchButton = By.id("search-button-hp-package");

    public Home_Bundle_Save_Page(WebDriver driver, Logger logger) {
        super(driver, logger);
    }

    public Home_Bundle_Save_Page enterOrigin(String origin) {
        enterText(this.origin, origin);
        logger.info("Entering origin");
        return this;
    }

    public Home_Bundle_Save_Page enterDestination(String destination) {
        enterText(this.destination, destination);
        logger.info("Entering destination");
        return this;
    }

    public Home_Bundle_Save_Page enterDepartingDate(String departingDate) {
        enterText(this.departingDate, departingDate);
        return this;
    }

    public Home_Bundle_Save_Page enterReturningDate(String returningDate) {
        enterText(this.returningDate, returningDate);
        return this;
    }

    public Home_Bundle_Save_Page clickSearchButton() {
        clickButton(this.searchButton);
        return this;
    }


}
