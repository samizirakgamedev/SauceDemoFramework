package org.runewriters.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.runewriters.pom.InventoryPage;
import org.runewriters.pom.LoginPage;
import java.time.Duration;
import java.util.ArrayList;

public class FacebookStepDef {

    private WebDriver webDriver;
    private static ChromeDriverService service;
    private LoginPage loginPage;
    private InventoryPage inventoryPage;

    @Given("I am on the INVENTORy page")
    public void iAmOnTheINVENTORYPage() {
        webDriver = new ChromeDriver();
        webDriver.get("https://www.saucedemo.com");

        loginPage = new LoginPage(webDriver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogInButton();
        inventoryPage = new InventoryPage(webDriver);
    }

    @When("I click on FACEBOOK icon")
    public void iClickOnFACEBOOKIcon() {
        inventoryPage = new InventoryPage(webDriver);
        inventoryPage.clickFacebookIcon();
    }

    @Then("I will go to the FACEBOOK page")
    public void iWillGoToTheFACEBOOKPage() {
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Assertions.assertEquals("https://www.facebook.com/saucelabs", webDriver.switchTo().window(new ArrayList<>(webDriver.getWindowHandles()).get(1)).getCurrentUrl());
    }

    @After
    public void tearDown(){
        if(webDriver != null){
        webDriver.quit();
        System.out.println("tearDown f");
        }
    }
}
