package org.runewriters.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * A class that represents the cart page in the Sauce Demo website
 */
public class CartPage extends Page {

    // Accessing the web elements from the cart page that could be useful for the testers
    private By cartItems = new By.ByClassName("inventory_item_name");
    private By cartItemPrice = new By.ByClassName("inventory_item_price");
    private By continueShopping = new By.ById("continue-shopping");
    private By checkout = new By.ById("checkout");
    private By remove = new By.ByClassName("btn");

    public CartPage(WebDriver webDriver) {
        super(webDriver);
        this.getDriver().get("https://www.saucedemo.com/cart.html");
    }

    /**
     * A method for clicking a specific item's name in the cart, done through passing in an index
     */
    public void clickItemAtIndex(int index) {
        try {
            List<WebElement> cartItemNames = this.getDriver().findElements(cartItems);
            cartItemNames.get(index).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * A method for returning an item's price based off the index (position in the cart) given
     */
    public String getItemPriceAtIndex(int index) {
        try {
            List<WebElement> cartItemPrices = this.getDriver().findElements(cartItemPrice);
            return cartItemPrices.get(index).getText();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * A method for returning an item's name based off the index (position in the cart) given
     */
    @SuppressWarnings("UnusedReturnValue")
    public String getItemNameAtIndex(int index) {
        try {
            return this.getDriver().findElements(cartItems).get(index).getText();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * A method for removing an item at a specific position in the cart
     */
    public void clickRemoveItemAtIndex(int index) {
        try {
            List<WebElement> removeButtons = this.getDriver().findElements(remove);
            removeButtons.get(index).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * A method for getting the current amount of items in the cart
     */
    public Integer getCartSize() {
        try {
            return this.getDriver().findElements(cartItems).size();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * A method for allowing to take the user to go back to the inventory page and continue shopping
     */
    public void clickContinueShoppingButton() {
        try {
            this.getDriver().findElement(continueShopping).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * A method for allowing the user to go to the checkout page
     */
    public void clickCheckoutButton() {
        try {
            this.getDriver().findElement(checkout).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
