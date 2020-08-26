package com.rokolabs.bande.examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebMB {

    public static void main(String[] args) {
        // Browser Edge
        // WebDriverManager.edgedriver().setup();
        // Browser FireFox
        // WebDriverManager.firefoxdriver().setup();
        // Browser Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("xxxxxxxxxxxx");
        driver.close();
        driver.quit();
    }
}
