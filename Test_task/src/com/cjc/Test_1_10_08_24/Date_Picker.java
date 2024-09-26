package com.cjc.Test_1_10_08_24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Picker{
public static void main(String args[]){
System.out.println("hello selenium");
System.setProperty("webdriver.chrome.driver","C:\\Users\\Rupali\\Desktop\\Selenium files\\chromedriver-win64\\chromedriver.exe");
WebDriver dr=new ChromeDriver();
dr.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
dr.manage().window().maximize();
dr.findElement(By.cssSelector("input[id=\"datepicker\"]")).click();
while(!dr.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-datepicker-month']")).getText().contains("October")) {
	System.out.println("in loop");
	dr.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
	
	
}
		
List al=dr.findElements(By.cssSelector("td[data-handler=\"selectDay\"]"));
int count=al.size();
System.out.println(count);
		for(int i=0;i<count;i++) {
			String day=dr.findElements(By.cssSelector("td[data-handler=\"selectDay\"]")).get(i).getText();
			if(day.equalsIgnoreCase("13")) {
			dr.findElements(By.cssSelector("td[data-handler=\"selectDay\"]")).get(i).click();
		}
		
		}
		
		
		
		
		
		
		
		
		
		
}}