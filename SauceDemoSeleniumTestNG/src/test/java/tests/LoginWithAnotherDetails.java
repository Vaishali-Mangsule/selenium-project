package tests;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.TestBase;

public class LoginWithAnotherDetails extends TestBase {
	
	
	@Test
	public void login() throws InterruptedException {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.login("problem_user", "secret_sauce");
	}

}
