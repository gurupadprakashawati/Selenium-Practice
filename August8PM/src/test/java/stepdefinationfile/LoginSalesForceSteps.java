package stepdefinationfile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pageobjects.SalesForceLoginPage;

public class LoginSalesForceSteps {

    //WebDriver driver = new EdgeDriver();

    @Given("user navigates to sales force application")
    public void launchUrl(){
       //driver.navigate().to("https://login.salesforce.com/");
        //driver.manage().window().maximize();
        SalesForceLoginPage.browserInvocation();


    }
    @And("user clicks on login button")
    public void clickLogin(){
        SalesForceLoginPage.clickLoginButton();

    }
    @Then("user should navigate to homepage")
    public void homePage() {

    }
    @Then("user validate the error message")
    public void errorMessage(){
        //SalesForceLoginPage.getErrorMessage();
        String expectedResult = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
     if(SalesForceLoginPage.getErrorMessage().equals(expectedResult)) {
         System.out.println("Valid error message");
     }
     else {
         System.out.println("Not valid");
     }
    }
    @When("user enters the username {string} and password {string}")
    public void enterUserNameAndPassword(String userName, String password){
        SalesForceLoginPage.enterUserName(userName);
        SalesForceLoginPage.enterPassword(password);

    }



}
