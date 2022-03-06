package org.runewriters.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.runewriters.pom.*;

public class CheckoutCompleteStepdefs {

    private WebDriver webDriver;
    private LoginPage loginPage;
    private CartPage cartPage;
    private InventoryPage inventory;
    private CheckoutOnePage checkoutOnePage;
    private CheckoutTwoPage checkoutTwoPage;
    private CheckoutCompletePage checkoutCompletePage;


    @Given("I am on the Checkout Complete page")
    public void iAmOnTheCheckoutCompletePage() {
        webDriver = new ChromeDriver();
        webDriver.get("https://www.saucedemo.com");

        loginPage = new LoginPage(webDriver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogInButton();
        inventory = new InventoryPage(webDriver);
        inventory.clickAddToCartOrRemoveButtonAtIndex(0);
        inventory.clickCartIcon();
        cartPage = new CartPage(webDriver);
        cartPage.clickCheckoutButton();
        checkoutOnePage = new CheckoutOnePage(webDriver);
        checkoutOnePage.enterFirstNameInTextBox("Suyash");
        checkoutOnePage.enterLastNameInTextBox("Srivastava");
        checkoutOnePage.enterZipCodeInTextBox("E14 NS");
        checkoutOnePage.clickContinueButton();
        checkoutTwoPage = new CheckoutTwoPage(webDriver);
        checkoutTwoPage.clickFinishButton();
    }

    @When("I click on back home button")
    public void iClickOnBackHomeButton() {
        checkoutCompletePage = new CheckoutCompletePage(webDriver);
        checkoutCompletePage.clickBackHomeButton();
    }

    @Then("I will go to the Inventory Page")
    public void iWillGoToTheInventoryPage() {
        Assertions.assertEquals("https://www.saucedemo.com/inventory.html", inventory.getCurrentURL());
    }

    @When("I click on Cart Icon")
    public void iClickOnCartIcon() {
        checkoutCompletePage = new CheckoutCompletePage(webDriver);
        checkoutCompletePage.clickCartIcon();
    }

    @Then("I will go to the Your Cart Page")
    public void iWillGoToTheYourCartPage() {
        Assertions.assertEquals("https://www.saucedemo.com/cart.html", cartPage.getCurrentURL());
    }

    @And("The cart will be empty")
    public void theCartWillBeEmpty() {
        //Assertions.assertEquals(cartPage.isCartEmpty());
    }

    @After
    public void tearDown(){
        if(webDriver != null){
            webDriver.quit();
            System.out.println("tearDown cc");
        }
    }
}
