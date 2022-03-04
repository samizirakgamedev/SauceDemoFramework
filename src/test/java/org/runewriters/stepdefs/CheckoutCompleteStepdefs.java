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
import java.util.ArrayList;

public class CheckoutCompleteStepdefs { //TODO keep social media checks in one file - make it run headless

    private WebDriver webDriver;
    private LoginPage loginPage;
    private CartPage cartPage;
    private InventoryPage inventory;
    private CheckoutOnePage checkoutOnePage;
    private CheckoutTwoPage checkoutTwoPage;
    private CheckoutCompletePage checkoutCompletePage;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        webDriver = new ChromeDriver();
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

    @When("I click on Twitter Icon")
    public void iClickOnTwitterIcon() {
        checkoutCompletePage = new CheckoutCompletePage(webDriver);
        checkoutCompletePage.clickTwitterIcon();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("I will go to the Twitter Page")
    public void iWillGoToTheTwitterPage() {
        Assertions.assertEquals("https://twitter.com/saucelabs", webDriver.switchTo().window(new ArrayList<>(webDriver.getWindowHandles()).get(1)).getCurrentUrl());
    }

    @When("I click on Facebook Icon")
    public void iClickOnFacebookIcon() {
        checkoutCompletePage = new CheckoutCompletePage(webDriver);
        checkoutCompletePage.clickFacebookIcon();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("I will go to the Facebook Page")
    public void iWillGoToTheFacebookPage() {
        Assertions.assertEquals("https://www.facebook.com/saucelabs", webDriver.switchTo().window(new ArrayList<>(webDriver.getWindowHandles()).get(1)).getCurrentUrl());
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
