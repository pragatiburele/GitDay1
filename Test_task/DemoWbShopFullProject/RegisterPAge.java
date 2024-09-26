package DemoWbShopFullProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPAge 
{
	WebDriver driver;
	@FindBy(xpath="//input[@id=\"gender-female\"]")
	WebElement gen;
	@FindBy(xpath="//input[@id=\"FirstName\"]")
	WebElement fs;
	@FindBy(xpath="//input[@id=\"LastName\"]")
	WebElement ln;
	@FindBy(xpath="//input[@id=\"Email\"]")
	WebElement em;
	@FindBy(xpath="//input[@id=\"Password\"]")
	WebElement ps;
	@FindBy(xpath="//input[@id=\"ConfirmPassword\"]")
	WebElement cps;
	@FindBy(xpath="//input[@id=\"register-button\"]")
	WebElement r;
	@FindBy(xpath="//a[@href=\"/logout\"]")
	WebElement log;
	
	

	public RegisterPAge(WebDriver driver) {
		super();
		this.driver = driver;
	}



	public void Register() throws IOException
	{
		
		Properties  pro=  new Properties();
		FileInputStream fis = new FileInputStream("D:\\Payal_new_batch\\Selenium\\PropertiesFiles\\DemoWebShop.properties");
		pro.load(fis);
		
		gen.click();
		fs.sendKeys(pro.getProperty("FirstName"));
		ln.sendKeys(pro.getProperty("LastName"));
		em.sendKeys(pro.getProperty("Email"));
		ps.sendKeys(pro.getProperty("Password"));
		cps.sendKeys(pro.getProperty("Confirm-Password"));
		r.click();
		log.click();
		
		
	}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
