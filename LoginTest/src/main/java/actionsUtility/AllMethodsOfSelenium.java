package actionsUtility;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baspkg.InitialiseWebDriverInstance;

public class AllMethodsOfSelenium extends InitialiseWebDriverInstance {
	
	//public WebDriver driver;
	
public void clickOnelement(WebElement element) {
		try {
				if(element.isEnabled()) {
					element.click();
					System.out.println("the Elelment is clicked : " +element);
				}
				else {
					System.out.println("The is not not displayed ot not clickable");
				}
		}catch (Exception e) {
				System.out.println(e.getMessage());
			}
	
}

public void sendText(WebElement element,String text) {
	try {
			if(element.isEnabled()) {
				element.sendKeys(text);
				System.out.println("the Text is entered into the element : "+element+ " :" +text);
			}
			else {
				System.out.println("The is not not displayed ot not clickable " +element+ " :" +text);
			}
	}catch (Exception e) {
			System.out.println(e.getMessage());
		}

}

public String getText(WebElement element) {
	String elementText = null;
	try {
		
		if(element.isDisplayed()) {
			 elementText=element.getText();
			System.out.println("Element text is replied:");
		}else {
			System.out.println("Element didnt found:" +element);
		}
	}catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
	return elementText;
}




}
