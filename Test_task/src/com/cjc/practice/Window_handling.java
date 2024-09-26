package com.cjc.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handling {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Desktop\\Selenium files\\chromedriver-win64\\chromedriver.exe");
	WebDriver dr=new ChromeDriver();
	dr.get("https://www.naukri.com/");
	dr.manage().window().maximize();
	//total hyperlink
	List thy=dr.findElements(By.tagName("a"));
	int count=thy.size();
	System.out.println(count);
	
	//tfl
	WebElement tfl=dr.findElement(By.xpath("//div[@class=\"nI-gNb-anchorList\"]"));
	List a1=tfl.findElements(By.tagName("a"));
	int cf=a1.size();
	System.out.println(cf);
	//perticular
	WebElement pl=dr.findElement(By.xpath("/html/body/div/footer/section[1]/div/div/div[2]/ul"));
	List a2=pl.findElements(By.tagName("a"));
	int pc=a2.size();
	System.out.println(pc);
	for(int i=0;i<pc;i++) {
		String cl=Keys.chord(Keys.CONTROL,Keys.ENTER);
		pl.findElements(By.tagName("a")).get(i).sendKeys(cl);
	}
	Set<String>title=dr.getWindowHandles();
	System.out.println(title);
	List<String>al=new ArrayList<>(title);
	Iterator<String>itr=al.iterator();
	while(itr.hasNext()) {
		dr.switchTo().window(itr.next());
		String ti=dr.getTitle();
		System.out.println(ti);
	}
	
}
}
