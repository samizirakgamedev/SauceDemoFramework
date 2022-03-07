package org.runewriters.webdrivers;

import org.runewriters.webdrivers.model.*;

public class WebDriverFactory {

    public static WebDriverManager getManager(WebDriverType type){
        WebDriverManager driverManager = null;

        switch (type){
            case CHROME -> driverManager = new ChromeWebDriver();
            case FIREFOX -> driverManager = new FirefoxWebDriver();
            case IE -> driverManager = new IEWebDriver();
            case SAFARI -> driverManager = new SafariWebDriver();
            case OPERA -> driverManager = new OperaWebDriver();
        }
        return driverManager;
    }
}
