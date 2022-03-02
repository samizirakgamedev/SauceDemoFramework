package org.runewriters.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    private WebDriver driver;

    By backpackLabel = new By.ById("Sauce Labs Backpack");
    By bikeLightLabel = new By.ById("Sauce Labs Bike Light");
    By boltShirtLabel = new By.ById("Sauce Labs Bolt T-Shirt");
    By fleeceJacketLabel = new By.ById("Sauce Labs Fleece Jacket");
    By onesieLabel = new By.ById("Sauce Labs Onsie");
    By redShirtLabel = new By.ById("Test.allTheThings() T-Shirt (Red)");
    By continueShopping = new By.ById("Continue Shopping");
    By checkout = new By.ById("Checkout");
    By remove = new By.ById("Remove");


    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickBackPack(){
        driver.findElement(backpackLabel).click();
    }

    public void clickBikeLight(){
        driver.findElement(bikeLightLabel).click();
    }

    public void clickBoltShirt(){
        driver.findElement(boltShirtLabel).click();
    }

    public void clickFleeceJacket(){
        driver.findElement(fleeceJacketLabel).click();
    }

    public void clickOnesie(){
        driver.findElement(onesieLabel).click();
    }

    public void clickRedShirt(){
        driver.findElement(redShirtLabel).click();
    }

    public void clickContinueShopping(){
        driver.findElement(continueShopping).click();
    }

    public void clickCheckout(){
        driver.findElement(checkout).click();
    }

    public void clickRemove(){
        driver.findElement(remove).click();
    }









}
