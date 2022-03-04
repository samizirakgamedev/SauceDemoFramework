package org.runewriters.stepdefs;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.runewriters.pom.InventoryPage;
import org.runewriters.pom.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginStepDefs {

    private WebDriver webDriver;
    private LoginPage loginPage;
    private InventoryPage inventoryPage;

    @Before
    public void setUps(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    @Given("I am on the Login Page")
    public void iAmOnTheLoginPage() {
        webDriver.get("https://www.saucedemo.com");
    }

    @When("I insert {string} and {string}")
    public void iInsertUsernameAnd(String username, String password) {
        loginPage = new LoginPage(webDriver);
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @And("I click on the login button")
    public void iClickOnTheLoginButton() {
        loginPage.clickLogInButton();
    }

    @Then("I will go to the InventoryPage")
    public void iWillGoToTheInventoryPage() {
        webDriver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
        inventoryPage = new InventoryPage(webDriver);
    }

    @When("I insert an invalid username")
    public void iInsertAnInvalidUsername() {
        loginPage.enterUsername("locked_out_user");
        loginPage.enterPassword("secret_sauce");
    }

    @When("I insert an invalid password")
    public void iInsertAnInvalidPassword() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("12345");
    }

    @Then("I will stay in the Login Page")
    public void iWillStayInTheLoginPage() {
    }
}
