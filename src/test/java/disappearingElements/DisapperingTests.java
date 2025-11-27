package disappearingElements;

import base.BaseTests;
import org.testng.annotations.Test;

public class DisapperingTests extends BaseTests {
    @Test

    public void testDisappearingElements(){
        var disapear = homePage.clickDisappearing();
        disapear.getlinks();
    }

    @Test
    public void backToHome (){
//        homePage.clickDisappearing();
//       getWindowManager().goBack();
       homePage.clickDynamicLoadingPage();
        getWindowManager().switchToDynamicLoading("dynamic_loading");
    }
}
