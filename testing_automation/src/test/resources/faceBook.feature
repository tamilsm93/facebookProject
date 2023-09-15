Feature:  Login the faceBook page

Scenario: User login with valid credentials
					Given launch the facebook
					When login with "testt@gmail.com" and "123@123"
					Then click the login button

Scenario: User login with invalid credentials
					Given launch the facebook
					When login with "test12@gmail.com" and "12@123"
					Then click the login button 					 

Scenario Outline: User login with valid credential
		Given launch the facebook 
		When login with <username> and <password>
		Then click the login button
   Examples:
		| username| password |
		|"test3@gmail.com"|	"123@12312i"|
		|"test123@gmail.com"|	"12@12312"|
		|"test12@ymail.com"|	"12@1231"|
		|"test101@gmail.com"|	"12@131"|
		|"test110@gmail.com"|	"12@141"| 



