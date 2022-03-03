package org.runewriters.stepdefs;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
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
        webDriver = new ChromeDriver();
        webDriver.get("https://www.saucedemo.com");
    }

    @Given("I am in inventory page")
    public void iAmInInventoryPage(){
        loginPage = new LoginPage(webDriver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogInButton();
    }

    @When("I click the product")
    public void iClickTheProductSingle(){
        inventoryPage = new InventoryPage(webDriver);
        inventoryItemPage = new InventoryItemPage(webDriver);
        System.out.println(inventoryItemPage.getItemPrice());
    }


    @When("I click the product {int}")
    public void iClickTheProduct(int index){
        // inventoryPage = new InventoryPage(webDriver);
        //  inventoryPage.clickItemImageAtIndex(index);
    }

    @Then("I get into the product information page")
    public void iGetIntoTheProductInformationPage(){
        inventoryItemPage = new InventoryItemPage(webDriver);
    }

    @And("The price is match with the product {int}")
    public void thePriceIsMatchWithTheProduct(int index){
      //  Assertions.assertEquals(inventoryPage.getPriceAtIndex(index), inventoryItemPage.getItemPrice());
    }

    @After
    public void tearDown(){
        webDriver.quit();
    }

}
