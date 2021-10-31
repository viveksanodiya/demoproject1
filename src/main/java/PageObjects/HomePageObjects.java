package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {
	public WebDriver driver;
	By Login= By.xpath("//*/span[contains(text(),'Login')]");
	public  HomePageObjects (WebDriver driver)
	{
		this.driver= driver;
	}
	public WebElement Loginbutton()
	{
		return driver.findElement(Login);
	}
	

}
