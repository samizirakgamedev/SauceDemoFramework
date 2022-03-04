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
    private CheckoutCompletePage checkoutCompletePage;
    private CheckoutOnePage checkoutOnePage;
    private CheckoutTwoPage checkoutTwoPage;

    @Before
    public void setup() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        webDriver = new ChromeDriver();
        //cartPage = new CartPage(webDriver);
        //more lines to be added (to log the user in), waiting for the POM classes to get completed
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
        inventoryPage.clickCartIcon();

    }
    
    @When("I click on the image or title of the product")
    public void clickOnTheImageOrTitleOfProduct() {
        cartPage.clickItemAtIndex(4);

    }

    @Then("I will go to the inventory item page of that product")
        public void iWillClickOnItAndTakeMeToTheInventoryItemPage() {
        Assertions.assertEquals("https://www.saucedemo.com/inventory-item.html?id=4", inventoryItemPage.getCurrentURL());

    }

    @When("I click on 'continue shopping' in cart page")
    public void clickOnContinueShoppingInCartPage() {
        cartPage.clickContinueShoppingButton();

    }

    @Then("I will go back to the Inventory page")
    public void iWillGoBackToTheInventoryPage() {
        Assertions.assertEquals("https://www.saucedemo.com/inventory.html", inventoryPage.getCurrentURL());
    }

    @When("I click on 'Checkout' in cart page")
        public void clickOnCheckoutInCartPage() {
        cartPage.clickCheckoutButton();
    }

    @Then("I will go the 'checkout step one' page")
    public void iWillGoToTheCheckoutStepOnePage() {
        Assertions.assertEquals("https://www.saucedemo.com/checkout-step-one.html", checkoutOnePage.getCurrentURL());
    }

    @When("An item is displayed inside the cart")
    public void itemDisplayedInsideTheCart() {
        cartPage.clickRemoveItemAtIndex(1);

    }

    @Then("I will have an option to remove that item from the cart")
    public void removeTheItemFromTheCart() {
        cartPage.clickRemoveItemAtIndex(1);
        //  Assertions.assertEquals("https://www.saucedemo.com/cart.html", cartPage.clickRemoveItemAtIndex(1))

    }

    @When("An item is displayed in the cart page")
    public void itemDisplayedInsideTheCart1() {
        cartPage.getItemPriceAtIndex(15);

    }

    @Then("I will see the price of the product")
    public void iWillSeeThePriceOfTheProduct() {
        // Assertions.assertEquals("https://www.saucedemo.com/cart.html", Cartpage.getURL());

    }

    //Twitter
    @When("When I click on the Twitter icon")
    public void clickOnTheTwitterIcon() {
        cartPage = new CartPage(webDriver);
        cartPage.clickTwitterIcon();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Then("I will go to the Twitter page")
    public void iWillGoToTheTwitterPage() {
        Assertions.assertEquals("https://twitter.com/saucelabs", webDriver.switchTo().window(new ArrayList<>(webDriver.getWindowHandles()).get(1)).getCurrentUrl());

    }

    //Facebook
    @When("When I click on the Facebook icon")
    public void clickOnTheFacebookIcon() {
        cartPage = new CartPage(webDriver);
        cartPage.clickFacebookIcon();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("I will go to the Facebook page")
    public void iWillGoToTheFacebookPage() {
        Assertions.assertEquals("https://www.facebook.com/saucelabs", webDriver.switchTo().window(new ArrayList<>(webDriver.getWindowHandles()).get(1)).getCurrentUrl());

    }

   //Linkedin
    @When("When I click on the Linkedin icon")
    public void clickOnTheLinkedinIcon() {
        cartPage = new CartPage(webDriver);
        cartPage.clickLinkedinIcon();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("I will go to the Linkedin page")
    public void iWillGoToTheLinkedinPage() {
        Assertions.assertEquals("https://www.linkedin.com/company/sauce-labs/", webDriver.switchTo().window(new ArrayList<>(webDriver.getWindowHandles()).get(1)).getCurrentUrl());
    }

    @After
    public void tearDown() {
        webDriver.quit();
        System.out.println("tearDown");
    }
}