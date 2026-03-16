package tests;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.TestBase;

public class LoginToApplication extends TestBase {
	
	
	@Test
	public void login() throws InterruptedException {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.login("standard_uer", "secret_sauce");
		
	}

}
