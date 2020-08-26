package com.rokolabs.bande.test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.rokolabs.bande.pages.BandeLoginPageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BandeLoginTestNG {

    private static WebDriver driver = null;
    
    static ExtentHtmlReporter htmlreport = new ExtentHtmlReporter("Report.html");
	
	static ExtentReports extent = new ExtentReports();
	
	public static void main(String[] args) {
		extent.attachReporter(htmlreport);
	}
	
	

    @BeforeTest
    public void setUpTest(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public static void valid_user_login(){
    	
    	ExtentTest test = extent.createTest("login valid user TC01", "Validate login as user");
    	    	
    	test.log(Status.INFO, "Starting Valid user test case");
    	test.assignAuthor("Victor Parra");
        // Navigate to...
    	driver.get("xxxxxxxx");
        
        test.log(Status.PASS, "navigated to Login page");
        driver.manage().window().maximize();

        BandeLoginPageObjects login = new BandeLoginPageObjects(driver);

        // Populate email texbox
        login.setTextbox_email("xxxx");
        test.log(Status.PASS, "populate User email textfield");
     // Populate password texbox
        login.setTextbox_password("xxxxxx");
        test.log(Status.PASS, "Populated password textfield");
        login.click_Show_password();
        test.log(Status.PASS, "Click to view password");
        login.click_login_button();
        test.log(Status.PASS, "Click login button");
        // Still looking options to validate log in need to use cucumber 
        driver.findElement(By.className("avatar avatar--small avatar--circle"));
        test.log(Status.PASS, "User is Log in");
        
        test.info("Test Completed");
        
        extent.flush();
    }

    @AfterTest
    public void tearDownTest(){
     	
        driver.close();
        driver.quit();
        System.out.println("Test Completed completly");
    }
}
