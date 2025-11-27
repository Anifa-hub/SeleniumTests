package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DisappearingElementsPage {
    private WebDriver driver;
    private By links = By.tagName("li");

    public DisappearingElementsPage(WebDriver driver){
        this.driver = driver;
    }

    public void getlinks(){
      List<WebElement> totalLinks = driver.findElements(links);
        System.out.println(totalLinks.size());
    }



}
