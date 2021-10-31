package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjAllen {
	public WebDriver driver;
By Mobile = By.xpath("//input[@id='login_username1']");
By next = By.xpath("//button[@id='submit_log_1']");
public  LoginPageObjAllen (WebDriver driver)
{
this.driver= driver;

}
public WebElement entermobilenumber()
{
	return driver.findElement(Mobile);
	

}
public WebElement enternext()
{
	return driver.findElement(next);
	}
}
