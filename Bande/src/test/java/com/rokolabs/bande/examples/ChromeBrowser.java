package com.rokolabs.bande.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeBrowser {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("xxxxxxxxxxx");
        driver.manage().window().maximize();

    }
}
