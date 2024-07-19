package baspkg;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class InitialiseWebDriverInstance {
	
	public WebDriver driver;
	public Properties prop;
	public FileInputStream fis;
	
	@BeforeClass
	public void InitiliseDriver() throws IOException, InterruptedException {
		Thread.sleep(500);
		if(driver==null){
		fis=new FileInputStream("C:\\Users\\margo\\java\\AutomationProject\\LoginTest\\src\\main\\resources\\porperties.properties");
		prop=new Properties();
		prop.load(fis);
		
		String BrowserName=prop.getProperty("browser");
		
		
		if(BrowserName.equalsIgnoreCase("chrome"))
				{
			driver=new ChromeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("firefox"))
			{
			driver=new FirefoxDriver();
			
			}else if(BrowserName.equalsIgnoreCase("ie")) {
				
				driver=new InternetExplorerDriver();
			}else {
				
				System.out.println("Please enter prper browser name");
			}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	}
}