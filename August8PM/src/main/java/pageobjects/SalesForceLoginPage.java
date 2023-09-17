package pageobjects;

import org.openqa.selenium.By;
import reusable.BaseCode;

public class SalesForceLoginPage extends BaseCode {
    public static void enterUserName(String username){
        //driver.findElement(By.id("username")).sendKeys(username);
        //Xpath - regular expression for Dynamic element
       // driver.findElement(By.xpath("//div[@id='username_container']/child::input[1]")).sendKeys(password);
    }

    public static void enterPassword(String password){
        driver.findElement(By.id("password")).sendKeys(password);

    }

    public static void clickLoginButton(){
        driver.findElement(By.id("Login")).click();

    }

    public static String getErrorMessage(){ //return actual result with String instead void //Void will not return
        String actualResult = driver.findElement(By.id("error")).getText();
        return actualResult;
    }
}
