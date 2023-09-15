package DataProvider;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import testData.DataProvider;

public class TestFaceBook {
	
	@Test(dataProvider="testData")
	public void test(String name, String password) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/tamilcrea/Desktop/WebDriver/chromedriver1");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(name);
		
		WebElement passWord = driver.findElement(By.name("pass"));
		passWord.sendKeys(password);
		
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();

	}
	
    @DataProvider(name="testData")
	private Object[][] testCase() {
		Object [][] objName = new Object[][]{
		{"sam@gmail.com", "welcome@99"},
		{"ram@gmail.com", "Ram@123"},
		{"ana@greens.com", "greens"},
		{"test@gmail.com", "gmail@123"}
		
	};
	return objName;
}
}




