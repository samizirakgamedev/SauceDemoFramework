package org.runewriters.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * A class that represents the checkout stage one page in the Sauce Demo website
 */
public class CheckoutOnePage extends Page {

    // Accessing the web elements from the checkout stage one page that could be useful for the testers
    private By firstNameTextBox = new By.ById("first-name");
    private By lastNameTextBox = new By.ById("last-name");
    private By zipCodeTextBox = new By.ById("postal-code");
    private By cancelButton = new By.ById("cancel");
    private By continueButton = new By.ById("continue");

    public CheckoutOnePage(WebDriver webDriver) {
        super(webDriver);
        this.getDriver().get("https://www.saucedemo.com/checkout-step-one.html");
    }

    /**
     * Method for entering a string of choice into the first name text box
     */
    public void enterFirstNameInTextBox(String firstName) {
        try {
            this.getDriver().findElement(firstNameTextBox).sendKeys(firstName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method for entering a string of choice into the last name text box
     */
    public void enterLastNameInTextBox(String lastName) {
        try {
            this.getDriver().findElement(lastNameTextBox).sendKeys(lastName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method for entering a string of choice into the zipcode text box
     */
    public void enterZipCodeInTextBox(String zipCode) {
        try {
            this.getDriver().findElement(zipCodeTextBox).sendKeys(zipCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method for getting the current strings inserted inside the first name text box
     */
    public String getStringFromFirstNameTextBox() {
        try {
            return this.getDriver().findElement(firstNameTextBox).getAttribute("value");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Method for getting the current strings inserted inside the last name text box
     */
    public String getStringFromLastNameTextBox() {
        try {
            return this.getDriver().findElement(lastNameTextBox).getAttribute("value");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Method for getting the current strings inserted inside the zipcode text box
     */
    public String getStringFromZipCodeTextBox() {
        try {
            return this.getDriver().findElement(zipCodeTextBox).getAttribute("value");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Method for clicking the cancel check out button
     */
    public void clickCancelButton() {
        try {
            this.getDriver().findElement(cancelButton).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method for clicking the continue check out button
     */
    public void clickContinueButton() {
        try {
            this.getDriver().findElement(continueButton).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
