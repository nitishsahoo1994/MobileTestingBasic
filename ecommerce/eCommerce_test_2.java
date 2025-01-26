package ecommerce;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class eCommerce_test_2 extends BaseEcommerce{

    @Test
    public void scrollingProduct() throws InterruptedException {
        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).
                  sendKeys("Nitish Kumar Sahoo");

        driver.hideKeyboard();

        driver.findElement(AppiumBy.xpath("//android.widget.RadioButton[@text='Female']")).click();

        driver.
                findElement(AppiumBy.xpath("//android.widget.RadioButton[@text='Male']"))
                .click();

        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();

        driver.
                findElement(AppiumBy.
                        androidUIAutomator("new UiScrollable(new UiSelector())." +
                                "scrollIntoView(text(\"Jordan 6 Rings\"))"));

        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Jordan 6 Rings']//following-sibling::android.widget.LinearLayout//child::android.widget.TextView[@text='ADD TO CART']")).click();


        //2nd way
//        int count=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
//        System.out.println(count);
//
//        for (int i=0;i<count;i++){
//            String productName=driver.findElements
//                            (AppiumBy.id("com.androidsample.generalstore:id/productName")).get(i)
//                    .getText();
//            if(productName.equalsIgnoreCase("Jordan 6 Rings")){
//                driver.findElements(AppiumBy.id("com.androidsample.generalstore:id/productAddCart")).
//                        get(i).click();
//            }
//        }
        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
        Thread.sleep(2000);
    }
}
