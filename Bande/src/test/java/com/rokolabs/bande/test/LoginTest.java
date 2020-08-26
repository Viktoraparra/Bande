package com.rokolabs.bande.test;

import com.rokolabs.bande.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

    private static WebDriver driver =null;

    public static void main(String[] args) {
        login_valid_user();
    }

    public static void login_valid_user(){

        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        driver = new FirefoxDriver();

        driver.get("xxxxxxxx");

        // Make the call for the email textbox and fill the text_box with a valid email
        LoginPage.textbox_email(driver).sendKeys("xxxxxxxxxx");
        // execute the call for the password textbox and populate with a valid password
        LoginPage.textbox_password(driver).sendKeys("xxxxxxxxx");
        // execute the call to show password and click to show the password
        LoginPage.password_show_password(driver).click();
        // execute the call for the button and click login
        LoginPage.log_in_button(driver).click();


        driver.close();
    }
}
