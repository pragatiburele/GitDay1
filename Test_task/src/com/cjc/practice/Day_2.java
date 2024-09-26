package com.cjc.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_2 {
	public static void main(String[] args) {
		System.out.println("hello selenium");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rupali\\Desktop\\Selenium files\\chromedriver-win64\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		//1.get()
		dr.get("https://www.facebook.com/");
		dr.manage().window().maximize();
		
		//methods of webdriver
		//2.findElement
		WebElement un=dr.findElement(By.cssSelector("input[type=\"text\"]"));
		//3.sendkeys
		un.sendKeys("shiram");
		//4getTitle
		String ti=dr.getTitle();
		System.out.println("title "+ti);
		//5.getpagesource
		String s=dr.getPageSource();
		System.out.println(s);
		//6.geturl
		String u=dr.getCurrentUrl();
		System.out.println(u);
		//9 navigate to
		dr.navigate().to(u);
		//10 navigate back
		dr.navigate().back();
		//11.navigate forward
		dr.navigate().forward();
		//12 findelements:list
		//swichto
		//dr.switchTo().alert().accept();
		//13.windowhandl
		//14.windowhandling
		//7.quit
		//dr.quit();
		//8.close
		dr.close();
		
	}
}
