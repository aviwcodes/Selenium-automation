package org.example;

import org.openqa.selenium.WebDriver;

public class MainClass {
    public static void main(String args[]){
    WebDriver driver=null;


        driver = DriverFactory.getDriver("firefox");
        driver.get("https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml/5.3.0");
        

        String title = driver.getTitle();
        System.out.println(title);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}