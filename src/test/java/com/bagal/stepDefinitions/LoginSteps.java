package com.bagal.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    WebDriver driver;
    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        System.out.println("The user is on the login page");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("the user enters {string} as the username and {string} as the password")
    public void theUserEntersAsTheUsernameAndAsThePassword(String arg0, String arg1) {

    }

    @And("the user clicks on the login button")
    public void theUserClicksOnTheLoginButton() {
    }

    @Then("the user should be redirected to the dashboard")
    public void theUserShouldBeRedirectedToTheDashboard() {
    }

    @And("the user should see the {string} heading")
    public void theUserShouldSeeTheHeading(String arg0) {
    }
}
