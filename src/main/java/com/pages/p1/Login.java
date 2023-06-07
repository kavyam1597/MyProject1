package com.pages.p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	WebDriver driver;
	By user = By.name("username");
	By password = By.name("password");
	//By message = By.xpath("//p[contains(text(), 'Invalid credentials')]");
	//String alertMessage = driver.switchTo().alert().getText();
	//System.out.print(alertMessage);
	By login = By.xpath("//button[@type='submit']");
	
	//Constructor passing one parameter
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	//set the username in textbox
	public void setUsername(String strUsername) {
		driver.findElement(user).sendKeys(strUsername);
	}
	
	//set the password in textbox
	public void setPassword(String strPassword) {
		driver.findElement(password).sendKeys(strPassword);
	}
	
	//Click on login button
	public void clickOnLogin() {
		driver.findElement(login).click();
	}
	
//	//get the message of login page when wrong credentials are passed and error appears
//	public String getLoginErrorMessage() {
//		return alertMessage;
//	}
	
	// this POM method will be used in test cases to do the login
	public void loginToApplication(String strUsername,String strPassword) {
		this.setUsername(strUsername);//fill user name
		this.setPassword(strPassword); //to fill password
		this.clickOnLogin(); // to click login button
	}
}
