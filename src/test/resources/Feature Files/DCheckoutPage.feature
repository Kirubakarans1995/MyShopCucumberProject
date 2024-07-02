Feature: To fill the Customer details and Payment details
@smoke
Scenario: To enter Customer Login details and Account Billing details
Given User have to enter the Valid Login credentials
And User have to click the Login button
When User have to enter Product Billing details and click Continue button
Then User have to click the Continue button

@smoke
Scenario: To enter Delivery method, Payment method and confirm the Order
Given User have to give method of Delivery to the Customer
And User have to enter any Comments and click Continue button
When User have to select Payment method
And User have to enter any Comments, accept Terms & Conditions and click Continue button
Then User have to click Confirm Order button