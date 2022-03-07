package org.runewriters.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * A class that represents the checkout complete page in the Sauce Demo website
 */
public class CheckoutCompletePage extends Page {

    // Accessing the web elements from the checkout complete page that could be useful for the testers
    private By completeHeader = new By.ByClassName("complete-header");
    private By ponyExpressImage = new By.ByClassName("pony_express");
    private By backHomeButton = new By.ById("back-to-products");

    public CheckoutCompletePage(WebDriver webDriver) {
        super(webDriver);
        this.getDriver().get("https://www.saucedemo.com/checkout-complete.html");
    }

    /**
     * Returns a true or false depending on whether the complete checkout header exists
     */
    public Boolean isCompleteHeaderPresent() {
        try {
            return this.getDriver().findElement(completeHeader).getText().equals("THANK YOU FOR YOUR ORDER");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Returns a true or false depending on whether the complete checkout image exists
     */
    public Boolean isCompletedImagePresent() {
        try {
            return this.getDriver().findElement(ponyExpressImage).getAttribute("alt").equals("Pony Express");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * A method for clicking the back home button to go back to the inventory page
     */
    public void clickBackHomeButton() {
        try {
            this.getDriver().findElement(backHomeButton).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
