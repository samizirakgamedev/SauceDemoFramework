package org.runewriters.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage extends Page {

    private By itemImages = new By.ByClassName("inventory_item_img");
    private By itemNames = new By.ByClassName("inventory_item_name");
    private By itemPrices = new By.ByClassName("inventory_item_price");
    private By itemDescription = new By.ByClassName("inventory_item_desc");
    private By addToCartOrRemoveButtons = new By.ByName("btn btn_primary btn_small btn_inventory");
    private By filterButton = new By.ByClassName("product_sort_container");
    private By filterOptions = new By.ByTagName("option");

    public InventoryPage(WebDriver webDriver) {
        super(webDriver);
        this.getDriver().get("https://www.saucedemo.com/inventory.html");
    }

    public void clickItemImageAtIndex(int index){
        this.getDriver().findElements(itemImages).get(index).click();
    }

    public String getItemImageSourceAtIndex(int index){
        return this.getDriver().findElements(itemImages).get(index).getAttribute("source");
    }

    public void clickItemNameAtIndex(int index){
        this.getDriver().findElements(itemNames).get(index).click();
    }

    public String getItemNameAtIndex(int index){
        return this.getDriver().findElements(itemNames).get(index).getText();
    }

    public String getPriceAtIndex(int index){
        return this.getDriver().findElements(itemPrices).get(index).getText();
    }

    public String getItemDescriptionAtIndex(int index){
        return this.getDriver().findElements(itemDescription).get(index).getText();
    }

    public void clickAddToCartOrRemoveButtonAtIndex(int index){
        this.getDriver().findElements(addToCartOrRemoveButtons).get(index).click();
    }

    public void filterPageByNameAToZ(){
        this.getDriver().findElement(filterButton).click();
        this.getDriver().findElements(filterOptions).get(0).click();
    }

    public void filterPageByNameZToA(){
        this.getDriver().findElement(filterButton).click();
        this.getDriver().findElements(filterOptions).get(1).click();
    }

    public void filterPageByPrizeLowToHigh(){
        this.getDriver().findElement(filterButton).click();
        this.getDriver().findElements(filterOptions).get(2).click();
    }

    public void filterPageByPriceHighToLow(){
        this.getDriver().findElement(filterButton).click();
        this.getDriver().findElements(filterOptions).get(3).click();
    }
}
