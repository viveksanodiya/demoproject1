package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_class {
	public WebDriver driver;
	public WebDriver DriverInitilization() throws IOException
	{
	
	 Properties p=new Properties();  
	 FileInputStream fis =new FileInputStream("C:\\Users\\vivek\\eclipse-workspace\\Final_demo\\src\\main\\java\\resources\\data.properties");    
	 p.load(fis);  
	String browsername = p.getProperty("browser");
	if(browsername.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vivek\\Desktop\\selenium jars\\chromedriver_win32\\chromeDriver.exe");
		 driver = new ChromeDriver();
	}
	else if (browsername.equals("Firefox")) {
		// fire fox driver
	}
	else
	{
		//  here give code
	}
	return driver;
	
	 
}
}