package com.cjc.Test_1_10_08_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Heroku_page_demo_all_locator {
public static void main(String[] args) {
	System.out.println("welcome");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Rupali\\Desktop\\Selenium files\\chromedriver-win64\\chromedriver.exe");
	WebDriver dr=new ChromeDriver();
	dr.get("https://signup.heroku.com/");
	dr.manage().window().maximize();
	dr.findElement(By.cssSelector("input[name=\"first_name\"]")).sendKeys("neha");
	dr.findElement(By.cssSelector("input#last_name")).sendKeys("sharma");
	dr.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("neha12345@gmail.com");
	dr.findElement(By.xpath("//div[3]/following-sibling::*[1]/input")).sendKeys("ACAC");
	WebElement role=dr.findElement(By.cssSelector("select[name=\"role\"]"));
	Select s=new Select(role);
	s.selectByValue("student");
	WebElement co=dr.findElement(By.xpath("//select[@name=\"self_declared_country\"]"));
	
	Select ss=new Select(co);
	ss.selectByValue("India");
	
	WebElement lan=dr.findElement(By.cssSelector("select#main_programming_language"));
	Select a=new Select(lan);
	a.selectByValue("java");
	
	dr.findElement(By.cssSelector("div>input[name=\"receive_newsletter\"]")).click();
	dr.findElement(By.cssSelector("input[name=\"commit\"]")).click();
}
}
