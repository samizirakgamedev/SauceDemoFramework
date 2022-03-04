package org.runewriters.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends Page {

    private By cartItems = new By.ByClassName("inventory_item_name");
    private By cartItemPrice = new By.ByClassName("inventory_item_price");
    private By continueShopping = new By.ById("continue-shopping");
    private By checkout = new By.ById("checkout");
    private By remove = new By.ByClassName("btn");

    public CartPage(WebDriver driver){
        super(driver);
        this.getDriver().get("https://www.saucedemo.com/cart.html");
    }

    public void clickItemAtIndex(int index){
        List<WebElement> cartItemNames = this.getDriver().findElements(cartItems);
        cartItemNames.get(index).click();
    }

    public String getItemPriceAtIndex(int index){
        List<WebElement> cartItemPrices = this.getDriver().findElements(cartItemPrice);
        return cartItemPrices.get(index).getText();
    }

    public String getItemNameAtIndex(int index){
        return this.getDriver().findElements(cartItems).get(index).getText();
    }

    public void clickRemoveItemAtIndex(int index){
        List<WebElement> removeButtons = this.getDriver().findElements(remove);
        removeButtons.get(index).click();
    }

    public int getCartSize(){
        return this.getDriver().findElements(cartItems).size();
    }

    public void clickContinueShoppingButton(){
        this.getDriver().findElement(continueShopping).click();
    }

    public void clickCheckoutButton(){
        this.getDriver().findElement(checkout).click();
    }









}
