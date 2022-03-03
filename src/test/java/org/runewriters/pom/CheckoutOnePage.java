package org.runewriters.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOnePage extends Page{

    private By firstNameTextBox = new By.ById("first-name");
    private By lastNameTextBox = new By.ById("last-name");
    private By zipCodeTextBox = new By.ById("postal-code");
    private By cancelButton = new By.ById("cancel");
    private By continueButton = new By.ById("continue");

    public CheckoutOnePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void enterFirstNameInTextBox(String firstName){
        this.getDriver().findElement(firstNameTextBox).sendKeys(firstName);
    }

    public void enterLastNameInTextBox(String lastName){
        this.getDriver().findElement(lastNameTextBox).sendKeys(lastName);
    }

    public void enterZipCodeInTextBox(String zipCode){
        this.getDriver().findElement(zipCodeTextBox).sendKeys(zipCode);
    }

    public String getStringFromFirstNameTextBox(){
        return this.getDriver().findElement(firstNameTextBox).getAttribute("value");
    }

    public String getStringFromLastNameTextBox(){
        return this.getDriver().findElement(lastNameTextBox).getAttribute("value");
    }

    public String getStringFromZipCodeTextBox(){
        return this.getDriver().findElement(zipCodeTextBox).getAttribute("value");
    }

    public void clickCancelButton(){
        this.getDriver().findElement(cancelButton).click();
    }

    public void clickContinueButton(){
        this.getDriver().findElement(continueButton).click();
    }
}
