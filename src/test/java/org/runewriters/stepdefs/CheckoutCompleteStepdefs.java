package org.runewriters.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.runewriters.pom.CartPage;
import org.runewriters.pom.CheckoutCompletePage;
import org.runewriters.pom.InventoryItemPage;

public class CheckoutCompleteStepdefs {
    private WebDriver webDriver;
    private CartPage cartPage;
    private InventoryItemPage inventoryItemPage;
    private CheckoutCompletePage checkoutCompletePage;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        webDriver = new ChromeDriver();
        //loginPage = new LoginPage(webDriver);
        //more lines to be added (to log the user in), waiting for the POM classes to get completed
        webDriver.get("https://www.saucedemo.com");
        System.out.println("setup");
    }

    @Given("I am on the Checkout Complete page")
    public void iAmOnTheCheckoutCompletePage() {
    }

    @When("I click on back home button")
    public void iClickOnBackHomeButton() {

        checkoutCompletePage.clickBackHomeButton();
    }

    @Then("I will go to the Inventory Page")
    public void iWillGoToTheInventoryPage() {
        //Assertions.assertEquals("", inventoryItemPage.getUrl());
    }

    @And("The cart will be empty")
    public void theCartWillBeEmpty() {
        //Assertions.assertEquals(cartPage.isCartEmpty());
    }

    @After
    public void tearDown(){
        webDriver.quit();
        System.out.println("tearDown");
    }
}
