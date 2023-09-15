package com.definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinition {
	
	WebDriver driver;
	@Given("launch the facebook browser")
	public void launch_the_facebook_browser() {
		System.setProperty("webdriver.chrome.driver","/Users/tamilcrea/Desktop/WebDriver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	   
	}
	
	@When("user needs to enter the valid username {string} and password {string}")
	public void user_needs_to_enter_the_valid_username_and_password(String string, String string2) {
		WebElement userName = driver.findElement(By.name("email"));
		userName.sendKeys("test@gmail.com");
		
		WebElement passWord = driver.findElement(By.name("pass"));
		passWord.sendKeys("123@123"); 
	}
	@Then("user needs to click the login button")
	public void user_needs_to_click_the_login_button() {
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
	    
	}
	
	@Then("create the facebook user account")
	public void create_the_facebook_user_account() {
		driver.get("http://www.facebook.com/reg");
	}

	@Then("add the relavent details")
	public void add_the_relavant_details() {
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("tamilz");
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("alagan");
		WebElement mobile_number  = driver.findElement(By.name("reg_email__"));
		mobile_number.sendKeys("9101120121");
	}
	
	@Then("close the browser")
	public void user_should_logout() {
		driver.quit();
	}


}
