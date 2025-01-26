import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.annotation.ElementType;


public class AppiumBasic extends BaseTest {

    @Test
    public void wifiSetting()  {

        //click on preference
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();

        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
        driver.findElement(AppiumBy.id("android:id/checkbox")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.ListView[@resource-id='android:id/list']/android.widget.LinearLayout[2]")).click();
        String text=driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
        Assert.assertEquals(text, "WiFi settings");
        driver.findElement(AppiumBy.id("android:id/edit")).sendKeys("NitishWifi");
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.pressKey(new KeyEvent(AndroidKey.HOME));

    }



}
