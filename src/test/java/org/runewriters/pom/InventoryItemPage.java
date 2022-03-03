package org.runewriters.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryItemPage extends Page {

    private By itemImage = new By.ByClassName("inventory_details_img");
    private By itemName = new By.ByClassName("inventory_details_name large_size");
    private By itemDescription = new By.ByClassName("inventory_details_desc large_size");
    private By itemPrice = new By.ByClassName("inventory_details_price");
    private By addToCartOrRemoveButton = new By.ByClassName("btn btn_secondary btn_small btn_inventory");
    private By backToProductsButton = new By.ByClassName("btn btn_secondary back btn_large inventory_details_back_button");

    public InventoryItemPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getItemName(){
        return this.getDriver().findElement(itemName).getText();
    }

    public String getItemImageSource(){
        return this.getDriver().findElement(itemImage).getAttribute("source");
    }

    public String getItemDescription(){
        return this.getDriver().findElement(itemDescription).getText();
    }

    public String getItemPrice(){
        return this.getDriver().findElement(itemPrice).getText();
    }

    public void clickAddToCartOrRemoveButton(){
        this.getDriver().findElement(addToCartOrRemoveButton).click();
    }

    public void clickBackToProductsButton(){
        this.getDriver().findElement(backToProductsButton).click();
    }
}
