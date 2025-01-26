package ecommerce;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseEcommerce {
    public UiAutomator2Options options;
    public AndroidDriver driver;
    @BeforeClass
    public void setup() throws MalformedURLException {
        options=new UiAutomator2Options();
        options.setDeviceName("MyPhone");
        options.setApp("D:\\AppiumTrain\\src\\main\\resources\\General-Store.apk");

        driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public void scrollDown(WebElement ele){
        ((JavascriptExecutor)driver).executeScript("mobile: ",
                ImmutableMap.of("","",
                        "",""));
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
