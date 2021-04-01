package basiccomponenthandling;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ByIdOrName;

public class LaunchBrowser {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\for selenium\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\for selenium\\geckodriver.exe");
		
		String browser = "Chrome";
		String browserr = "Firefox";
		if (browser.equals("Chrome")) {
			driver = new ChromeDriver();
		
		

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize(); // to maximize browser window
		
		Thread.sleep(2000); //
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("admin");
		
		Thread.sleep(4000);

		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		
		Thread.sleep(4000);
		
		WebElement login = driver.findElement(By.id("btnLogin"));
		login.click();
		Thread.sleep(4000);
		
		
		
		String urlafterlogin = driver.getCurrentUrl();
		
		System.out.println(urlafterlogin);
		driver.close();		
		
		String homepageurl = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		if(homepageurl.equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/index.php/dashboard"))
		System.out.println("Reached Homepage and login sucessful");
		else
		System.out.println("login unsucessful");
	}
	
		
		if (browserr.equals("FireFox")) {
			driver = new FirefoxDriver();
		

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize(); // to maximize browser window
		
		Thread.sleep(2000); //
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("admin");
		
		Thread.sleep(4000);

		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		
		Thread.sleep(4000);
		
		WebElement login = driver.findElement(By.id("btnLogin"));
		login.click();
		Thread.sleep(4000);
		
		String urlafterlogin = driver.getCurrentUrl();
		
		System.out.println(urlafterlogin);
		driver.close();		
		
		String homepageurl = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		if(homepageurl.equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/index.php/dashboard"))
		System.out.println("Reached Homepage and login sucessful");
		else
		System.out.println("login unsucessful");

		
	}

}
}
