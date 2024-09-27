package com.cjc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Continue_page {
	WebDriver dr;
	@FindBy(xpath = "//*[@id=\"billing-buttons-container\"]/input")
	WebElement con;
	@FindBy(xpath = "//*[@id=\"shipping-buttons-container\"]/input")
	@CacheLookup
	WebElement cont;
	@FindBy(xpath = "//*[@id=\"shipping-method-buttons-container\"]/input")
	@CacheLookup
	WebElement conti;
	@FindBy(xpath = "//*[@id=\"payment-method-buttons-container\"]/input")
	WebElement pay;
	@FindBy(xpath = "//*[@id=\"payment-info-buttons-container\"]/input")
	WebElement payc;
	@FindBy(xpath = "//*[@id=\"confirm-order-buttons-container\"]/input")
	WebElement conf;
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input")
	WebElement lastc;
	public void continuebuttons() throws InterruptedException {
		con.click();
		Thread.sleep(1000);
		cont.click();
		Thread.sleep(1000);
		conti.click();
		Thread.sleep(1000);
		pay.click();
		Thread.sleep(1000);
		payc.click();
		Thread.sleep(1000);
		conf.click();
		Thread.sleep(1000);
		lastc.click();
		Thread.sleep(1000);
	}
}
