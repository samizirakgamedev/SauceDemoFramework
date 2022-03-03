package org.runewriters.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Page {
    private WebDriver webDriver;
    private By usernameTextBox = new By.ById("user-name");
    private By passwordTextBox = new By.ById("password");
    private By loginButton = new By.ById("login-button");


    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void enterUsername(String username){
        webDriver.findElement(usernameTextBox).sendKeys(username);
    }

    public void enterPassword(String password){
        webDriver.findElement(passwordTextBox).sendKeys(password);
    }

    public void clickLogInButton(){
        webDriver.findElement(loginButton).click();
    }

}
