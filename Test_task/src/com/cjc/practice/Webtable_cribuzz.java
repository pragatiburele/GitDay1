package com.cjc.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_cribuzz {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("hello");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Desktop\\Selenium files\\chromedriver-win64\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakisran-v-sri-lanka-in-uae-2017");
		dr.manage().window().maximize();
		dr.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//innning
		WebElement table=dr.findElement(By.xpath("//div[@id=\"innings_1\"]"));
		//row
		List<WebElement>row=table.findElements(By.xpath("//div[@class=\"cb-col cb-col-100 cb-scrd-itms\"]"));
		int count=row.size();
		System.out.println(count);
		//run
		int sum=0;
		for(int i=0;i<count-2;i++) {
			String runval=table.findElements(By.cssSelector("div[class=\"cb-col cb-col-100 cb-scrd-itms\"] :nth-child(3)")).get(i).getText();
			int countrun=Integer.parseInt(runval);
			sum=sum+countrun;
		}
		System.out.println(sum);
		
}
}