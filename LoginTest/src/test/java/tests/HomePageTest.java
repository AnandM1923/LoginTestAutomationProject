package tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baspkg.InitialiseWebDriverInstance;
import loginpage.HomePage;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class HomePageTest extends InitialiseWebDriverInstance {
	
	
	HomePage homePage;;
	
	@BeforeMethod
	public void LuanchwebDriver() throws Exception {
		
	InitiliseDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
}
	@Test(priority=2)
public void testLogo() {
	homePage=new HomePage(driver);
	String text=homePage.OrangeHRMVersionYear();
	System.out.println("companyBranding" +text);
}


@Test(priority=1)
public void testversion() {
	homePage=new HomePage(driver);
	String text2=homePage.OrangeHRMVersion();
	System.out.println("testversion" +text2);
}


@AfterMethod
public void exitBrowser() throws Exception {
	if (driver != null) {
        driver.quit();
        driver = null;  // Reset driver to null after quitting
    }
	

}

}
