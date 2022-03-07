package org.runewriters.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * A class that represents all the common features between all the pages in the Sauce Demo website
 */
public abstract class Page {

    // All the web elements needed and the web driver declaration
    private WebDriver driver;
    private By appLogo = new By.ByClassName("app_logo");
    private By pageTitle = new By.ByClassName("title");
    private By footerImage = new By.ByClassName("footer_robot");
    private By footerText = new By.ByClassName("footer_copy");
    private By sideMenuButton = new By.ById("react-burger-menu-btn");
    private By exitSideMenuButton = new By.ById("react-burger-cross-btn");
    private By cartIcon = new By.ByClassName("shopping_cart_link");
    private By twitterIcon = new By.ByLinkText("Twitter");
    private By facebookIcon = new By.ByLinkText("Facebook");
    private By linkedinIcon = new By.ByLinkText("LinkedIn");

    public Page(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Method which returns the webdriver for other pages to use in their own methods
     */
    public WebDriver getDriver() {
        try {
            return driver;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Method which determines whether the page logo is present
     */
    public Boolean isLogoPresent() {
        try {
            return driver.findElement(appLogo).getAttribute("class").equals("app_logo");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Method for checking if the page title is correct by passing in the title that the page should have
     */
    public Boolean isPageTitleCorrect(String title) {
        try {
            return driver.findElement(pageTitle).getText().equals(title);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Method for checking if the footer image is present in the page
     */
    public Boolean isFooterImagePresent() {
        try {
            return driver.findElement(footerImage).getAttribute("alt").equals("Swag Bot Footer");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Method for checking if the footer text is present
     */
    public Boolean isFooterTextPresent() {
        try {
            return driver.findElement(footerText).getAttribute("class").equals("footer_copy");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Method for clicking the side menu, which is to be used to click the other options within it
     */
    public void clickSideMenu() {
        try {
            driver.findElement(sideMenuButton).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method for closing the side menu
     */
    public void closeSideMenu() {
        try {
            driver.findElement(exitSideMenuButton).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method for clicking and choosing the 'All items' option
     */
    public void clickAllItemsFromSideMenu() {
        try {
            By sideMenuOptionsLink = new By.ById("inventory_sidebar_link");
            driver.findElement(sideMenuOptionsLink).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method for clicking and choosing the 'About' option
     */
    public void clickAboutFromSideMenu() {
        try {
            By sideMenuOptionsLink = new By.ById("about_sidebar_link");
            driver.findElement(sideMenuOptionsLink).click();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Method for clicking the 'Log out' option
     */
    public void clickLogoutFromSideMenu() {
        try {
            By sideMenuOptionsLink = new By.ById("logout_sidebar_link");
            driver.findElement(sideMenuOptionsLink).click();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Method for choosing the 'App state' option
     */
    public void clickResetAppStateFromSideMenu() {
        try {
            By sideMenuOptionsLink = new By.ById("reset_sidebar_link");
            driver.findElement(sideMenuOptionsLink).click();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Method for clicking the cart Icon
     */
    public void clickCartIcon() {
        try {
            driver.findElement(cartIcon).click();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Method for clicking the twitter icon in the footer
     */
    public void clickTwitterIcon() {
        try {
            driver.findElement(twitterIcon).click();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Method for clicking the facebook icon in the footer
     */
    public void clickFacebookIcon() {
        try {
            driver.findElement(facebookIcon).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method for clicking the linked in icon in the footer
     */
    public void clickLinkedinIcon() {
        try {
            driver.findElement(linkedinIcon).click();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Method for returning the current url that the driver is in
     */
    public String getCurrentURL() {
        try {
            return driver.getCurrentUrl();
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
