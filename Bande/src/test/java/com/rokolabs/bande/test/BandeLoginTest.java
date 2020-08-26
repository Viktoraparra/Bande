package com.rokolabs.bande.test;

import com.rokolabs.bande.pages.BandeLoginPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BandeLoginTest {

    private WebDriver driver = null;

    public static void main(String[] args) {

    }

    public static void valid_user_login(){
        System.setProperty("webdriver.chrome.driver", "C:\\Rokolabs\\Bande\\drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("xxxxx");
        driver.manage().window().maximize();

        BandeLoginPageObjects login = new BandeLoginPageObjects(driver);

        login.setTextbox_email("xxxxxxx");
        login.setTextbox_password("xxxxx");
        login.click_Show_password();
        login.click_login_button();

        driver.close();
    }
}
