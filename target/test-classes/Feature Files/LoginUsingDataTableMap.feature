@logintwo
Feature: To do Login into the opencart application
Scenario: To do Login into the opencart application with the Valid Credentials using Map
Given User should have to enter into the opencart application through the chrome browser
And User should have to click the My Account Drop Down and select Login
When User should have to enter the Valid Email and Valid Password
|email|password|
|test123@gmail.com|1234567890|
|dominickaran95@gmail.com|test123|
Then User must have to click the Login button