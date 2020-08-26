package com.rokolabs.bande.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "C:\\drivers\\Edge\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.navigate().to("xxxxxxxxx");
        driver.manage().window().maximize();
    }
}
