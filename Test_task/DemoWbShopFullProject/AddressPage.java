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
import org.openqa.selenium.support.ui.Select;

public class AddressPage
{
WebDriver driver;
@FindBy(css="#checkout-billing-load > div > div.section.select-billing-address > div > select")
WebElement news;
@FindBy(linkText="New Address")
WebElement ne;
@FindBy(xpath="//*[@id=\"BillingNewAddress_Company\"]")
WebElement co;

@FindBy(xpath= "//select[@id=\"BillingNewAddress_CountryId\"]")
WebElement country;
@FindBy(xpath = "//input[@id=\"BillingNewAddress_City\"]")
WebElement city;
@FindBy(xpath="//input[@id=\"BillingNewAddress_Address1\"]")
WebElement ad1;
@FindBy(xpath="//input[@id=\"BillingNewAddress_Address2\"]")
WebElement ad2;
@FindBy(xpath="//input[@id=\"BillingNewAddress_ZipPostalCode\"]")
WebElement zip;
@FindBy(xpath="//input[@id=\"BillingNewAddress_PhoneNumber\"]")
WebElement ph;
@FindBy(xpath= "//input[@id=\"BillingNewAddress_FaxNumber\"]")
WebElement fax;
public AddressPage(WebDriver driver) {
	super();
	this.driver = driver;
}

public void AddresMethod() throws IOException
{
	news.click();
	ne.click();

FileInputStream f = new FileInputStream("D:\\Payal_new_batch\\Selenium\\ExcellSheetOperation\\DemoWbShopFullProject.xlsx");

XSSFWorkbook wb = new XSSFWorkbook(f);
XSSFSheet sh = wb.getSheet("AddressPage");
XSSFRow row = sh.getRow(1);

XSSFCell cell = row.getCell(0);
XSSFCell cell1= row.getCell(1);
XSSFCell cell2 = row.getCell(2);
XSSFCell cell3 = row.getCell(3);
XSSFCell cell4 = row.getCell(4);
XSSFCell cell5 = row.getCell(5);
XSSFCell cell6 = row.getCell(6);
XSSFCell cell7 = row.getCell(7);

String Company = cell.getStringCellValue();
String Country= cell1.getStringCellValue();
String City= cell2.getStringCellValue();
String Address1 = cell3.getStringCellValue();
String Address2= cell4.getStringCellValue();
String Postalcode = cell5.getStringCellValue();
String Phone= cell6.getStringCellValue();
String Fax = cell7.getStringCellValue();

Select s = new Select(co);
s.selectByVisibleText(Country);
city.sendKeys(City);
ad1.sendKeys(Address1);
ad2.sendKeys(Address2);
co.sendKeys(Company);
zip.sendKeys(Postalcode);
ph.sendKeys(Phone);
fax.sendKeys(Fax);


}













}
