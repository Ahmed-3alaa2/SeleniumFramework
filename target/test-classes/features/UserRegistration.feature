Feature: UserRegistration
I want to check 


Scenario Outline: UserRegistration
Given the user in home page
When i click on register page
And I entered "<firstname>","<lastname>","<email>","<password>"
Then the registration page displayed 

Examples:
| firstname | lastname | email | password |
| ahmed | mohamed | ahmed@test.com | 1234665 |
