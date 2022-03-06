package org.runewriters.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * A class that represents the inventory page in the Sauce Demo website
 */
public class InventoryPage extends Page {

    // Accessing the web elements from the inventory page that could be useful for the testers
    private By itemImages = new By.ByClassName("inventory_item_img");
    private By itemNames = new By.ByClassName("inventory_item_name");
    private By itemPrices = new By.ByClassName("inventory_item_price");
    private By itemDescription = new By.ByClassName("inventory_item_desc");
    private By addToCartOrRemoveButtons = new By.ByClassName("btn");
    private By filterButton = new By.ByClassName("product_sort_container");
    private By filterOptions = new By.ByTagName("option");
    private By shoppingCartBade = new By.ByClassName("shopping_cart_badge");

    public InventoryPage(WebDriver webDriver) {
        super(webDriver);
        this.getDriver().get("https://www.saucedemo.com/inventory.html");
    }

    /**
     * This method allows to click any item image by passing in an index
     */
    public void clickItemImageAtIndex(int index) {
        try {
            this.getDriver().findElements(itemImages).get(index).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method allows to get any item's image source by passing in an index
     */
    public String getItemImageSourceAtIndex(int index) {
        try {
            return this.getDriver().findElements(itemImages).get(index).getAttribute("source");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Method for clicking any item in inventory page by passing in its index
     */
    public void clickItemNameAtIndex(int index) {
        try {
            this.getDriver().findElements(itemNames).get(index).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method for getting any item names in the inventory page by passing in an index
     */
    public String getItemNameAtIndex(int index) {
        try {
            return this.getDriver().findElements(itemNames).get(index).getText();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Method for getting any item prices in the inventory page by passing in an index
     */
    public String getPriceAtIndex(int index) {
        try {
            return this.getDriver().findElements(itemPrices).get(index).getText();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Method for getting an item descriptions in the inventory page by passing in an index
     */
    public String getItemDescriptionAtIndex(int index) {
        try {
            return this.getDriver().findElements(itemDescription).get(index).getText();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Method for clicking any add to cart ore remove from cart button by passing in an index
     */
    public void clickAddToCartOrRemoveButtonAtIndex(int index) {
        try {
            this.getDriver().findElements(addToCartOrRemoveButtons).get(index).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method for sorting the inventory page by name from A to Z
     */
    public void filterPageByNameAToZ() {
        try {
            this.getDriver().findElement(filterButton).click();
            this.getDriver().findElements(filterOptions).get(0).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method for sorting the inventory page by name from Z to A
     */
    public void filterPageByNameZToA() {
        try {
            this.getDriver().findElement(filterButton).click();
            this.getDriver().findElements(filterOptions).get(1).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method for sorting the inventory page by price from lowest to highest
     */
    public void filterPageByPriceLowToHigh() {
        try {
            this.getDriver().findElement(filterButton).click();
            this.getDriver().findElements(filterOptions).get(2).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method for sorting the inventory page by price from highest to lowest
     */
    public void filterPageByPriceHighToLow() {
        try {
            this.getDriver().findElement(filterButton).click();
            this.getDriver().findElements(filterOptions).get(3).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method for getting any button names in the inventory page by passing in its index
     */
    public String getButtonNameAtIndex(int index) {
        try {
            return this.getDriver().findElements(addToCartOrRemoveButtons).get(index).getText();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Method for getting the shopping cart badge number
     */
    public String getShoppingCartBadge() {
        try {
            return this.getDriver().findElement(shoppingCartBade).getText();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
