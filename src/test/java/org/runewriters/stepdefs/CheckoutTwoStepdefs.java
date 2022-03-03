package org.runewriters.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.runewriters.pom.*;

public class CheckoutTwoStepdefs {
    private LoginPage loginPage;
    private WebDriver webDriver;
    private InventoryItemPage inventoryItem;
    private CartPage cartPage;
    private CheckoutOnePage checkoutOnePage;
    private CheckoutTwoPage checkoutTwoPage;
    private CheckoutCompletePage checkoutCompletePage;

    //This file will be updated. Waiting for POM classes

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        webDriver = new ChromeDriver();
        //loginPage = new LoginPage(webDriver);
        //more lines to be added (to log the user in), waiting for the POM classes to get completed
        webDriver.get("https://www.saucedemo.com");
        System.out.println("setup");
    }

    @Given("I am on the Checkout Two page")
    public void iAmOnTheCheckoutTwoPage() {
    }

    @When("I click on the finish button")
    public void iClickOnTheFinishButton() {

        checkoutTwoPage.clickFinishButton();
    }

    @Then("I will go to the checkout complete page")
    public void iWillGoToTheCheckoutCompletePage() {
        //Assertions.assertEquals("https://www.saucedemo.com/checkout-complete.html", checkoutComplete.getUrl());
    }

    @When("I click on cancel button")
    public void iClickOnCancelButton() {
        checkoutTwoPage.clickCancelButton();
    }

    @Then("I will go to the inventory page")
    public void iWillGoToTheInventoryPage() {
        //Assertions.assertEquals("https://www.saucedemo.com/inventory.html", inventoryItem.getUrl());
    }

    @After
    public void tearDown(){
        webDriver.quit();
        System.out.println("tearDown");
    }
}
