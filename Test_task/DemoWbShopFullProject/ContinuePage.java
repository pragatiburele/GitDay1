package DemoWbShopFullProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContinuePage
{
WebDriver driver;

@FindBy(css="#billing-buttons-container > input")
WebElement con1;
@FindBy(xpath ="//*[@id=\"shipping-buttons-container\"]/input")
WebElement con2;
@FindBy(xpath= "//*[@id=\"shipping-method-buttons-container\"]/font/font/input")
WebElement con3;
@FindBy(xpath="//*[@id=\"payment-method-buttons-container\"]/font/font/input")
WebElement con4;
@FindBy(xpath="//*[@id=\"payment-info-buttons-container\"]/font/font/input")
WebElement con5;
@FindBy(xpath="//*[@id=\"confirm-order-buttons-container\"]/input")
WebElement conf6;
@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/ul/li[2]/a")
WebElement con7;


public ContinuePage(WebDriver driver) {
	super();
	this.driver = driver;
}

public void continue_page() throws InterruptedException

{
	
	con1.click();
	Thread.sleep(2000);
con2.click();
Thread.sleep(2000);

con3.click();
Thread.sleep(2000);

con4.click();
Thread.sleep(2000);

con5.click();
Thread.sleep(2000);

conf6.click();
Thread.sleep(2000);

con7.click();
Thread.sleep(2000);


}


}