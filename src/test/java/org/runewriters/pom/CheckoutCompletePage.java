package org.runewriters.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePage extends Page {

    private WebDriver webDriver;
    private By completeHeader = new By.ByClassName("complete-header");
    private By ponyExpressImage = new By.ByClassName("pony_express");
    private By backHomeButton = new By.ByClassName("btn btn_primary btn_small");

    public CheckoutCompletePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public boolean isCompleteHeaderPresent(){
        return webDriver.findElement(completeHeader).getText().equals("THANK YOU FOR YOUR ORDER");
    }

    public boolean isCompletedImagePresent(){
        return webDriver.findElement(ponyExpressImage).getAttribute("alt").equals("Pony Express");

    }

    public void clickBackHomeButton(){
        webDriver.findElement(backHomeButton).click();
    }
}
