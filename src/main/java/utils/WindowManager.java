package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigation;

    public WindowManager(WebDriver driver){
        this.driver = driver;
        navigation = driver.navigate();
    }
    public void goBack(){
        navigation.back();
    }
    public void switchToDynamicLoading(String tabTittle){
        var windows =driver.getWindowHandles();
        for(String window : windows){

            driver.switchTo().window(window);
            if(tabTittle.equals(driver.getTitle())){
                break;
            }


        }
    }
}
