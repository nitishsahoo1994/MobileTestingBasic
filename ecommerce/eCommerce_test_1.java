package ecommerce;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class eCommerce_test_1 extends BaseEcommerce{

    @Test
    public void fillForm() throws InterruptedException {

            //driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();

            driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).
                   sendKeys("Nitish Kumar Sahoo");

            driver.hideKeyboard();
            Thread.sleep(2000);
            driver.findElement(AppiumBy.xpath("//android.widget.RadioButton[@text='Female']")).click();
            Thread.sleep(2000);
            driver.
                    findElement(AppiumBy.xpath("//android.widget.RadioButton[@text='Male']"))
                    .click();

            driver.findElement(AppiumBy.id("android:id/text1")).click();

            //scroll till India
            driver.
                findElement(AppiumBy.
                        androidUIAutomator("new UiScrollable(new UiSelector())." +
                                "scrollIntoView(text(\"India\"))"));

            driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='India']")).click();

            driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();

//            String toastmsg=driver.findElement(AppiumBy.xpath("//android.widget.Toast[1]")).getDomAttribute("name");
//            System.out.println(toastmsg);




    }
}
