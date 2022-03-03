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

public class CheckoutOneStepdefs {

    private LoginPage loginPage;
    private WebDriver webDriver;
    private InventoryItemPage inventoryItem;
    private CartPage cartPage;
    private CheckoutOnePage checkoutOnePage;
    private CheckoutTwoPage checkoutTwoPage;

//This file will be updated

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        webDriver = new ChromeDriver();
        //loginPage = new LoginPage(webDriver);
        //more lines to be added (to log the user in), waiting for the POM classes to get completed
        webDriver.get("https://www.saucedemo.com");
        System.out.println("setup");
    }

    @Given("I am on the Checkout One page")
    public void iAmOnTheCheckoutOnePage() {
        //waiting for the POM classes to get completed
        //user will login, add item(s) to the cart and will go to the checkout page https://www.saucedemo.com/checkout-step-one.html

    }

    @When("I enter my first name")
    public void iEnterMyFirstName() {

        checkoutOnePage.enterFirstNameInTextBox("Suyash");
    }

    @And("I enter my last name")
    public void iEnterMyLastName() {

        checkoutOnePage.enterLastNameInTextBox("Srivastava");
    }

    @And("I enter my postal code")
    public void iEnterMyPostalCode() {

        checkoutOnePage.enterZipCodeInTextBox("E14 NS");
    }

    @And("I click on the Continue button")
    public void iClickOnTheContinueButton() {

        checkoutOnePage.clickContinueButton();
    }

    @Then("I will go to the Checkout Two page")
    public void iWillGoToTheCheckoutTwoPage() {
        //Assertions.assertEquals("https://www.saucedemo.com/checkout-step-two.html", checkoutTwoPage.getUrl()); from page superclass
    }

    @When("I click on Cancel button")
    public void iClickOnCancelButton() {

        checkoutOnePage.clickCancelButton();
    }

    @Then("I will go to the Your Cart page")
    public void iWillGoToTheYourCartPage() {
        //Assertions.assertEquals("https://www.saucedemo.com/cart.html", cartPage.getUrl()); from page superclass
    }

    @When("I click on Cart icon")
    public void iClickOnCartIcon() {
       // checkoutOnePage.clickOnCartIcon(); from page superclass?
    }


    @Then("I will go to the Inventory page")
    public void iWillGoToTheInventoryPage() {
        //Assertions.assertEquals("https://www.saucedemo.com/inventory.html", inventoryItem.getUrl()); from page superclass
    }

    @When("I click on Twitter icon")
    public void iClickOnTwitterIcon() {
        //more lines to be added, waiting for the POM classes to get completed
    }

    @Then("I will go to the Twitter page")
    public void iWillGoToTheTwitterPage() {
        //Assertions.assertEquals("https://twitter.com/saucelabs", cart.getUrl()); from page superclass
    }

    @When("I click on Facebook icon")
    public void iClickOnFacebookIcon() {
        //more lines to be added, waiting for the POM classes to get completed
    }

    @Then("I will go to the Facebook page")
    public void iWillGoToTheFacebookPage() {
        //Assertions.assertEquals("https://www.facebook.com/saucelabs", cart.getUrl()); from page superclass
    }

    @When("I click on Linkedin icon")
    public void iClickOnLinkedinIcon() {
        //more lines to be added, waiting for the POM classes to get completed
    }

    @Then("I will go to the Linkedin page")
    public void iWillGoToTheLinkedinPage() {
        //Assertions.assertEquals("https://www.linkedin.com/company/sauce-labs/", cart.getUrl()); from page superclass
    }

    @Then("I will go to the Side bar")
    public void iWillGoToTheSideBar() {
        //Assertions.assertEquals(checkoutOnePage.isSideBarPresent());
    }

    @When("I click on Side bar icon")
    public void iClickOnSideBarIcon() {
        //checkoutOnePage.clickSideButton();
    }

    @After
    public void tearDown(){
        webDriver.quit();
        System.out.println("tearDown");
    }
}
