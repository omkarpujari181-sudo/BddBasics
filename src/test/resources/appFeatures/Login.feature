Feature: Login Functionality 
Backgorund: Given user is at login page 



Scenario: As a valid user I want to get logged into my account when I provide valid usrename & password

When user provide correct "username" and "password"
And clicks on login button having id 2 
Then I should get logged into my account
And should land on home page



Scenario Outline: System should validate if username or password is empty

When user provide "<username1>" and "<password1>"
And clicks on login button
Then user should stay on login page 
And validation message should be shown to him/her

Examples: 
| username1 | password1 |
|          | 123      |          
| omkar    |          |          #Empty string  
       