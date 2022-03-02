package org.runewriters.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;

public class LoginPage {
    private WebDriver webDriver;
    By username = new By.ById("user-name");
    By password = new By.ById("password");
    By loginButton = new By.ById("login-button");
//    By loginLogo = new By.ByClassName("login_logo");
//    By loginBot = new By.ByClassName("bot_column");

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public boolean areThereDetails(String stringUser, String stringPassword) {
        if (webDriver.findElement(password).equals("") || webDriver.findElement(username).equals("")) {
            return false;
        }
        return true;
    }

    public boolean isValidUser() {
        ArrayList<String> users = new ArrayList<>(Arrays.asList("standard_user", "locked_out_user", "problem_user", "performance_glitch_user"));
        return users.contains(webDriver.findElement(username).getText());
    }

    public boolean isValidPassword(String pass) {
        return webDriver.findElement(password).getText().equals(pass);
    }

    public boolean canUserLogin() {
        return webDriver.findElement(loginButton).isEnabled();
    }

//    public boolean isLoginLogo() {
//        return webDriver.findElement(loginLogo).isDisplayed();
//    }
//
//    public boolean isBotLogo() {
//        return webDriver.findElement(loginLogo).isEnabled();
//    }

}
