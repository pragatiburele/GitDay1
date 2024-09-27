package com.cjc.Testclass;

import java.io.IOException;
import java.util.Set;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.cjc.pages.Address_page;
import com.cjc.pages.Continue_page;
import com.cjc.pages.Login_page;
import com.cjc.pages.Register_page;
import com.cjc.pages.Selectproduct_page;
@Listeners(com.cjc.Testclass.Demoisuit.class)
public class Test_DemoWeb {
WebDriver dr;
static Logger log=Logger.getLogger(Test_DemoWeb.class);

@BeforeSuite
public void openB() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupali\\Desktop\\Selenium files\\new chrome\\chromedriver-win64\\chromedriver.exe");
	 dr=new ChromeDriver();

}
@BeforeTest
public void url() {
	dr.get("https://demowebshop.tricentis.com/register");
}
@BeforeClass
public void maz() {
	dr.manage().window().maximize();
}
@BeforeMethod
public void bm() {
	Set<Cookie>c=dr.manage().getCookies();
	int count=c.size();
	Layout l=new SimpleLayout();
	Appender a=new ConsoleAppender(l);
	log.addAppender(a);
	log.info(count);
	
}
//reg1
@Test(priority = 1)
public void RegisterTest() throws IOException {
	Register_page r=PageFactory.initElements(dr, Register_page.class);
	r.registermethod();
}
//login2
@Test(priority = 2)
@Parameters({"us","ps"})
public void loginTest(String uus,String pss) {
	Login_page l=PageFactory.initElements(dr, Login_page.class);
	l.loginmethod(uus,pss);
}
@Test(priority = 3)
public void selectTest() {
	Selectproduct_page s=PageFactory.initElements(dr, Selectproduct_page.class);
	s.contiunpro();
}
@Test(priority = 4)
public void AddressTest() throws IOException {
	Address_page a=PageFactory.initElements(dr, Address_page.class);
	a.Addressmethod();
}
@Test(priority = 5)
public void continueTest() throws InterruptedException {
	Continue_page c=PageFactory.initElements(dr, Continue_page.class);
	c.continuebuttons();
}
 
@AfterMethod
public void aftermethod() {
	log.info("aftermethod");
}
@AfterClass
public void ac() {
	System.out.println("afterclass");
	
}

@AfterTest
public void at() {
	System.out.println("aftertest");
}
@AfterSuite
public void as() {
	System.out.println("end");
}












}