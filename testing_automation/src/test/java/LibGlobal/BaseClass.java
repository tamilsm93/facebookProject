package LibGlobal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	

	public static WebDriver driver;
	public static WebDriver driver() {
		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new EdgeDriver(options);
		return driver;
		
	}
	
	public static void launchUrl(String url) {
		driver.get(url);
	}
	
	public static void loginPage(WebElement userName , String text) {
//		WebElement userName1 = driver.findElement(By.name("name"));
		
		userName.sendKeys(text);
		
//		WebElement password1 = driver.findElement(By.name("pass"));
//		password1.sendKeys(PassWord);
	}
	
	
	
	

}
