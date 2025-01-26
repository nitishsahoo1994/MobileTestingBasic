package ecommerce;

import com.beust.ah.A;
import io.appium.java_client.AppiumBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class eCommerce_test_3 extends BaseEcommerce{

    @Test
    public void validateTotalamount(){

        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).
                sendKeys("Nitish Kumar Sahoo");

        driver.hideKeyboard();

        driver.findElement(AppiumBy.xpath("//android.widget.RadioButton[@text='Female']")).click();

        driver.
                findElement(AppiumBy.xpath("//android.widget.RadioButton[@text='Male']"))
                .click();


        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();

        //air jordan 4
        String air_jordan_4=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Air Jordan 4 Retro']//following-sibling::android.widget.LinearLayout//child::android.widget.TextView[1]")).getText().replace("$","");
        double air_4=Double.parseDouble(air_jordan_4);
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Air Jordan 4 Retro']//following-sibling::android.widget.LinearLayout//child::android.widget.TextView[@text='ADD TO CART']")).click();

        //Air Jordan 1 Mid SE
        String air_Jordan_1_price=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Air Jordan 1 Mid SE']//following-sibling::android.widget.LinearLayout//child::android.widget.TextView[1]")).getText().replace("$","");
        double air_1=Double.parseDouble(air_Jordan_1_price);
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Air Jordan 1 Mid SE']//following-sibling::android.widget.LinearLayout//child::android.widget.TextView[@text='ADD TO CART']")).click();


       double actualPrice=air_1+air_4;

        //click on go to cart
        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

        String totalprice=driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains(@text,'Total Purchase Amount')]//following-sibling::android.widget.TextView")).getText().replace("$ ","");
        double totalPriceDou=Double.parseDouble(totalprice);
        Assert.assertEquals(totalPriceDou,actualPrice);
        //System.out.println(totalprice);
    }
}
