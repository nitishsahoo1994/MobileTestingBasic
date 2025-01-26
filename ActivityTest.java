import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.Activity;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class ActivityTest extends BaseTest {
    @Test
    public void activityStart() throws InterruptedException {
        Activity act=new Activity(" io.appium.android.apis","io.appium.android.apis.preference.PreferenceDependencies");

        ((JavascriptExecutor)driver).executeScript("mobile: startActivity",
                ImmutableMap.of("intent","io.appium.android.apis/io.appium.android.apis.preference.PreferenceDependencies"));
        Thread.sleep(3000);

    }

}
