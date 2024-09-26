package com.cjc.Test_1_10_08_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Drag_drop {
	public static void main(String[] args) {
		System.out.println("hello");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Desktop\\Selenium files\\chromedriver-win64\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://jqueryui.com/droppable/");
		dr.manage().window().maximize();
		//into frame
		dr.switchTo().frame(0);
		Actions ac=new Actions(dr);
		WebElement source=dr.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement target=dr.findElement(By.xpath("//div[@id=\"droppable\"]"));
		ac.dragAndDrop(source, target).build().perform();
		//outframe
		dr.switchTo().defaultContent();
}
}