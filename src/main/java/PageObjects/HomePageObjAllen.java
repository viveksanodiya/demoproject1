package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjAllen {
	public WebDriver driver;
	By Login = By.xpath("//li[@class='log-in non-logged-in']");
	public  HomePageObjAllen (WebDriver driver)
	{
		this.driver= driver;
		
	}
	public WebElement Loginbutton()
	{
		return driver.findElement(Login);
		
	}
	

}
