package org.runewriters.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CheckoutTwoPage extends Page {

    private WebDriver webDriver;
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
        this.webDriver = webDriver;
    }

    public boolean isShoppingCartEmpty(){
        List<WebElement> itemsInCart = webDriver.findElements(cartItem);
        return itemsInCart.size() == 0;
    }

    public boolean isShoppingCartBadgePresentAndCorrect(){
        List<WebElement> itemsInCart = webDriver.findElements(cartItem);
        return itemsInCart.size() == Integer.parseInt(webDriver.findElement(cartBadgeQuantity).getText());
    }

    public boolean isItemQuantitiesCorrect(){
        List<WebElement> itemsInCart = webDriver.findElements(cartQuantity);
        for (WebElement webElement : itemsInCart){
            if (!webElement.getText().equals("1"))
                return false;
        }
        return true;
    }

    public boolean isQuantityLabelPresent(){
        return webDriver.findElement(quantityLabel).getText().equals("QTY");
    }

    public boolean isDescriptionLabelPresent(){
        return webDriver.findElement(description).getText().equals("DESCRIPTION");
    }

    public List<String> getItemNamesInCart(){
        List<String> itemNamesResult = new ArrayList<>();

        List<WebElement> itemNamesInCart = webDriver.findElements(itemName);
        for (WebElement webElement : itemNamesInCart){
            itemNamesResult.add(webElement.getText());
        }

        return itemNamesResult;
    }

    public List<String> getItemDescriptionsInCart(){
        List<String> itemDescriptionResult = new ArrayList<>();

        List<WebElement> itemDescriptionsInCart = webDriver.findElements(itemDescription);
        for (WebElement webElement : itemDescriptionsInCart){
            itemDescriptionResult.add(webElement.getText());
        }

        return itemDescriptionResult;
    }

    public List<String> getItemPricesInCart(){
        List<String> itemPricesResult = new ArrayList<>();

        List<WebElement> itemPricesInCart = webDriver.findElements(itemPrice);
        for (WebElement webElement : itemPricesInCart){
            itemPricesResult.add(webElement.getText());
        }

        return itemPricesResult;
    }

    public String getPaymentInformation(){
        List<WebElement> paymentInformationList = webDriver.findElements(paymentInformation);
        return paymentInformationList.get(0).getText();
    }

    public String getShippingInformation(){
        List<WebElement> paymentInformationList = webDriver.findElements(paymentInformation);
        return paymentInformationList.get(1).getText();
    }

    public String getSubtotalLabelAndPrice(){
        return webDriver.findElement(subTotalLabel).getText();
    }

    public String getTaxLabelAndPrice(){
        return webDriver.findElement(taxTotalLabel).getText();
    }

    public String getTotalLabelAndPrice(){
        return webDriver.findElement(totalPriceLabel).getText();
    }

    public void clickCancelButton(){
        webDriver.findElement(cancelButton).click();
    }

    public void clickFinishButton(){
        webDriver.findElement(finishButton).click();
    }
}
