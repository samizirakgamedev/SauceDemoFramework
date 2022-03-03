package org.runewriters.webdrivers;

import org.openqa.selenium.WebDriver;
import org.runewriters.webdrivers.model.WebDriverManager;
import org.runewriters.webdrivers.model.WebDriverType;

public class WebDriverTest {

    public static void chromeTest(){
        WebDriverManager driverManager;
        WebDriver driver;
        String desiredPage = "https://www.google.com/";

        driverManager = WebDriverFactory.getManager(WebDriverType.CHROME);
        driver = driverManager.getDriver();
        driver.get(desiredPage);

        if (driver.getCurrentUrl().equals(desiredPage))
            System.out.println(">>> Chrome Driver Functioning <<<");
        driverManager.quitDriver();
    }

    public static void firefoxTest(){
        WebDriverManager driverManager;
        WebDriver driver;
        String desiredPage = "https://www.google.com/";

        driverManager = WebDriverFactory.getManager(WebDriverType.FIREFOX);
        driver = driverManager.getDriver();
        driver.get(desiredPage);

        if (driver.getCurrentUrl().equals(desiredPage))
            System.out.println(">>> Firefox Driver Functioning <<<");
        driverManager.quitDriver();
    }

    public static void ieTest(){
        WebDriverManager driverManager;
        WebDriver driver;
        String desiredPage = "https://www.google.com/";

        driverManager = WebDriverFactory.getManager(WebDriverType.IE);
        driver = driverManager.getDriver();
        driver.get(desiredPage);

        if (driver.getCurrentUrl().equals(desiredPage))
            System.out.println(">>> IE Driver Functioning <<<");
        driverManager.quitDriver();
    }

    public static void main(String[] args) {
        chromeTest();
        firefoxTest();
        ieTest();
    }
}
