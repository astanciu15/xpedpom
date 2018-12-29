package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home_Bundle_Save_Page extends BasePage{

    By origin = By.id("package-origin-hp-package");
    By destination = By.id("package-destination-hp-package");
    By departingDate = By.id("package-departing-hp-package");
    By returningDate = By.id("package-returning-hp-package");
    By searchButton = By.id("search-button-hp-package");


    public Home_Bundle_Save_Page(WebDriver driver, WebDriverWait wait, Actions action){
        super(driver, wait, action);
    }
    public void enterOrigin(String origin){
        enterText(this.origin, origin);
    }

    public void enterDestination(String destination){
        enterText(this.destination, destination);
    }

    public void enterDepartingDate(String departingDate){
        enterText(this.departingDate, departingDate);
    }

    public void enterReturningDate(String returningDate){
        enterText(this.returningDate, returningDate);
    }

    public void clickSearchButton(){
        clickButton(this.searchButton);
    }

    public void navigateTo(){
        navigateToUrl("https://www.expedia.com/");
    }
}
