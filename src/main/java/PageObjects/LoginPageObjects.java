package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	public WebDriver driver;
	By username = By.xpath("//input[@id='user_email']");
	By password = By.xpath("//input[@id='user_password']");
	By Login =  By.xpath("//input[@value='Log In']");
	
	public  LoginPageObjects (WebDriver driver)
	{
		this.driver= driver;
	}
	public WebElement enterusername()
	{
		return driver.findElement(username);
	}
	public WebElement enterpassword()
	{
		return driver.findElement(password);
	}
	public WebElement enterLogin()
	{
		return driver.findElement(Login);
	}
}
