package basiccomponenthandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser2 {

	
	//static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\for selenium\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Downloads\\for selenium\\geckodriver.exe");
			 
		
//		String browser = "Chrome";
//	
//		
//		if(browser.equals("Chrome"))
//		{
//			driver = new ChromeDriver();
//		}
//		if(browser.equals("FireFox"))
//		{
//			driver = new FirefoxDriver();
//		}	
//		
		WebDriver driver = new FirefoxDriver();
		 
		
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.manage().window().maximize();
		
		 
	}
}
