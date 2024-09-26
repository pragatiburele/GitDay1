package com.cjc.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_1 {
public static void main(String[] args) {
	System.out.println("hello selenium");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Rupali\\Desktop\\Selenium files\\chromedriver-win64\\chromedriver.exe");
	WebDriver dr=new ChromeDriver();
	dr.get("https://www.facebook.com/");
	dr.manage().window().maximize();
}
}
