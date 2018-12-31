package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage_Tabs extends BasePage{
    private By bundleAndSaveTab = By.id("tab-package-tab-hp");
    private By carsTab = By.id("tab-car-tab-hp");

    public HomePage_Tabs(WebDriver driver) {
        super(driver);
    }

    public void navigateToBasePage() {
        navigateToUrl("https://www.expedia.com/");
    }

    public void clickToBundleAndSaveTab(){
        clickButton(bundleAndSaveTab);
    }

    public void clickCarsTab(){
        clickButton(carsTab);
    }

}
