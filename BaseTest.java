//{
//        "appium:deviceName": "NitishPhone",
//        "platformName": "Android",
//        "appium:automationName": "UiAutomator2",
//        "appium:app": "D:\\AppiumTrain\\src\\main\\resources\\ApiDemos-debug.apk"
//        }


import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {
    public UiAutomator2Options options;
    public AndroidDriver driver;
    @BeforeClass
    public void setup() throws MalformedURLException {
        //        AppiumDriverLocalService service=new AppiumServiceBuilder().
//                withAppiumJS(new File("C:\\Users\\Nitish.Sahoo\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).
//                withIPAddress("127.0.0.1").usingPort(4723).build();
//
//                  service.start();

         options=new UiAutomator2Options();
        options.setApp("D:\\AppiumTrain\\src\\main\\resources\\ApiDemos-debug.apk");
        options.setDeviceName("MyPhone");
        options.setPlatformName("Android");
        driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public void longPress(WebElement ele){
        ((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
                ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
                        "duration",2000));
    }

    public void swipe(WebElement ele,String direction){
        ((JavascriptExecutor)driver).executeScript("mobile: swipeGesture",
                ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
                        "direction",direction,
                        "percent",0.75));
    }

    public void dragDrop(WebElement source,int x,int y){
        ((JavascriptExecutor)driver).executeScript("mobile: dragGesture",
                ImmutableMap.of
                        ("elementId",((RemoteWebElement)source).getId(),
                                "endX",x,
                                "endY",y));
    }

    @AfterClass
    public void tearDown(){

        driver.quit();
    }
}
