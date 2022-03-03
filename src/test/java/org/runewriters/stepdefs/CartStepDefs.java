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

public class CartStepDefs {
    private WebDriver webDriver;
    private CartPage cartPage;
    private InventoryItemPage inventoryItemPage;
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

    }
    
    @When("I click on the image or title of the product")
    public void clickOnTheImageOrTitleOfProduct() {
       // Assertions.assertEquals("https://www.saucedemo.com/cart.html", CartPage.getURL());
    }

    @Then("I will go to the item page of that product")
    public void goToTheItemPageOfTheProduct() {
       // Assertions.assertTrue();
    }

    
    @When("I click on 'add to cart'")
    public void clickOnAddToCart() {
        // Assertions.assertEquals("https://www.saucedemo.com/cart.html", CartPage.getURL());
    }

    @Then("The button will change to display 'Remove' and the cart will update")
    public void buttonWillDisplayRemoveAndCartUpdate() {
        // Assertions.assertTrue();
    }




    @When("An item is displayed inside the cart")
    public void itemDisplayedInsideTheCart() {
        // Assertions.assertEquals("https://www.saucedemo.com/cart.html", Cartpage.getURL());
    }

    @Then("I will have an option to continue shopping")
    public void optionToContinueShopping() {
        cartPage.clickContinueShoppingButton();
     //   Assertions.assertEquals("https://www.saucedemo.com/cart.html",cartPage.clickContinueShoppingButton());
    }

    @When("An item is displayed inside the cart")
    public void itemDisplayedInsideTheCart1() {
      //  Assertions.assertEquals("https://www.saucedemo.com/cart.html", cartPage.clickCheckoutButton());
    }

    @Then("I will have an option to checkout")
    public void optionToCheckout() {
        cartPage.clickCheckoutButton();
       // Assertions.assertEquals("https://www.saucedemo.com/cart.html", cartPage.clickCheckoutButton());

    }

    @When("An item is displayed inside the cart")
    public void itemDisplayedInsideTheCart2() {
      //  Assertions.assertEquals("https://www.saucedemo.com/cart.html", cartPage.clickRemoveItemAtIndex(1));
    }

    @Then("I will have an option to remove that item from the cart")
    public void removeTheItemFromTheCart() {
        cartPage.clickRemoveItemAtIndex(1);
        //  Assertions.assertEquals("https://www.saucedemo.com/cart.html", cartPage.clickRemoveItemAtIndex(1))

    }

    @When("An item is displayed inside the cart")
    public void itemDisplayedInsideTheCart3() {
        // Assertions.assertEquals("https://www.saucedemo.com/cart.html", Cartpage.getURL());
    }

    @Then("I will see the price of the product")
    public void iWillSeeThePriceOfTheProduct() {
        cartPage.getItemPriceAtIndex(15);
        // Assertions.assertTrue();
    }


    //Twitter
    @When("When I click on the Twitter icon")
    public void clickOnTheTwitterIcon() {
        //Assertions.assertEquals("https://twitter.com/saucelabs", cartPage.getUrl());

    }

    @Then("I will go to the Twitter page")
    public void iWillGoToTheTwitterPage() {
        // Assertions.assertTrue();
    }

    //Facebook
    @When("When I click on the Facebook icon")
    public void clickOnTheFacebookIcon() {
        //Assertions.assertEquals("https://www.facebook.com/saucelabs", cartPage.getUrl());

    }

    @Then("I will go to the Facebook page")
    public void iWillGoToTheFacebookPage() {
        // Assertions.assertTrue();
    }

   //Linkedin
    @When("When I click on the Linkedin icon")
    public void clickOnTheLinkedinIcon() {
        //Assertions.assertEquals("https://www.linkedin.com/company/sauce-labs/", cart.getUrl());
    }

    @Then("I will go to the Linkedin page")
    public void iWillGoToTheLinkedinPage() {
        // Assertions.assertTrue();
    }

    @After
    public void tearDown() {
        webDriver.quit();
        System.out.println("tearDown");
    }
}