package org.runewriters.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
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
    private InventoryItemPage inventoryItemPage;
    private InventoryPage inventory;
    private CheckoutOnePage checkoutOnePage;
    private CheckoutTwoPage checkoutTwoPage;
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

//    @Then("I will go to the Inventory Page")
//    public void iWillGoToTheInventoryPage() {
//        Assertions.assertEquals("", inventory.getCurrentURL());
//    }

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
