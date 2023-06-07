package com.pages.p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomeScreen {
	
	WebDriver driver;
	By title = By.xpath("//html//head//title[contains(text(), 'OrangeHRM')]");
	
	public HomeScreen(WebDriver driver) {
		this.driver = driver;
	}
	
	//Get the UserName from the HomePage
	public String getPageTitle() {
		return driver.findElement(title).getText();
	}

}
