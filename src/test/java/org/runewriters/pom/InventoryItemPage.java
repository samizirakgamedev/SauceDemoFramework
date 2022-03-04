package org.runewriters.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryItemPage extends Page {

    private By itemImage = new By.ByClassName("inventory_details_img");
    private By itemName = new By.ByClassName("inventory_details_name");
    private By itemDescription = new By.ByClassName("inventory_details_desc");
    private By itemPrice = new By.ByClassName("inventory_details_price");
    private By backToProductsButton = new By.ById("back-to-products");
    private By inventoryPageButtons = new By.ByClassName("btn");
    private By shoppingCartBade = new By.ByClassName("shopping_cart_badge");

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
        this.getDriver().findElements(inventoryPageButtons).get(1).click();
    }

    public void clickBackToProductsButton(){
        this.getDriver().findElement(backToProductsButton).click();
    }

    public String getAddToCartOrRemoveButtonName(){
        return this.getDriver().findElements(inventoryPageButtons).get(1).getText();
    }

    public String getShoppingCartBadge(){
        return this.getDriver().findElement(shoppingCartBade).getText();
    }
}
