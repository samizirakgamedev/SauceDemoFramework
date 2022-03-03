package org.runewriters.pom;

public class PomUtils {

    // TODO - Different options for setting driver location

    public static void setDriverLocation(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
    }
}
