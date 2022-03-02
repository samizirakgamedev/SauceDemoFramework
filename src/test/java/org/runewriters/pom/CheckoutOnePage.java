package org.runewriters.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOnePage {

    private WebDriver webDriver;
    By firstNameTextBox = new By.ById("first-name");
    By lastNameTextBox = new By.ById("last-name");
    By zipCodeTextBox = new By.ById("postal-code");
    By cancelButton = new By.ById("cancel");
    By continueButton = new By.ById("continue");

    public CheckoutOnePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void enterFirstNameInTextBox(String firstName){
        webDriver.findElement(firstNameTextBox).sendKeys(firstName);
    }

    public void enterLastNameInTextBox(String lastName){
        webDriver.findElement(lastNameTextBox).sendKeys(lastName);
    }

    public void enterZipCodeInTextBox(String zipCode){
        webDriver.findElement(zipCodeTextBox).sendKeys(zipCode);
    }

    public String getStringFromFirstNameTextBox(){
        return webDriver.findElement(firstNameTextBox).getAttribute("value");
    }

    public String getStringFromLastNameTextBox(){
        return webDriver.findElement(lastNameTextBox).getAttribute("value");
    }

    public String getStringFromZipCodeTextBox(){
        return webDriver.findElement(zipCodeTextBox).getAttribute("value");
    }

    public void clickCancelButton(){
        webDriver.findElement(cancelButton).click();
    }

    public void clickContinueButton(){
        webDriver.findElement(continueButton).click();
    }
}
