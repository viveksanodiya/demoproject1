package Final_demo;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.HomePageObjects;
import PageObjects.LoginPageObjects;
import resources.Base_class;

public class HomePage extends Base_class {

	@Test(dataProvider = "getdata")
	
	
	public void hompagenavigation(String username, String password) throws Exception {
		driver = DriverInitilization(); // driver initilization
		driver.get("http://www.qaclickacademy.com/");
		HomePageObjects hp = new HomePageObjects(driver);
		hp.Loginbutton().click();
		LoginPageObjects lpo = new LoginPageObjects(driver);
		lpo.enterusername().sendKeys(username);
		lpo.enterpassword().sendKeys(password);
		lpo.enterLogin().click();

	}

	@DataProvider
	public Object[][] getdata() {
		// row column
		Object[][] data = new Object[2][2];
		data[0][0] = "vivek";
		data[0][1] = "1234";
		data[1][0] = "neeta";
		data[1][1] = "5678";
		return data;

	}
}