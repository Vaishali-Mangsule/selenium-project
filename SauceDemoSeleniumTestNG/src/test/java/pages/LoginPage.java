package pages;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends TestBase {
	


	

	   

	    // Constructor
	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(xpath = "//input[@id='user-name']")
	     WebElement usernameField;

	    @FindBy(xpath = "//input[@name='password']")
	     WebElement passwordField;

	    @FindBy(xpath = "//input[@id='login-button']")
	     WebElement loginButton;

	    // Single Login Method
	    public void login(String username, String password) throws InterruptedException {
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        usernameField.sendKeys(username);
	        Thread.sleep(5000);

	        
	        passwordField.sendKeys(password);
	        Thread.sleep(5000);

	        loginButton.click();
	        Thread.sleep(5000);
	        
	        String title=driver.getTitle();
	        System.out.println(title);
	        Assert.fail("Forcefully failing the test");
	    }
	}



