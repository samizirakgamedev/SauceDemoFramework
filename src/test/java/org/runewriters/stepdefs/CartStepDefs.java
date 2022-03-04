package org.runewriters.stepdefs;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.runewriters.pom.*;

import java.util.ArrayList;

public class CartStepDefs {
    private WebDriver webDriver;
    private CartPage cartPage;
    private LoginPage loginPage;
    private InventoryItemPage inventoryItemPage;
    private InventoryPage inventoryPage;
    private CheckoutOnePage checkoutOnePage;


    @Before
    public void setup() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        webDriver = new ChromeDriver();
        webDriver.get("https://www.saucedemo.com");
        System.out.println("setup");

    }

    @Given("I am on the cart page")
    public void iAmOnTheCartPage() {
        loginPage = new LoginPage(webDriver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogInButton();
        inventoryPage = new InventoryPage(webDriver);
        inventoryPage.clickAddToCartOrRemoveButtonAtIndex(0);
        inventoryPage.clickAddToCartOrRemoveButtonAtIndex(1);
        inventoryPage.clickAddToCartOrRemoveButtonAtIndex(2);
        inventoryPage.clickCartIcon();

    }
    
    @When("I click on the  title of the product")
    public void clickOnTheTitleOfProduct() {
        cartPage = new CartPage(webDriver);
        cartPage.clickItemAtIndex(2);

    }

    @Then("I will go to the inventory item page of that product")
        public void iWillClickOnItAndTakeMeToTheInventoryItemPage() {
        inventoryItemPage = new InventoryItemPage(webDriver);
        Assertions.assertEquals("https://www.saucedemo.com/inventory-item.html?id=2", inventoryItemPage.getCurrentURL());

    }

    //CONTINUE SHOPPING
    @When("I click on 'continue shopping' in cart page")
    public void clickOnContinueShoppingInCartPage() {
        cartPage = new CartPage(webDriver);
        cartPage.clickContinueShoppingButton();

    }

    @Then("I will go back to the Inventory page")
    public void iWillGoBackToTheInventoryPage() {
        Assertions.assertEquals("https://www.saucedemo.com/inventory.html", inventoryPage.getCurrentURL());
    }

    //CHECKOUT
    @When("I click on 'Checkout' in cart page")
        public void clickOnCheckoutInCartPage() {
        cartPage = new CartPage(webDriver);
        cartPage.clickCheckoutButton();
    }

    @Then("I will go the 'checkout step one' page")
    public void iWillGoToTheCheckoutStepOnePage() {
        checkoutOnePage = new CheckoutOnePage(webDriver);
        Assertions.assertEquals("https://www.saucedemo.com/checkout-step-one.html", checkoutOnePage.getCurrentURL());
    }


    @When("An item is displayed inside the cart")
    public void itemDisplayedInsideTheCart() {
        cartPage = new CartPage(webDriver);
        cartPage.getItemNameAtIndex(2);
    }

    @Then("I will have an option to remove that item from the cart")
    public void removeTheItemFromTheCart() {
       // Assertions.assertEquals();
        
    }

    @When("An item is displayed in the cart page")
    public void itemDisplayedInsideTheCart1() {
        cartPage = new CartPage(webDriver);
        cartPage.getItemPriceAtIndex(0);

    }

    @Then("I will see the price of the product")
    public void iWillSeeThePriceOfTheProduct() {
        Assertions.assertEquals("$29.99", cartPage.getItemPriceAtIndex(0));
    }

    @After
    public void tearDown() {
        webDriver.quit();
        System.out.println("tearDown");
    }
}