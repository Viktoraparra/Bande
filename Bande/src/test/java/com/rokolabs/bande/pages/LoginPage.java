package com.rokolabs.bande.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
 * This is deprecated is a example with webelements
 */


public class LoginPage {

    protected static WebElement element = null;

    protected static WebDriver driver;

    public static WebElement textbox_email(WebDriver driver) {
        WebElement element = driver.findElement(By.name("email"));
        return element;
    }

    public static WebElement textbox_password(WebDriver driver){
        WebElement element = driver.findElement(By.name("password"));
        return element;
    }

    public static WebElement password_show_password(WebDriver driver){
        WebElement element = driver.findElement(By.className("input-password__show-password"));
        return element;
    }

    public static WebElement forgot_password(WebDriver driver) {
        WebElement element = driver.findElement(
                By.className("button button--link button--size-common button--secondary button--text-color-common button--text-decoration-underline login__button--forget-password"));
        return element;
    }

    public static WebElement log_in_button(WebDriver driver) {
        WebElement element = driver.findElement(
                By.xpath("//div[@class='button button--common button--size-big button--primary button--text-color-white login__button']"));
        return  element;
    }
}
