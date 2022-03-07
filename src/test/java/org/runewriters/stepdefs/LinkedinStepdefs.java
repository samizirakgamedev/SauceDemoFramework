package org.runewriters.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.runewriters.pom.InventoryPage;
import org.runewriters.pom.LoginPage;
import org.runewriters.webdrivers.WebDriverFactory;
import org.runewriters.webdrivers.model.WebDriverManager;
import org.runewriters.webdrivers.model.WebDriverType;

import java.time.Duration;
import java.util.ArrayList;

public class LinkedinStepdefs {

    private static WebDriver webDriver;
    private static WebDriverManager manager;
    private LoginPage loginPage;
    private InventoryPage inventoryPage;

    @Given("I am on the INVENTOry page")
    public void iAmOnTheINVENTOryPage() {
        manager = WebDriverFactory.getManager(WebDriverType.CHROME);
        webDriver = manager.getDriver();
        webDriver.get("https://www.saucedemo.com");

        loginPage = new LoginPage(webDriver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogInButton();
        inventoryPage = new InventoryPage(webDriver);
    }

    @When("I click on LinkedIn icon")
    public void iClickOnLinkedInIcon() {
        inventoryPage = new InventoryPage(webDriver);
        inventoryPage.clickLinkedinIcon();
    }

    @Then("I will go to the LinkedIn page")
    public void iWillGoToTheLinkedInPage() {
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Assertions.assertEquals("https://www.linkedin.com/company/sauce-labs/", webDriver.switchTo().window(new ArrayList<>(webDriver.getWindowHandles()).get(1)).getCurrentUrl());
    }

    @After
    public void tearDown(){
        if(webDriver != null){
            manager.quitDriver();
            System.out.println("tearDown li");
        }
    }
}
