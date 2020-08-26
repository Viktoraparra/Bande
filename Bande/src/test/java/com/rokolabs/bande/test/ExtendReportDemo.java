package com.rokolabs.bande.test;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReportDemo {
	
	private static WebDriver driver = null;
	
	ExtentHtmlReporter htmlreport = new ExtentHtmlReporter("Report.html");
	
	ExtentReports extent = new ExtentReports();
	
	ExtentTest test = extent.createTest("login valid user TC01", "Validate login as user");
	
	

}
