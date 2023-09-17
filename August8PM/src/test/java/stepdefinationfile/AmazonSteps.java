package stepdefinationfile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pageobjects.AmazonHomePage;
import pageobjects.AmazonSignInPage;
import reusable.BaseCode;

public class AmazonSteps extends BaseCode {
    //WebDriver driver = new ChromeDriver(); // Global variable
    @Given("User navigates to Amazon page")
    public void Launch(){

        //BaseCode b new = BaseCode();
        //driver.navigate().to("https://www.amazon.in/");
        //driver.manage().window().maximize(); // To maximise the browser
        AmazonHomePage.browserInvocation();
    }

    @When("User enters the search word {string}")
    public void search(String search) {
        //driver.findElement(By.name("field-keywords")).sendKeys(search);
        AmazonHomePage.enterSearchKeyword(search);
    }

    @Then("Validate the search result")
    public void validateTheSearchResult() {
        //driver.findElement(By.id("nav-search-submit-button")).click();
    }

    @And("User clicks on Search Button")
    public void searchButton() {
        AmazonHomePage.clickSearchButton();
    }

    @When("User click the login menu")
    public void clickTheLoginButton() {
       AmazonHomePage.clickSignInButton();
    }

    @And("User enter the credentials")
    public void enterTheCredentials() {
        AmazonSignInPage.enterMailId("awati@gmail.com");
    }


    @And("User click on Continue button")
    public void clickOnContinueButton() {
        AmazonSignInPage.clickOnContinue();
    }

    @And("User enters the Password")
    public void entersThePassword() {
        AmazonSignInPage.enterPassword("123");
    }

    @And("User click on sign-in button")
    public void clickOnSignInButton() {
        AmazonSignInPage.clickOnSignInButton();


    }

    @Then("Validate error message")
    public void validateErrorMessage() {
    }


    @And("User clicks on Sort by featured")
    public void clicksOnSortByFeatured() {
        AmazonHomePage.clicksOnSortByFeatured();
    }

    @And("User clicks on Sort by featured dropdown value")
    public void clicksOnSortByFeaturedDropdownValue() {
        AmazonHomePage.clicksOnSortByFeaturedDropdownValue();

    }

    @When("User selects the category dropdown")
    public void selectCategory() {
        WebElement categoryElement = driver.findElement(By.id("searchDropdownBox"));
        //Select category = new Select(categoryElement);
        //category.selectByIndex(3); // by index
        //category.selectByVisibleText("Books"); // visible text from dropdown
       // category.selectByValue("search-alias=computers"); //user attribute value - recommended
        AmazonHomePage.handleByIndex(1);
        //int categorySize = categoryElement.findElements(By.tagName("option")).size();
        //AmazonHomePage.getDropdownSize();
        //categorySize
        for (int i = 0; i<AmazonHomePage.getDropdownSize(); i++){
            //String val = categoryElement.findElements(By.tagName("option")).get(i).getText();
            AmazonHomePage.getDropdownValue(i);
            System.out.println(AmazonHomePage.getDropdownValue(i));
        }
    }

    @Given("User clicks the baby wishlist")
    public void clicksTheBabyWishlist() {
        WebElement signInElement = driver.findElement(By.id("nav-link-accountList"));
        Actions a = new Actions(driver);
        a.clickAndHold(signInElement).build().perform();
        driver.findElement(By.linkText("Baby Wishlist")).click();
        //driver.findElement(By.partialLinkText("aby Wishlist")).click();
    }

    @Then("Verify user navigates to baby wishlist")
    public void verifyUserNavigatesToBabyWishlist() {

        Assert.assertEquals(  ": Baby Wish list", driver.getTitle());


    }
}
