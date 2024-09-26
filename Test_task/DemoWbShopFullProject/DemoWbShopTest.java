 package DemoWbShopFullProject;


import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class DemoWbShopTest 
{
WebDriver driver;


@BeforeSuite
public void OpenBrowser() throws IOException
{
System.setProperty("webdriver.chrome.driver", "D:\\Payal_new_batch\\Selenium\\Chrome\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
driver = new ChromeDriver();
System.out.println("Open Browser");


}

@BeforeTest
public void openURL()
{
driver.get("https://demowebshop.tricentis.com/register");	

System.out.println("URL opened");
}

@BeforeClass
public void maximizebrowser() throws InterruptedException
{
driver.manage().window().maximize();	
	System.out.println("browser Maximized");
	Thread.sleep(2000);
}


@BeforeMethod
public void getCookies() 
{
    Set<Cookie> cookies = driver.manage().getCookies();
    int count = cookies.size();
    //Layout l = new SimpleLayout();
    //Appender a = new ConsoleAppender(l);
  //  log.addAppender(a);
    //log.info(count);
   
}
@Test(priority=1)
public void registerTest() throws IOException
{
	RegisterPAge r = PageFactory.initElements(driver, RegisterPAge .class);
r.Register();
}


@Test(priority=2)
public void LoginPage() throws IOException {
	LoginPage l = PageFactory.initElements(driver,  LoginPage.class);	
l.Login();
}

@Test(priority=3)
public void AddtoCart()
{
	Addtocart adt = PageFactory.initElements(driver, Addtocart.class);
	adt.continuepr();

}
@Test(priority=4)
public void Address() throws IOException
{
	
	AddressPage adp =PageFactory.initElements(driver, AddressPage.class);
	adp.AddresMethod();


}

@Test(priority=5)
public void continueTest() throws InterruptedException 
{
	

ContinuePage c = PageFactory.initElements(driver, ContinuePage.class);
c.continue_page();

}

}

