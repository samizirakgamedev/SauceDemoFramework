package org.runewriters.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Page {
    private By usernameTextBox = new By.ById("user-name");
    private By passwordTextBox = new By.ById("password");
    private By loginButton = new By.ById("login-button");


    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void enterUsername(String username){
        this.getDriver().findElement(usernameTextBox).sendKeys(username);
    }

    public void enterPassword(String password){
        this.getDriver().findElement(passwordTextBox).sendKeys(password);
    }

    public void clickLogInButton(){
        this.getDriver().findElement(loginButton).click();
    }

}
