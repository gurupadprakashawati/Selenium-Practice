package automationbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.net.URL;

public class BasicProgram {
    public static void main(String[] args) {
        // ChromeBrowser
        // WebDriver chrome = new ChromeDriver();
        //chrome.get("https://www.google.com");
        // Edge Browser
        WebDriver edge = new EdgeDriver();
        // edge.get("https://www.google.com");
        edge.close();
        edge.navigate().to("https://login.salesforce.com/");
        edge.navigate().refresh();

        edge.findElement(By.id("username")).sendKeys("Guru");
        //edge.findElement(By.id("password")).sendKeys("123" );
        edge.findElement(By.name("pw")).sendKeys("12345");
        edge.findElement(By.id("Login")).click();
        //edge.close();
    }
}
