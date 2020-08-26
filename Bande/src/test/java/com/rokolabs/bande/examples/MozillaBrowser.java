package com.rokolabs.bande.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MozillaBrowser {

    public static void main(String[] args) {


        System.setProperty("webdriver.gecko.driver", "C:\\drivers\\Mozilla\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("xxxxxxxxx");
        driver.manage().window().maximize();

    }
}
