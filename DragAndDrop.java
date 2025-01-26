import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDrop extends BaseTest {

    @Test
    public void dragDropTest(){
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
        WebElement source=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));

        dragDrop(source,718,664);

        String drpMsg=driver.
                findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text")).
                getText();
        Assert.assertEquals(drpMsg,"Dropped!");
    }
}
