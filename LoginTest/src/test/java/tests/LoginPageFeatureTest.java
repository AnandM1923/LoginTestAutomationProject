package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baspkg.InitialiseWebDriverInstance;
import loginpage.LoginPageFeature;

public class LoginPageFeatureTest extends InitialiseWebDriverInstance {
	
	LoginPageFeature loginPageFeature;
	
	@BeforeMethod
	public void LaunchBrowser() throws IOException, Exception {
		System.out.println("Before Starting InitiliseDriver() ");
		InitiliseDriver();
		System.out.println("After Starting InitiliseDriver() ");
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@Test
	public void LoginTest() throws Exception {
		loginPageFeature=new LoginPageFeature(driver);
		loginPageFeature.loginToApplication("Admin", "admin123");
		
	}
	
	@AfterMethod
	public void QuitBrowser() {
		if (driver != null) {
	        driver.quit();
	        driver = null;  // Reset driver to null after quitting
	    }
	}
}
