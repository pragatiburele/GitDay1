package com.cjc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Login_page {
	WebDriver dr;
	@FindBy(xpath = "//a[@href=\"/logout\"]")
	WebElement logout;
	@FindBy(xpath = "//a[@href=\"/login\"]")
	WebElement login;
	@FindBy(xpath = "//input[@name=\"Email\"]")
	WebElement user;
	@FindBy(xpath = "//input[@id=\"Password\"]")
	WebElement pass;
	@FindBy(xpath = "//input[@type=\"checkbox\"]")
	WebElement rem;
	@FindBy(xpath = "//input[@class=\"button-1 login-button\"]")
	WebElement logb;

	public Login_page(WebDriver dr){
	this.dr=dr;	
	}
	public void loginmethod(String us,String ps) {
		logout.click();
		login.click();
		user.sendKeys(us);
		Assert.assertEquals(us, us);
		System.out.println("username");
		pass.sendKeys(ps);
		Assert.assertEquals(ps, ps);
		System.out.println("password");
		rem.click();
		logb.click();
		
	}
}
