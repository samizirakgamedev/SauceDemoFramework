package org.runewriters.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage extends Page {

    private WebDriver webDriver;
    private By itemImages = new By.ByClassName("inventory_item_img");
    private By itemNames = new By.ByClassName("inventory_item_name");
    private By itemPrices = new By.ByClassName("inventory_item_price");
    private By itemDescription = new By.ByClassName("inventory_item_desc");
    private By addToCartOrRemoveButtons = new By.ByName("btn btn_primary btn_small btn_inventory");
    private By filterButton = new By.ByClassName("product_sort_container");
    private By filterOptions = new By.ByTagName("option");

    public InventoryPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickItemImageAtIndex(int index){
        webDriver.findElements(itemImages).get(index).click();
    }

    public String getItemImageSourceAtIndex(int index){
        return webDriver.findElements(itemImages).get(index).getAttribute("source");
    }

    public void clickItemNameAtIndex(int index){
        webDriver.findElements(itemNames).get(index).click();
    }

    public String getItemNameAtIndex(int index){
        return webDriver.findElements(itemNames).get(index).getText();
    }

    public String getPriceAtIndex(int index){
        return webDriver.findElements(itemPrices).get(index).getText();
    }

    public String getItemDescriptionAtIndex(int index){
        return webDriver.findElements(itemDescription).get(index).getText();
    }

    public void clickAddToCartOrRemoveButtonAtIndex(int index){
        webDriver.findElements(addToCartOrRemoveButtons).get(index).click();
    }

    public void filterPageByNameAToZ(){
        webDriver.findElement(filterButton).click();
        webDriver.findElements(filterOptions).get(0).click();
    }

    public void filterPageByNameZToA(){
        webDriver.findElement(filterButton).click();
        webDriver.findElements(filterOptions).get(1).click();
    }

    public void filterPageByPrizeLowToHigh(){
        webDriver.findElement(filterButton).click();
        webDriver.findElements(filterOptions).get(2).click();
    }

    public void filterPageByPriceHighToLow(){
        webDriver.findElement(filterButton).click();
        webDriver.findElements(filterOptions).get(3).click();
    }
}
