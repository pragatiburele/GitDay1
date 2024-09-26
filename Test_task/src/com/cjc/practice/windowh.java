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

public class windowh {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Desktop\\Selenium files\\chromedriver-win64\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.naukri.com/");
		dr.manage().window().maximize();
		
		//total hyperlink
		List thl=dr.findElements(By.tagName("a"));
		int count=thl.size();
		System.out.println(count);
		
		//total footer link
		WebElement fl=dr.findElement(By.xpath("//div[@class=\"nI-gNb-anchorList\"]"));
		List tfl=fl.findElements(By.tagName("a"));
		int cf=tfl.size();
		System.out.println(cf);
		
		//perticulare footer link
		WebElement pl=dr.findElement(By.xpath("//div[@class=\"nI-gNb-column\"][1]"));
		List pel=pl.findElements(By.tagName("a"));
		int pc=pel.size();
		System.out.println(pc);
		for(int i=0;i<pc;i++) {
			String click=Keys.chord(Keys.CONTROL,Keys.ENTER);
			pl.findElements(By.tagName("a")).get(i).sendKeys(click);
		}
		Set<String>ti=dr.getWindowHandles();
		System.out.println(ti);
		List<String>s=new ArrayList<String>(ti);
		Iterator<String>itr=s.iterator();
		while(itr.hasNext()) {
			dr.switchTo().window(itr.next());
			String tit=dr.getTitle();
			System.out.println(tit);
		}
		
}
}