Feature: facebook application login check
Scenario: Home page login with valid credential
Given launch the facebook browser
When  user needs to enter the valid username <username> and <password>
Then user needs to click the login button
Then create the facebook user account
Then add the relavent details
Then close the browser

| username| password |
|"test3@gmail.com"|	"123@12312i"|
|"test123@gmail.com"|	"12@12312"|
|"test12@ymail.com"|	"12@1231"|
|"test101@gmail.com"|	"12@131"|
|"test110@gmail.com"|	"12@141"|