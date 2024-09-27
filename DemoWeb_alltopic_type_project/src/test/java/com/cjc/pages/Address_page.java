package com.cjc.pages;

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

public class Address_page {
	WebDriver dr;
	@FindBy(xpath = "//*[@id=\"billing-address-select\"]")
	WebElement newa;
	@FindBy(xpath = "//*[@id=\"billing-address-select\"]/option[2]")
	WebElement ne;

	@FindBy(xpath = "//input[@name=\"BillingNewAddress.Company\"]")
	WebElement comp;
	@FindBy(xpath = "//select[@id=\"BillingNewAddress_CountryId\"]")
	WebElement dp;
	@FindBy(xpath = "//input[@id=\"BillingNewAddress_City\"]")
	WebElement cityy;
	@FindBy(xpath = "//input[@id=\"BillingNewAddress_Address1\"]")
	WebElement add1;
	@FindBy(xpath = "//input[@name=\"BillingNewAddress.Address2\"]")
	WebElement add2;
	@FindBy(xpath = "//input[@id=\"BillingNewAddress_ZipPostalCode\"]")
	WebElement zip;
	@FindBy(xpath = "//input[@name=\"BillingNewAddress.PhoneNumber\"]")
	WebElement phone;
	@FindBy(xpath = "//input[@name=\"BillingNewAddress.FaxNumber\"]")
	WebElement fx;


public Address_page(WebDriver dr) {
this.dr=dr;	
}
public void Addressmethod() throws IOException {
	newa.click();
	ne.click();
	FileInputStream f=new FileInputStream("C:\\Users\\Rupali\\Desktop\\Selenium files\\Excelfiles\\Demoweb_alltpic_Address_page_data.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(f);
	XSSFSheet sh=wb.getSheet("Sheet1_address");
	XSSFRow r=sh.getRow(1);
	XSSFCell c=r.getCell(0);
	XSSFCell c1=r.getCell(1);
	XSSFCell c2=r.getCell(2);
	XSSFCell c3=r.getCell(3);
	XSSFCell c4=r.getCell(4);
	XSSFCell c5=r.getCell(5);
	XSSFCell c6=r.getCell(6);
	XSSFCell c7=r.getCell(7);
	
	String company=c.getStringCellValue();
	String country=c1.getStringCellValue();
	String city=c2.getStringCellValue();
	String address1=c3.getStringCellValue();
	String address2=c4.getStringCellValue();
	String zipcode=c5.getStringCellValue();
	String phoneno=c6.getStringCellValue();
	String fxno=c7.getStringCellValue();
	comp.sendKeys(company);
	Select ss=new Select(dp);
	ss.selectByVisibleText(country);
	cityy.sendKeys(city);
	add1.sendKeys(address1);
	add2.sendKeys(address2);
	zip.sendKeys(zipcode);
	phone.sendKeys(phoneno);
	fx.sendKeys(fxno);
}




}