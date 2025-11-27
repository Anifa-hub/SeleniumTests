package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public DisappearingPage clickDisappearing(){
        clickLink("Disappearing Elements");
        return new DisappearingPage(driver);
    }
    public void clickDynamicLoadingPage(){
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(By.linkText("Dynamic Loading"))).perform();
    }

    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }


}
