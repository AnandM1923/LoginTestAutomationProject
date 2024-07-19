package loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actionsUtility.AllMethodsOfSelenium;
import baspkg.InitialiseWebDriverInstance;

public class HomePage extends InitialiseWebDriverInstance {
	
	AllMethodsOfSelenium allMethodsOfSelenium=new AllMethodsOfSelenium();
	

	public HomePage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//p[@class='oxd-text oxd-text--p orangehrm-copyright'][2]")
	WebElement OrangeHRMVersionYear;
		
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p orangehrm-copyright'][1]")
	WebElement OrangeHRMVersion;
		
	public String OrangeHRMVersionYear() {
		String company_brandinglogo=allMethodsOfSelenium.getText(OrangeHRMVersionYear);
		return company_brandinglogo;
	}
	
	public String OrangeHRMVersion() {
		String OrangeHRMVersionText=allMethodsOfSelenium.getText(OrangeHRMVersion);
		return OrangeHRMVersionText;
	}
	
}
