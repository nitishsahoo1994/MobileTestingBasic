import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

public class ScrollDemo extends BaseTest {

    @Test
    public void scrollDemo(){
        
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.
                findElement(AppiumBy.
                        androidUIAutomator("new UiScrollable(new UiSelector())." +
                                "scrollIntoView(text(\"ScrollBars\"))"));


    }
}
