package DemoWbShopFullProject;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(xpath= "//a[@href=\"/login\"]")
	WebElement login;
	@FindBy(id = "Email")
	WebElement us;
	@FindBy(id="Password")
	WebElement ps;
	
	@FindBy(id="RememberMe")
	WebElement rem;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
	WebElement loginb;
	
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void Login() throws IOException
	{
	FileInputStream fs = new FileInputStream("D:\\Payal_new_batch\\Selenium\\ExcellSheetOperation\\DemoWbShopFullProject.xlsx");
	
	XSSFWorkbook wb = new XSSFWorkbook(fs);
	XSSFSheet sh = wb.getSheet("Login");
	XSSFRow row = sh.getRow(1);
	XSSFCell cell = row.getCell(0);
	XSSFCell cell1= row.getCell(1);
	String Username = cell.getStringCellValue();
	String Password= cell1.getStringCellValue();
	
    
	login.click();
	us.sendKeys("Username");
	ps.sendKeys("Password");
	rem.click();
	loginb.click();
	
	}
	

}
	

