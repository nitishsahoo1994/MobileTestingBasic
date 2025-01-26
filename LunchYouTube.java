import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.Activity;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class LunchYouTube extends BaseTest{
    @Test
    public void lunchYoutube(){
        Activity act=new Activity("com.google.android.youtube","com.google.android.apps.youtube.app.watchwhile.InternalMainActivity");

        ((JavascriptExecutor)driver).executeScript("mobile: startActivity",
                ImmutableMap.of("intent","com.google.android.youtube/com.google.android.apps.youtube.app.watchwhile.InternalMainActivity"));
    }

}
