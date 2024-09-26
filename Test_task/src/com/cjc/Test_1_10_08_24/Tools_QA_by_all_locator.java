package com.cjc.Test_1_10_08_24;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tools_QA_by_all_locator {
public static void main(String[] args) {
	System.out.println("welcome");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Desktop\\Selenium files\\chromedriver-win64\\chromedriver.exe");
    WebDriver dr=new ChromeDriver();
    dr.get("https://www.toolsqa.com/selenium-training/#enroll-form");
    dr.manage().window().maximize();
    dr.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    //css
    dr.findElement(By.cssSelector("input[name=\"firstName\"]")).sendKeys("Prachi");
    //relative
    dr.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("Deshi");
    //css
    dr.findElement(By.cssSelector("input#email")).sendKeys("Prachi122@gmail.com");
    //abs
    dr.findElement(By.xpath("/html/body/div/div[5]/div/div[3]/form/div[4]/input")).sendKeys("8882525236");
    //css
   WebElement dp= dr.findElement(By.cssSelector("div>select"));
    Select s=new Select(dp);
    s.selectByValue("4");
    //immed following
    dr.findElement(By.xpath("//div/following-sibling::*/input[@id=\"city\"]")).sendKeys("pune");
    //immed preceding
    dr.findElement(By.xpath("//div/preceding-sibling::*/textarea")).sendKeys("Testing batch");
    //dr.findElement(By.xpath("//input[@name=\"code\"]")).sendKeys("");
    //abs
    dr.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[3]/form/button")).click();
    
}

}
