package com.rokolabs.bande.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BandeUserPageObjects {
	
	 WebDriver driver = null;
	 
	 // principal Nav bar
	 By nav_bar_liveSchedule = By.xpath("//div[contains(text(),'Live Schedule')]");
	 By navbar_onDemand = By.xpath("//div[contains(text(),'On Demand')]");
	 By navbar_instructor = By.xpath("//div[contains(text(),'Instructors')]");
	 By navbar_classes = By.xpath("//div[@class='navigation-tabs navigation-tabs--main']//div[@class='navigation-tab__button'][contains(text(),'Classes')]");
	 By navbar_avatar = By.className("avatar avatar--small avatar--circle");
	 
	 // Nav buttons from Live Schedule
	 By liveSchedule_allClasses = By.xpath("//div[contains(text(),'All Classes')]");
	 By liveSchedule_myClasses = By.xpath("//div[contains(text(),'My Classes')]");
	 By liveSchedule_friendsClasses = By.xpath("//div[contains(text(),\"Friend's Classes\")]");
	 
	 
	 

}
