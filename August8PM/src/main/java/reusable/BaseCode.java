package reusable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseCode {
    public static WebDriver driver;// = new ChromeDriver(); // reuse any packages
    public static void browserInvocation(){

        //driver = new ChromeDriver();
        driver = new EdgeDriver();
        //driver.close();
        //driver.navigate().to("https://login.salesforce.com/");
        driver.navigate().to("https://www.amazon.in/");
        driver.manage().window().maximize();
    }
}
