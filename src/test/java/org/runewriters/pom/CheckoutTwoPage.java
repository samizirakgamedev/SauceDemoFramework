package org.runewriters.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CheckoutTwoPage extends Page {

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

    public boolean isShoppingCartEmpty(){
        List<WebElement> itemsInCart = this.getDriver().findElements(cartItem);
        return itemsInCart.size() == 0;
    }

    public boolean isShoppingCartBadgePresentAndCorrect(){
        List<WebElement> itemsInCart = this.getDriver().findElements(cartItem);
        return itemsInCart.size() == Integer.parseInt(this.getDriver().findElement(cartBadgeQuantity).getText());
    }

    public boolean isItemQuantitiesCorrect(){
        List<WebElement> itemsInCart = this.getDriver().findElements(cartQuantity);
        for (WebElement webElement : itemsInCart){
            if (!webElement.getText().equals("1"))
                return false;
        }
        return true;
    }

    public boolean isQuantityLabelPresent(){
        return this.getDriver().findElement(quantityLabel).getText().equals("QTY");
    }

    public boolean isDescriptionLabelPresent(){
        return this.getDriver().findElement(description).getText().equals("DESCRIPTION");
    }

    public List<String> getItemNamesInCart(){
        List<String> itemNamesResult = new ArrayList<>();

        List<WebElement> itemNamesInCart = this.getDriver().findElements(itemName);
        for (WebElement webElement : itemNamesInCart){
            itemNamesResult.add(webElement.getText());
        }

        return itemNamesResult;
    }

    public List<String> getItemDescriptionsInCart(){
        List<String> itemDescriptionResult = new ArrayList<>();

        List<WebElement> itemDescriptionsInCart = this.getDriver().findElements(itemDescription);
        for (WebElement webElement : itemDescriptionsInCart){
            itemDescriptionResult.add(webElement.getText());
        }

        return itemDescriptionResult;
    }

    public List<String> getItemPricesInCart(){
        List<String> itemPricesResult = new ArrayList<>();

        List<WebElement> itemPricesInCart = this.getDriver().findElements(itemPrice);
        for (WebElement webElement : itemPricesInCart){
            itemPricesResult.add(webElement.getText());
        }

        return itemPricesResult;
    }

    public String getPaymentInformation(){
        List<WebElement> paymentInformationList = this.getDriver().findElements(paymentInformation);
        return paymentInformationList.get(0).getText();
    }

    public String getShippingInformation(){
        List<WebElement> paymentInformationList = this.getDriver().findElements(paymentInformation);
        return paymentInformationList.get(1).getText();
    }

    public String getSubtotalLabelAndPrice(){
        return this.getDriver().findElement(subTotalLabel).getText();
    }

    public String getTaxLabelAndPrice(){
        return this.getDriver().findElement(taxTotalLabel).getText();
    }

    public String getTotalLabelAndPrice(){
        return this.getDriver().findElement(totalPriceLabel).getText();
    }

    public void clickCancelButton(){
        this.getDriver().findElement(cancelButton).click();
    }

    public void clickFinishButton(){
        this.getDriver().findElement(finishButton).click();
    }
}
