package org.runewriters.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.runewriters.pom.*;
import org.runewriters.webdrivers.WebDriverFactory;
import org.runewriters.webdrivers.model.WebDriverManager;
import org.runewriters.webdrivers.model.WebDriverType;

public class CheckoutTwoStepdefs {

    private LoginPage loginPage;
    private static WebDriver webDriver;
    private static WebDriverManager manager;
    private InventoryPage inventory;
    private CartPage cartPage;
    private CheckoutOnePage checkoutOnePage;
    private CheckoutTwoPage checkoutTwoPage;
    private CheckoutCompletePage checkoutCompletePage;

    @Given("I am on the Checkout Two page")
    public void iAmOnTheCheckoutTwoPage() {
        manager = WebDriverFactory.getManager(WebDriverType.CHROME);
        webDriver = manager.getDriver();
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
    }

    @When("I click on the finish button")
    public void iClickOnTheFinishButton() {
        checkoutTwoPage = new CheckoutTwoPage(webDriver);
        checkoutTwoPage.clickFinishButton();
    }

    @Then("I will go to the checkout complete page")
    public void iWillGoToTheCheckoutCompletePage() {
        checkoutCompletePage = new CheckoutCompletePage(webDriver);
        Assertions.assertEquals("https://www.saucedemo.com/checkout-complete.html", checkoutCompletePage.getCurrentURL());
    }

    @When("I click on cancel button")
    public void iClickOnCancelButton() {
        checkoutTwoPage = new CheckoutTwoPage(webDriver);
        checkoutTwoPage.clickCancelButton();
    }

    @Then("I will go to the Inventory Pagee")
    public void iWillGoToTheInventoryPage() {
        Assertions.assertEquals("https://www.saucedemo.com/inventory.html", inventory.getCurrentURL());
    }

    @When("I click on Cart icone")
    public void iClickOnCartIcon() {
        checkoutTwoPage = new CheckoutTwoPage(webDriver);
        checkoutTwoPage.clickCartIcon();
    }

    @Then("I will go to the Your Cart pagee")
    public void iWillGoToTheYourCartPage() {
        Assertions.assertEquals("https://www.saucedemo.com/cart.html", cartPage.getCurrentURL());
    }

    @After
    public static void tearDown(){
        if(webDriver != null){
            manager.quitDriver();
            System.out.println("tearDown ct");
        }
    }
}
