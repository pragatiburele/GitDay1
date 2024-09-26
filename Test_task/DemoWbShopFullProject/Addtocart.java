package DemoWbShopFullProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Addtocart 
{WebDriver driver;

@FindBy(linkText="Books")
WebElement book;
@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input")
WebElement addto;
@FindBy(linkText="Shopping cart")
WebElement shopping;
@FindBy(xpath="//input[@id=\"termsofservice\"]")
WebElement term;
@FindBy(xpath="//button[@id=\"checkout\"]")
WebElement checkout;
public Addtocart(WebDriver driver) {
	super();
	this.driver = driver;
}

public void continuepr()
{
	book.click();
	addto.click();
	shopping.click();
	term.click();
	checkout.click();
	
	
	
	
}

}
