package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    WebDriver driver;
    WebDriverWait wait;
    Actions action;

    public BasePage(WebDriver driver, WebDriverWait wait, Actions action){
        this.driver = driver;
        this.wait = wait;
        this.action = action;
    }

    public void enterText(By by, String text){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(by).sendKeys(Keys.chord(Keys.CONTROL, "a"), text);
        clickElsewhere();
    }

    public void clickButton(By by){
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }

    public void clickElsewhere(){
        action.moveByOffset(1,1).click().build().perform();
    }

    public void navigateToUrl(String url){
        driver.get(url);
    }
}
