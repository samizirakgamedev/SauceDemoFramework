package org.runewriters.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * A class that represents the inventory item page in the Sauce Demo website
 */
public class InventoryItemPage extends Page {

    // Accessing the web elements from the inventory item page that could be useful for the testers
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

    /**
     * Method for returning the current item selected in the inventory item page
     */
    public String getItemName() {
        try {
            return this.getDriver().findElement(itemName).getText();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Method for getting the source of the image of the current item selected in the inventory item page
     */
    public String getItemImageSource() {
        try {
            return this.getDriver().findElement(itemImage).getAttribute("source");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Method for getting the description of the current item selected in the inventory item page
     */
    public String getItemDescription() {
        try {
            return this.getDriver().findElement(itemDescription).getText();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Method for getting the price of the current item selected in the inventory item page
     */
    public String getItemPrice() {
        try {
            return this.getDriver().findElement(itemPrice).getText();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Method for clicking the add to cart or remove from cart button depending on its current state
     */
    public void clickAddToCartOrRemoveButton() {
        try {
            this.getDriver().findElements(inventoryPageButtons).get(1).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method for clicking the back to products button so users can go back to the all items page
     */
    public void clickBackToProductsButton() {
        try {
            this.getDriver().findElement(backToProductsButton).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method for returning the name of the current state of the button
     */
    public String getAddToCartOrRemoveButtonName() {
        try {
            return this.getDriver().findElements(inventoryPageButtons).get(1).getText();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Method for getting the number in shopping cart badge
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
