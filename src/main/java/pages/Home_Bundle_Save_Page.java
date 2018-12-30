package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_Bundle_Save_Page extends BasePage {

    private By origin = By.id("package-origin-hp-package");
    private By destination = By.id("package-destination-hp-package");
    private By departingDate = By.id("package-departing-hp-package");
    private By returningDate = By.id("package-returning-hp-package");
    private By searchButton = By.id("search-button-hp-package");

    public Home_Bundle_Save_Page(WebDriver driver) {
        super(driver);
    }

    public void enterOrigin(String origin) {
        enterText(this.origin, origin);
    }

    public void enterDestination(String destination) {
        enterText(this.destination, destination);
    }

    public void enterDepartingDate(String departingDate) {
        enterText(this.departingDate, departingDate);
    }

    public void enterReturningDate(String returningDate) {
        enterText(this.returningDate, returningDate);
    }

    public void clickSearchButton() {
        clickButton(this.searchButton);
    }

    public void navigateTo() {
        navigateToUrl("https://www.expedia.com/");
    }
}
