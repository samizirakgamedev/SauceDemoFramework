package org.runewriters.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class Page {

    private WebDriver driver;
    private By appLogo = new By.ByClassName("app_logo");
    private By pageTitle = new By.ByClassName("title");
    private By footerImage = new By.ByClassName("footer_robot");
    private By footerText = new By.ByClassName("footer_copy");
    private By sideMenuButton = new By.ById("react-burger-menu-btn");
    private By sideMenuOptionsLink = new By.ByClassName("btn-item menu-item");
    private By exitSideMenuButton = new By.ById("react-burger-cross-btn");
    private By cartIcon = new By.ByClassName("shopping_cart_link");
    private By twitterIcon = new By.ByLinkText("Twitter");
    private By facebookIcon = new By.ByLinkText("Facebook");
    private By linkedinIcon = new By.ByLinkText("LinkedIn");

    public boolean isLogoPresent() {
        return driver.findElement(appLogo).getAttribute("class").equals("app_logo");
    }

    public boolean isPageTitleCorrect(String title){
        return driver.findElement(pageTitle).getText().equals(title);
    }

    public boolean isFooterImagePresent(){
        return driver.findElement(footerImage).getAttribute("alt").equals("Swag Bot Footer");
    }

    public boolean isFooterTextPresent(){
        return driver.findElement(footerText).getAttribute("class").equals("footer_copy");
    }

    public void clickSideMenu(){
        driver.findElement(sideMenuButton).click();
    }

    public void closeSideMenu(){
        driver.findElement(exitSideMenuButton).click();
    }

    public void clickAllItemsFromSideMenu(){
        driver.findElements(sideMenuOptionsLink).get(0).click();
    }

    public void clickAboutFromSideMenu(){
        driver.findElements(sideMenuOptionsLink).get(1).click();
    }

    public void clickLogoutFromSideMenu(){
        driver.findElements(sideMenuOptionsLink).get(2).click();
    }

    public void clickResetAppStateFromSideMenu(){
        driver.findElements(sideMenuOptionsLink).get(3).click();
    }

    public void clickCartIcon(){
        driver.findElement(cartIcon).click();
    }

    public void clickTwitterIcon(){
        driver.findElement(twitterIcon).click();
    }

    public void clickFacebookIcon(){
        driver.findElement(facebookIcon).click();
    }

    public void clickLinkedinIcon(){
        driver.findElement(linkedinIcon).click();
    }

    public String getCurrentURL(){
        return driver.getCurrentUrl();
    }
}
