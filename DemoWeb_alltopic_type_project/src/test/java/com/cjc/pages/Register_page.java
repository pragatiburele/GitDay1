package com.cjc.pages;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Register_page {
	WebDriver dr;
	@FindBy(xpath = "//input[@id=\"gender-female\"]")
	WebElement gen;
	@FindBy(xpath = "//input[@id=\"FirstName\"]")
	WebElement fnn;
	@FindBy(xpath = "//input[@id=\"LastName\"]")
	WebElement lnn;
	@FindBy(xpath = "//input[@id=\"Email\"]")
	WebElement emm;
	@FindBy(xpath = "//input[@id=\"Password\"]")
	WebElement pass;
	@FindBy(xpath = "//input[@name=\"ConfirmPassword\"]")
	WebElement cpas;
	@FindBy(xpath = "//input[@id=\"register-button\"]")
	WebElement submit;
	
public Register_page(WebDriver dr) {
	this.dr=dr;
}

public void registermethod() throws IOException {
	Properties pro=new Properties();
	FileInputStream fs=new FileInputStream("src/test/resources/propertiesfiles/Register_page_details");
	pro.load(fs);
	gen.click();
	fnn.sendKeys(pro.getProperty("firstname"));
	lnn.sendKeys(pro.getProperty("lastname"));
	emm.sendKeys(pro.getProperty("email"));
	pass.sendKeys(pro.getProperty("password"));
	cpas.sendKeys(pro.getProperty("confirmpass"));
	submit.click();
	
}
}