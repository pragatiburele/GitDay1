package com.cjc.Test_1_10_08_24;

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
	System.out.println("hello");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Desktop\\Selenium files\\chromedriver-win64\\chromedriver.exe");
	WebDriver dr=new ChromeDriver();
	dr.get("https://www.naukri.com/");
	dr.manage().window().maximize();
	//total hyperlink
	List al=dr.findElements(By.tagName("a"));
	int totalhy=al.size();
	System.out.println("total hyper link"+totalhy);
	//total footer link
	WebElement flink=dr.findElement(By.xpath("//div[@class=\"nI-gNb-anchorList\"]"));
	List a2=flink.findElements(By.tagName("a"));
	int fl=a2.size();
	System.out.println(fl);
	//perticulare
	WebElement plink=dr.findElement(By.xpath("/html/body/div[1]/footer/section[1]/div/div/div[2]/ul"));
	List a3=plink.findElements(By.tagName("a"));
	int count=a3.size();
	System.out.println(count);
	for(int i=0;i<count;i++) {
		String click=Keys.chord(Keys.CONTROL,Keys.ENTER);
		plink.findElements(By.tagName("a")).get(i).sendKeys(click);
	}
	Set<String>wh=dr.getWindowHandles();
	System.out.println(wh);
	List<String>ll=new ArrayList<String>(wh);
	Iterator<String>itr=ll.iterator();
	while(itr.hasNext()) {
		dr.switchTo().window(itr.next());
		String title=dr.getTitle();
		System.out.println(title);
	}
}
}
