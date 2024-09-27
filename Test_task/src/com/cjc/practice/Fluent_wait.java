package com.cjc.practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluent_wait {
public static void main(String[] args) {
	System.out.println("hello selenium");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Desktop\\Selenium files\\chromedriver-win64\\chromedriver.exe");
	WebDriver dr=new ChromeDriver();
	dr.get("https://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
	dr.manage().window().maximize();
	dr.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	dr.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();
	Wait<WebDriver>wait=new FluentWait<WebDriver>(dr).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(1))
			.ignoring(NoSuchElementException.class);
	WebElement s=wait.until(new Function<WebDriver, WebElement>() {

		@Override
		public WebElement apply(WebDriver t) {
			WebElement mgs=t.findElement(By.cssSelector("p[id=\"demo\"]"));
			System.out.println("hello seconds");
			String text=mgs.getText();
			if(text.equalsIgnoreCase("Software Testing Material - DEMO PAGE")) {
				System.out.println(text);
			return mgs;
		}else {
			return null;
			}
		}

		
		
	});
System.out.println("end");	
System.out.println("addd");

	

}
}
