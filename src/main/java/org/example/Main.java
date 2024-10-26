package org.example;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFTable;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import utils.FileUtility;

public class Main {
    WebDriver driver=null;

    public void setUp(){
        driver = DriverFactory.getDriver("firefox");
        driver.get("https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml/5.3.0");
        

    }
    public void test1(){
        String title = driver.getTitle();
        System.out.println(title);
    }


    public void tearDown(){
        driver.quit();
    }
}