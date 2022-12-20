package com.amazon.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class baseClass {


    public static WebDriver driver;

    public void initializeBrowser()
    {
        System.setProperty("chromedriver.web.driver",System.getProperty("user.dir")+"/Browsers/chromedriver");
         driver=new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }



    public void tearDown()
    {
        driver.quit();
    }



}
