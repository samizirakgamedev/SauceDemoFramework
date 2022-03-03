package org.runewriters.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryItemPage {

    private WebDriver webDriver;
    By itemImage = new By.ByClassName("inventory_details_img");
    By itemName = new By.ByClassName("inventory_details_name large_size");
    By itemDescription = new By.ByClassName("inventory_details_desc large_size");
    By itemPrice = new By.ByClassName("inventory_details_price");
    By addToCartOrRemoveButton = new By.ByClassName("btn btn_secondary btn_small btn_inventory");
    By backToProductsButton = new By.ByClassName("btn btn_secondary back btn_large inventory_details_back_button");

    public InventoryItemPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void getItemName(){
        webDriver.findElement(itemName).getText();
    }

    public String getItemImageSource(){
        return webDriver.findElement(itemImage).getAttribute("source");
    }

    public String getItemDescription(){
        return webDriver.findElement(itemDescription).getText();
    }

    public String getItemPrice(){
        return webDriver.findElement(itemPrice).getText();
    }

    public void clickAddToCartOrRemoveButton(){
        webDriver.findElement(addToCartOrRemoveButton).click();
    }

    public void clickBackToProductsButton(){
        webDriver.findElement(backToProductsButton).click();
    }
}
