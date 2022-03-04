package org.runewriters.webdrivers.model;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.ie.InternetExplorerOptions;

import java.io.File;

public class IEWebDriver extends WebDriverManager {

    private InternetExplorerDriverService internetExplorerDriverService;

    @Override
    protected void startService() {
        if (null == internetExplorerDriverService) {
            try {
                System.setProperty("webdriver.ie.driver", "src/test/resources/IEDriverServer.exe");
                internetExplorerDriverService = new InternetExplorerDriverService.Builder().
                        usingDriverExecutable(new File("src/test/resources/IEDriverServer.exe"))
                        .usingAnyFreePort()
                        .build();
                internetExplorerDriverService.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void stopService() {
        if (null != internetExplorerDriverService && internetExplorerDriverService.isRunning())
            internetExplorerDriverService.stop();
    }

    @Override
    protected void createDriver() {
        InternetExplorerOptions options = new InternetExplorerOptions();
        options.addCommandSwitches("headless");
        driver = new InternetExplorerDriver(internetExplorerDriverService,options);
    }
}

