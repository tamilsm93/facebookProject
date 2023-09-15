package com.definition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PalindromStefDef {
	
	private String testPalindrome;
	private boolean isPalindrome;
	
	@Given("I entered string {string}")
	public void i_entered_string(String toTest) {
		testPalindrome = toTest;
	}
	
	
	@When("I test it for palindrome")
	public void i_test_it_for_palindrome() {
		isPalindrome = testPalindrome.equalsIgnoreCase(new StringBuilder(testPalindrome).reverse().toString());	
	}
	
	@Then("the result should be {string}")
	public void the_result_should_be(String result) {
		boolean expectedResult = Boolean.parseBoolean(result);
		System.out.println(expectedResult);
		if(expectedResult) {
			Assert.assertTrue(isPalindrome);
		} else {
			Assert.assertFalse(isPalindrome);
	}
	}
}
