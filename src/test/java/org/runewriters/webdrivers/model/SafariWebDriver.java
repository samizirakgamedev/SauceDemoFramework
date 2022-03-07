package org.runewriters.webdrivers.model;

import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriverService;
import org.openqa.selenium.safari.SafariOptions;

import java.io.File;

public class SafariWebDriver extends WebDriverManager {

    private SafariDriverService safariDriverService;

    @Override
    protected void startService() {
//        if (null == safariDriverService) {
//            try {
//                safariDriverService = new SafariDriverService.Builder()
//                        .usingDriverExecutable(new File("src/test/resources/safaridriver.exe"))
//                        .usingAnyFreePort()
//                        .build();
//                safariDriverService.start();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
    }

    @Override
    protected void stopService() {
        //       if (null != safariDriverService && safariDriverService.isRunning())
//            safariDriverService.stop();
    }

    @Override
    protected void createDriver() {
        driver = new SafariDriver();
    }
}
