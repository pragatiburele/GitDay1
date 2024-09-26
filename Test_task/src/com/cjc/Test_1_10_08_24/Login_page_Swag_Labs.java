package com.cjc.Test_1_10_08_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_page_Swag_Labs {
public static void main(String[] args) {
	System.out.println("hello");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Rupali\\Desktop\\Selenium files\\chromedriver-win64\\chromedriver.exe");
	WebDriver dr=new ChromeDriver();
	dr.get("https://www.saucedemo.com/");
	dr.manage().window().maximize();
	
	dr.findElement(By.xpath("//input[@name=\"user-name\"]")).sendKeys("shiavniburele");
	dr.findElement(By.cssSelector("input#password")).sendKeys("pass@123");
	dr.findElement(By.xpath("//input[@name=\"login-button\"]")).click();
}

}
