package com.cjc.Test_1_10_08_24;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_cookie {
public static void main(String[] args) {
	System.out.println("hello");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Desktop\\Selenium files\\chromedriver-win64\\chromedriver.exe");
	WebDriver dr=new ChromeDriver();
	dr.get("https://www.amazon.in/");
	dr.manage().window().maximize();
	Set<Cookie>cc=dr.manage().getCookies();
	System.out.println("total cookie :"+cc.size());
	for(Cookie ac:cc) {
		System.out.println("******************************");
		System.out.println("Name of cookie "+ac.getName());
		System.out.println("Domain of cookie "+ac.getDomain());
		System.out.println("Value of cookie "+ac.getValue());
		System.out.println("path of cookie "+ac.getPath());
		System.out.println("expiry of cookie "+ac.getExpiry());
		System.out.println("ishttp of cookie "+ac.isHttpOnly());
		System.out.println("issecure cookie "+ac.isSecure());
		System.out.println("Thanks");
	}
	Cookie un=new Cookie("username","pratik");
	dr.manage().addCookie(un);
}
}
