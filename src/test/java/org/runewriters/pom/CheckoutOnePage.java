package org.runewriters.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOnePage extends Page{

    private WebDriver webDriver;
    private By firstNameTextBox = new By.ById("first-name");
    private By lastNameTextBox = new By.ById("last-name");
    private By zipCodeTextBox = new By.ById("postal-code");
    private By cancelButton = new By.ById("cancel");
    private By continueButton = new By.ById("continue");

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
