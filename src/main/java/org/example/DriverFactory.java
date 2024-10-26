package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
    public static WebDriver getDriver(String browser){
        WebDriver driver=null;
        if(browser.equalsIgnoreCase("firefox")){
            driver= new FirefoxDriver();

        }
        else if(browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }
        else{
            driver= new InternetExplorerDriver();
        }
        return driver;
    }
}
