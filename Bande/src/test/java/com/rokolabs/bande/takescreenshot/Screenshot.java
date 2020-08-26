package com.rokolabs.bande.takescreenshot;

import org.openqa.selenium.OutputType;

/*
 *  not the best way to do a screenshot still studying a better way
 */
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import com.google.common.io.Files;

public class Screenshot {
	
	private int cont;
	private WebDriver driver;
	

	public Screenshot(WebDriver pdriver, int pcont) {
		this.driver = pdriver;
		this.cont = pcont;
	}
	
	public void takeScreenshot() {
		
		String route = "\\ScreenShot\\img_nro\\"+Integer.toBinaryString(cont)+".jpeg";
		
		File src = ((Screenshot)driver).getScreeshots(OutputType.FILE);
		
		try {
			FileUtils.copyFile(src, new File(route));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		cont += 1;
	}

}
