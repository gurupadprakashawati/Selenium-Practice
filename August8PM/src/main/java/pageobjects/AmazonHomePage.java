package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import reusable.BaseCode;

public class AmazonHomePage extends BaseCode {

    private static WebElement categoryElement = driver.findElement(By.id("searchDropdownBox"));

    public static void enterSearchKeyword(String productName){
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);

    }
    public static void clickSearchButton(){
        driver.findElement(By.id("nav-search-submit-button")).click();

    }

    public static void clickSignInButton(){
        driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();

    }
    public static void clicksOnSortByFeatured(){
        driver.findElement(By.xpath("//span[@class='a-dropdown-label']")).click();
    }
    public static void clicksOnSortByFeaturedDropdownValue(){
        driver.findElement(By.id("s-result-sort-select_2")).click();
        //driver.findElement(By.xpath("//li[text()='Newest Arrivals']")).click();e

    }

    public static void handleByIndex(int index){
        //WebElement categoryElement = driver.findElement(By.id("searchDropdownBox"));
        Select category = new Select(categoryElement);
        category.selectByIndex(index); // by index
    }

    public static int getDropdownSize(){
        //WebElement categoryElement = driver.findElement(By.id("searchDropdownBox"));
        int categorySize = categoryElement.findElements(By.tagName("option")).size();
        return categorySize;
    }

    public static String getDropdownValue(int index){
        String val = categoryElement.findElements(By.tagName("option")).get(index).getText();
        return val;

    }

}
