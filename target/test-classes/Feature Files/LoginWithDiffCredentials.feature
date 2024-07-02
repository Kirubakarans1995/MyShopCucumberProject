@loginthree
Feature: To validate the Login functionality of opencar application
Scenario Outline: To validate Login functionality with different Credentials
Given User have to enter opencart application through chrome browser
And User have to click My Account Drop Down and select Login
When User have to enter "<username>" and "<password>"
Then User have to click Login button

Examples:
|username|pasword|
|test@gmail.com|test123|
|admin@gmail.com|admin123|
|user@gmail.com|user123|