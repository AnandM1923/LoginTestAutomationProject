package loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actionsUtility.AllMethodsOfSelenium;
import baspkg.InitialiseWebDriverInstance;


public class LoginPageFeature extends InitialiseWebDriverInstance {
	
	public WebDriver driver;
	
	AllMethodsOfSelenium allMethodsOfSelenium;
	
	public LoginPageFeature(WebDriver driver) {
		this.driver=driver;
		allMethodsOfSelenium=new AllMethodsOfSelenium();
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="username")
	WebElement userLogin;
	
	@FindBy(name="password")
	WebElement password;
	
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submitbutton;
	
	
	public void loginToApplication(String unmae,String pwrd) throws Exception {
		allMethodsOfSelenium.sendText(userLogin,unmae);
		Thread.sleep(2000);
		allMethodsOfSelenium.sendText(password,pwrd);
		Thread.sleep(2000);
		allMethodsOfSelenium.clickOnelement(submitbutton);
	}

}
