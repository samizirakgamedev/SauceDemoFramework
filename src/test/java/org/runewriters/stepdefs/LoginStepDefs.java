package org.runewriters.stepdefs;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
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
        loginPage = new LoginPage(webDriver);
    }

    @Given("I am on the Login Page")
    public void iAmOnTheLoginPage() {
        webDriver.get("https://www.saucedemo.com");
    }

    @When("I insert {string} and secret_sauce")
    public void iInsertUsernameAndSecret_sauce(String username) {
        loginPage.enterUsername(username);
        loginPage.enterPassword("secret_sauce");
    }

    @And("I click on the login button")
    public void iClickOnTheLoginButton() {
        loginPage.clickLogInButton();
    }

    @Then("I will go to the InventoryPage")
    public void iWillGoToTheInventoryPage() {
        webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        inventoryPage = new InventoryPage(webDriver);
    }

    @When("I insert an invalid username and a valid password")
    public void iInsertAnInvalidUsername() {
        loginPage.enterUsername("locked_out_user");
        loginPage.enterPassword("secret_sauce");
    }

    @When("I insert a valid username and an invalid password")
    public void iInsertAnInvalidPassword() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("12345");
    }

    @Then("I will stay in the Login Page")
    public void iWillStayInTheLoginPage() {
        Assertions.assertTrue( "https://www.saucedemo.com".equals(webDriver.getCurrentUrl()) || "https://www.saucedemo.com/".equals(webDriver.getCurrentUrl()));
    }
}
