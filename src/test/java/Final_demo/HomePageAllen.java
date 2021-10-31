package Final_demo;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.HomePageObjAllen;
import PageObjects.LoginPageObjAllen;
import resources.Base_class;

public class HomePageAllen extends Base_class {
	@Test(dataProvider = "getdata")


	public void homepageallennavigation(String username, String password) throws Exception {
		driver = DriverInitilization();
		driver.get("https://www.onlinetestseries.in/allenkota/");
		HomePageObjAllen hoa = new HomePageObjAllen(driver);
		hoa.Loginbutton().click();
		 LoginPageObjAllen lpoa= new  LoginPageObjAllen(driver);
		 lpoa.entermobilenumber().sendKeys(username);
		// lpoa.entermobilenumber().sendKeys("12345");
		 lpoa.enternext().click();
		 
		 

	}
	@DataProvider
	public Object[][] getdata() {
		// row column
		Object[][] data = new Object[2][2];
		data[0][0] = "tet@test.com";
		data[0][1] = "secure@1234";
		data[1][0] = "test1@test.com";
		data[1][1] = "secure@5678";
		return data;


}
}
