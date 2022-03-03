package org.runewriters.webdrivers.model;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;

import java.io.File;

public class FirefoxWebDriver extends WebDriverManager{

    private GeckoDriverService firefoxWebDriver;

    @Override
    protected void startService() {
        if (null == firefoxWebDriver) {
            try {
                firefoxWebDriver = new GeckoDriverService.Builder()
                        .usingDriverExecutable(new File("src/test/resources/geckodriver.exe"))
                        .usingAnyFreePort()
                        .build();
                firefoxWebDriver.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void stopService() {
        if (null != firefoxWebDriver && firefoxWebDriver.isRunning())
            firefoxWebDriver.stop();
    }

    @Override
    protected void createDriver() {
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:/Program Files/Mozilla Firefox/firefox.exe");
        options.setHeadless(true);
        driver = new FirefoxDriver(firefoxWebDriver,options);
    }
}
