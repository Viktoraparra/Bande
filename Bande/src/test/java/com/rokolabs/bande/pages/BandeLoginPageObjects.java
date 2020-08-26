package com.rokolabs.bande.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class BandeLoginPageObjects {

    WebDriver driver = null;


    By textbox_email = By.name("email");
    By textbox_password = By.name("password");
    By show_password = By.className("input-password__show-password");
    By forgot_password = By.className("button button--link button--size-common button--secondary button--text-color-common button--text-decoration-underline login__button--forget-password");
    By login_button = By.xpath("//div[@class='button button--common button--size-big button--primary button--text-color-white login__button']");

    public BandeLoginPageObjects(WebDriver driver){
        this.driver = driver;
    }

    public void setTextbox_email(String email){
        driver.findElement(textbox_email).sendKeys(email);
    }

    public void setTextbox_password(String password){
        driver.findElement(textbox_password).sendKeys(password);
    }

    public void click_Show_password(){
        driver.findElement(show_password).click();
    }
    public void click_forgot_password(){
        driver.findElement(forgot_password).click();
    }
    public void click_login_button(){
        driver.findElement(login_button).click();
    }
    public void enter_login_button(){
        driver.findElement(login_button).sendKeys(Keys.ENTER);
    }

}
