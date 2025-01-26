import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwipeDemo extends BaseTest {

    @Test
    public void swipeTest(){
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
        driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
        WebElement firstImage=driver.findElement(AppiumBy.
                xpath("//android.widget.ImageView[1]"));
        Assert.assertEquals(firstImage.
                getDomAttribute("focusable"),"true");

        //swipe
        swipe(firstImage,"left");
        WebElement firstImage1=driver.findElement(AppiumBy.
                xpath("//android.widget.ImageView[1]"));
        Assert.assertEquals(firstImage1.
                getDomAttribute("focusable"),"false");


    }
}
