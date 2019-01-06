package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions action;
    protected Logger logger;

    protected BasePage(WebDriver driver, Logger logger) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.action = new Actions(driver);
        this.logger = logger;
    }

    protected void enterText(By by, String text) {
        waitForDOM(1000);
        driver.findElement(by).sendKeys(Keys.chord(Keys.CONTROL, "a"), text);
        clickElsewhere();
    }

    protected void clickButton(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }

    protected void clickElsewhere() {
        action.moveByOffset(1, 1).click().build().perform();
    }

    protected void navigateToUrl(String url) {
        driver.get(url);
    }

    protected void waitForDOM(int waitMs) {
        try {
            Thread.sleep(waitMs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected void checkCheckbox(By by) {
        if (!driver.findElement(by).isSelected()) {
            driver.findElement(by).click();
        }
    }

    protected void uncheckCheckbox(By by) {
        if (driver.findElement(by).isSelected()) {
            driver.findElement(by).click();
        }
    }
}
