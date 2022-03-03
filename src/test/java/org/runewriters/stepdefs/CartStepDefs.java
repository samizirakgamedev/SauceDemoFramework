package org.runewriters.stepdefs;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.runewriters.pom.CartPage;

public class CartStepDefs {
    private WebDriver webDriver;
    private CartPage cartPage;

    @Before
    public void setup() {
    //    System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        webDriver = new ChromeDriver();
     //   homePage = new HomePage(webDriver);
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
        // Assertions.assertTrue();
    }

    @When("An item is displayed inside the cart")
    public void itemDisplayedInsideTheCart1() {
        // Assertions.assertEquals("https://www.saucedemo.com/cart.html", Cartpage.getURL());
    }

    @Then("I will have an option to checkout")
    public void optionToCheckout() {
        // Assertions.assertTrue();
    }

    @When("An item is displayed inside the cart")
    public void itemDisplayedInsideTheCart2() {
        // Assertions.assertEquals("https://www.saucedemo.com/cart.html", Cartpage.getURL());
    }

    @Then("I will have an option to remove that item from the cart")
    public void removeTheItemFromTheCart() {
        // Assertions.assertTrue();
    }

   //Twitter
    @When("When I click on the Twitter icon")
    public void clickOnTheTwitterIcon() {
        // Assertions.assertEquals("https://www.saucedemo.com/cart.html", Cartpage.getURL());
    }

    @Then("I will go to the Twitter page")
    public void iWillGoToTheTwitterPage() {
        // Assertions.assertTrue();
    }

    //Facebook
    @When("When I click on the Facebook icon")
    public void clickOnTheFacebookIcon() {
        // Assertions.assertEquals("https://www.saucedemo.com/cart.html", Cartpage.getURL());
    }

    @Then("I will go to the Facebook page")
    public void iWillGoToTheFacebookPage() {
        // Assertions.assertTrue();
    }

   //Linkedin
    @When("When I click on the Linkedin icon")
    public void clickOnTheLinkedinIcon() {
        // Assertions.assertEquals("https://www.saucedemo.com/cart.html", Cartpage.getURL());
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