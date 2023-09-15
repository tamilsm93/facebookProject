Feature: Determine if string is palindrome or not
Scenario: valid palindrome
Given I entered string "Refer"
When  I test it for palindrome
Then the result should be ""
    
Scenario: invalid palindrome
Given I entered string "Coin"
When  I test it for palindrome
Then  the result should be "false" 


 Scenario Outline: Check if string is palindrome
 Given I entered word <wordToTest>
 When I test it for  Palindrome
 Then the output should be <output>

    Examples: 
      | wordToTest| output |
      | "Refer"  | "true" |
      | "Coin"   | "false" |
      | "Space"  | "false" |
      | "racecar"| "true"  |