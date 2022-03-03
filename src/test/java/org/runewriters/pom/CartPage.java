package org.runewriters.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage {

    private WebDriver driver;

    By cartItems = new By.ByClassName("inventory_item_name");
    By cartItemPrice = new By.ByClassName("inventory_item_price");
    By continueShopping = new By.ById("Continue Shopping");
    By checkout = new By.ById("Checkout");
    By remove = new By.ByClassName("btn btn_secondary btn_small cart_button");


    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickItemAtIndex(int index){
        List<WebElement> cartItemNames = driver.findElements(cartItems);
        cartItemNames.get(index).click();
    }
    public WebElement getItemPriceAtIndex(int index){
        List<WebElement> cartItemPrices = driver.findElements(cartItemPrice);
        return cartItemPrices.get(index);
    }

    public void clickRemoveItemAtIndex(int index){
        List<WebElement> removeButtons = driver.findElements(remove);
        removeButtons.get(index).click();
    }

    public void clickContinueShoppingButton(){
        driver.findElement(continueShopping).click();
    }

    public void clickCheckoutButton(){
        driver.findElement(checkout).click();
    }









}
