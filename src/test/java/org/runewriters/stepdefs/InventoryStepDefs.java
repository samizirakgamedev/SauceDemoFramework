package org.runewriters.stepdefs;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.runewriters.pom.*;

public class InventoryStepDefs {

    private WebDriver webDriver;
    private static ChromeDriverService service;
    private LoginPage loginPage;
    private InventoryPage inventoryPage;
    private InventoryItemPage inventoryItemPage;
    private CartPage cartPage;

    @Before
    public void setUps(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        PomUtils.setDriverLocation();
        service = PomUtils.setChromeDriverService("src/test/resources/chromedriver.exe");
        webDriver = new ChromeDriver(service);
        webDriver.get("https://www.saucedemo.com");
        inventoryPage = new InventoryPage(webDriver);
    }

    @Given("I am in inventory page")
    public void iAmInInventoryPage(){
        loginPage = new LoginPage(webDriver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogInButton();
    }

    @When("I click the product")
    public void iClickTheProduct(){
        inventoryPage = new InventoryPage(webDriver);
        inventoryPage.clickItemImageAtIndex(1);
    }

    @Then("I get into the product information page")
    public void iGetIntoTheProductInformationPage(){
      //  Assertions.assertEquals("https://www.saucedemo.com/", webDriver.getCurrentUrl());
    }

    @And("The price is a valid number")
    public void thePriceIsAValidNumber(){

    }

    @After
    public void tearDown(){
       // webDriver.quit();
    }

}
