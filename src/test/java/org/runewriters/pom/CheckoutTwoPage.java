package org.runewriters.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * A class that represents the checkout stage two page in the Sauce Demo website
 */
public class CheckoutTwoPage extends Page {

    // Accessing the web elements from the checkout stage two page that could be useful for the testers
    private By cartBadgeQuantity = new By.ByClassName("shopping_cart_badge");
    private By quantityLabel = new By.ByClassName("cart_quantity_label");
    private By description = new By.ByClassName("cart_desc_label");
    private By cartQuantity = new By.ByClassName("cart_quantity");
    private By itemPrice = new By.ByClassName("inventory_item_price");
    private By itemDescription = new By.ByClassName("inventory_item_desc");
    private By itemName = new By.ByClassName("inventory_item_name");
    private By cartItem = new By.ByClassName("cart_item_label");
    private By subTotalLabel = new By.ByClassName("summary_subtotal_label");
    private By taxTotalLabel = new By.ByClassName("summary_tax_label");
    private By totalPriceLabel = new By.ByClassName("summary_total_label");
    private By paymentInformation = new By.ByClassName("summary_value_label");
    private By cancelButton = new By.ById("cancel");
    private By finishButton = new By.ById("finish");

    public CheckoutTwoPage(WebDriver webDriver) {
        super(webDriver);
        this.getDriver().get("https://www.saucedemo.com/checkout-step-two.html");
    }

    /**
     * Method for returning a boolean whether the cart in the checkout page is empty or not
     */
    public Boolean isShoppingCartEmpty() {
        try {
            List<WebElement> itemsInCart = this.getDriver().findElements(cartItem);
            return itemsInCart.size() == 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Method for returning a boolean whether the shopping chart badge is equal to the amount of items in the cart
     */
    public Boolean isShoppingCartBadgePresentAndCorrect() {
        try {
            List<WebElement> itemsInCart = this.getDriver().findElements(cartItem);
            return itemsInCart.size() == Integer.parseInt(this.getDriver().findElement(cartBadgeQuantity).getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * A method for returning a boolean whether the quantities of each item is correct
     * in this case, its being compared to '1' as the website is only able to do quantity of 1
     */
    public Boolean isItemQuantitiesCorrect() {
        try {
            List<WebElement> itemsInCart = this.getDriver().findElements(cartQuantity);
            for (WebElement webElement : itemsInCart) {
                if (!webElement.getText().equals("1"))
                    return false;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * A method for returning a boolean whether tha quantity label is present
     */
    public Boolean isQuantityLabelPresent() {
        try {
            return this.getDriver().findElement(quantityLabel).getText().equals("QTY");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * A method for returning a boolean whether tha description label is present
     */
    public Boolean isDescriptionLabelPresent() {
        try {
            return this.getDriver().findElement(description).getText().equals("DESCRIPTION");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Method for getting all the item names from all the items in the checkout
     */
    public List<String> getItemNamesInCart() {
        try {
            List<String> itemNamesResult = new ArrayList<>();

            List<WebElement> itemNamesInCart = this.getDriver().findElements(itemName);
            for (WebElement webElement : itemNamesInCart) {
                itemNamesResult.add(webElement.getText());
            }

            return itemNamesResult;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Method for returning a list of item descriptions from all the items in the checkout
     */
    public List<String> getItemDescriptionsInCart() {
        try {
            List<String> itemDescriptionResult = new ArrayList<>();

            List<WebElement> itemDescriptionsInCart = this.getDriver().findElements(itemDescription);
            for (WebElement webElement : itemDescriptionsInCart) {
                itemDescriptionResult.add(webElement.getText());
            }

            return itemDescriptionResult;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Method for returning all the item prices from all the items in the checkout
     */
    public List<String> getItemPricesInCart() {
        try {
            List<String> itemPricesResult = new ArrayList<>();

            List<WebElement> itemPricesInCart = this.getDriver().findElements(itemPrice);
            for (WebElement webElement : itemPricesInCart) {
                itemPricesResult.add(webElement.getText());
            }

            return itemPricesResult;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Method for getting the payment information
     */
    public String getPaymentInformation() {
        try {
            List<WebElement> paymentInformationList = this.getDriver().findElements(paymentInformation);
            return paymentInformationList.get(0).getText();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Method for getting the shipping information
     */
    public String getShippingInformation() {
        try {
            List<WebElement> paymentInformationList = this.getDriver().findElements(paymentInformation);
            return paymentInformationList.get(1).getText();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Method for getting the subtotal price
     */
    public String getSubtotalLabelAndPrice() {
        try {
            return this.getDriver().findElement(subTotalLabel).getText();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Method for getting the tax price
     */
    public String getTaxLabelAndPrice() {
        try {
            return this.getDriver().findElement(taxTotalLabel).getText();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Method for getting the total price
     */
    public String getTotalLabelAndPrice() {
        try {
            return this.getDriver().findElement(totalPriceLabel).getText();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Method for clicking the cancel button in the checkout stage 2 page
     */
    public void clickCancelButton() {
        try {
            this.getDriver().findElement(cancelButton).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method for clicking the finish button in the checkout stage 2 page
     */
    public void clickFinishButton() {
        try {
            this.getDriver().findElement(finishButton).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
