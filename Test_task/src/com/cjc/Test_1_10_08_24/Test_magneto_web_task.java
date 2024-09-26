package com.cjc.Test_1_10_08_24;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_magneto_web_task {
public static void main(String[] args) throws InterruptedException {
	System.out.println("start");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Desktop\\Selenium files\\chromedriver-win64\\chromedriver.exe");
     WebDriver dr=new ChromeDriver();
     dr.get("https://magento.softwaretestingboard.com/customer/account/create");
     dr.manage().window().maximize();
     dr.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
     dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     //1
     dr.findElement(By.cssSelector("input[name=\"firstname\"]")).sendKeys("shivani");
     
     dr.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Burele");
     
     dr.findElement(By.cssSelector("div.control>input[name=\"email\"]")).sendKeys("shivani2977820@gmail.com");
     
     dr.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/form/fieldset[2]/div[2]/div/input")).sendKeys("pragati@123");
     
     dr.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/form/fieldset[2]/div[3]/div/input")).sendKeys("pragati@123");
     dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
     dr.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/form/div/div/button")).click();
     //2.
     dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

     dr.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button")).click();
     dr.findElement(By.partialLinkText("Sign Out")).click();
     dr.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();
//3. 
     dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
     dr.findElement(By.xpath("//input[@name=\"login[username]\"]")).sendKeys("shivani16@gmail.com");
     dr.findElement(By.cssSelector("input[name=\"login[password]\"]")).sendKeys("pragati@123");
     dr.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div[1]/div[2]/form/fieldset/div[4]/div[1]/button")).click();
     
     //4.
     
     
     dr.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[2]/a/span[2]"));
     dr.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[2]/ul/li[1]/a/span[2]"));
     Thread.sleep(100);
     
    		 dr.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[2]/ul/li[1]/ul/li[1]/a/span")).click();
 
dr.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[1]/div/div/div[3]/div/div[1]/form/button/span")).click();
dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

dr.findElement(By.xpath("//div[@id=\"option-label-size-143-item-166\"]")).click();
dr.findElement(By.xpath("//div[@id=\"option-label-color-93-item-49\"]")).click();
dr.findElement(By.cssSelector("div>button[id=\"product-addtocart-button\"]")).click();
dr.findElement(By.xpath("//a[@class=\"action showcart\"]")).click();
dr.findElement(By.xpath("//button[@id=\"top-cart-btn-checkout\"]")).click();













}
}
