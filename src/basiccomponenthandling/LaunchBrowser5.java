package basiccomponenthandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser5 {

	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\for selenium\\chromedriver.exe");
	//	System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Downloads\\for selenium\\geckodriver.exe");
			 	
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.manage().window().maximize(); // to maximize browser window
		
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.close();
			
		
		
		
		Thread.sleep(4000); //
		
		WebElement username = driver.findElement(By.name("textInputContainer"));
		
		//NO SUCH ELEMENT EXCEPTION IN JAVA
		Thread.sleep(4000);
		username.sendKeys("Admin");

		Thread.sleep(4000);

		
		//Accessing webelement using findelementsmethod &  Byid ,it locates the web eliment
		//.sendkeys inserts the value into web element
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		

		
		Thread.sleep(4000);
		WebElement login = driver.findElement(By.id("btnLogin"));
		login.click();
	
		driver.close();
	

		
	}	 
}
