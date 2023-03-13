package org.example.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectWebDriver {
    static WebDriver chromeDriver;

    public static WebDriver getChromeDriver() {
        return chromeDriver;
    }

    public static void webDriverStart(String url){
    System.setProperty("webdriver.chrome.driver","chromedriver");

        chromeDriver = new ChromeDriver();
        chromeDriver.get(url);
        chromeDriver.manage().window().maximize();
    }
}
