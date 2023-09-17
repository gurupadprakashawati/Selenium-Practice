package pageobjects;

import org.openqa.selenium.By;
import reusable.BaseCode;

import java.sql.Driver;

public class AmazonSignInPage extends BaseCode {
    public static void enterMailId(String mailId){
        driver.findElement(By.id("ap_email")).sendKeys(mailId);
    }
    public static void clickOnContinue(){
        driver.findElement(By.xpath("//span[@id='continue']")).click();
    }
    public static void enterPassword(String password){
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
    }

    public static void clickOnSignInButton(){
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
    }


}
