package com.cjc.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_picker {
	public static void main(String[] args) {

		System.out.println("hello");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rupali\\Desktop\\Selenium files\\chromedriver-win64\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://jqueryui.com/datepicker/");
		dr.manage().window().maximize();
		dr.switchTo().frame(0);
		dr.findElement(By.id("datepicker")).click();
	while(!dr.findElement(By.cssSelector("[class=\"ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all\"] [class=\"ui-datepicker-month\"]")).getText().contains("October")){
		dr.findElement(By.cssSelector("[class=\"ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all\"] [class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
		
	}
	List date=dr.findElements(By.xpath("//td[@data-handler=\"selectDay\"]"));
	int count =date.size();
	System.out.println(count);
	for(int i=0;i<count;i++) {
		String d=dr.findElements(By.xpath("//td[@data-handler=\"selectDay\"]")).get(i).getText();
		if(d.equalsIgnoreCase("13")) {
			dr.findElements(By.xpath("//td[@data-handler=\"selectDay\"]")).get(i).click();
		}
	}
}
}