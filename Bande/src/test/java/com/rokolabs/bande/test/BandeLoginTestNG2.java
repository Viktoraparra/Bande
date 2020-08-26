package com.rokolabs.bande.test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.rokolabs.bande.pages.BandeLoginPageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BandeLoginTestNG2 {

    private static WebDriver driver = null;
    
    ExtentHtmlReporter htmlreport;
    static ExtentReports extent;
        
    
    @BeforeSuite
    public void setUp(){
    	
    	htmlreport = new ExtentHtmlReporter("Report.html");
    	extent = new ExtentReports();
    	extent.attachReporter(htmlreport);
        

    }
    
    @BeforeTest
    public void setUpTest() {
    	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public static void valid_user_login() throws Exception {
    	
    	
    	MediaEntityModelProvider mediaModel = MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build();
    	
    	ExtentTest test = extent.createTest("login valid user TC01", "Validate login as user");
    	    	
    	test.log(Status.INFO, "Starting Valid user test case");
    	test.assignAuthor("Victor Parra");
    	// Navigate to...
        driver.get("xxxxxxxxxx");
        test.log(Status.PASS, "navigated to Login page");
        driver.manage().window().maximize();

        BandeLoginPageObjects login = new BandeLoginPageObjects(driver);

        test.addScreenCaptureFromPath("screenshot.png");
     // Populate email texbox
        login.setTextbox_email("xxxxxxx");
        test.log(Status.PASS, "populate User email textfield");
        // Populate password texbox
        login.setTextbox_password("Welcome01!");
        test.log(Status.PASS, "Populated password textfield");
        login.click_Show_password();
        test.log(Status.PASS, "Click to view password");
        test.addScreenCaptureFromPath("screenshot.png");
        login.click_login_button();
        test.log(Status.PASS, "Click login button");
        driver.wait(20);
        
        test.info("Test Completed");
        
        
    }
    
    @AfterTest
    public void tearDownTest() {
    	driver.close();
    	driver.quit();
    	System.out.println("Test completed Successfully!");
    }

    @AfterSuite
    public void tearDown(){
     	
    	extent.flush();
    }
}
