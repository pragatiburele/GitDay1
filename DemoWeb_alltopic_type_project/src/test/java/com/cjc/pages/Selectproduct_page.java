package com.cjc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Selectproduct_page {
	WebDriver dr;
	@FindBy(linkText = "Books")
	WebElement book;
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input")
	WebElement add;
	@FindBy(linkText = "Shopping cart")
	WebElement shopping;
	@FindBy(xpath = "//input[@id=\"termsofservice\"]")
	WebElement checkbox;
	@FindBy(xpath = "//button[@id=\"checkout\"]")
	WebElement chkout;
	public Selectproduct_page() {
		this.dr=dr;
		
	}
	public void contiunpro() {
		book.click();
		
		add.click();
		shopping.click();
		checkbox.click();
		chkout.click();
		
	}
}
