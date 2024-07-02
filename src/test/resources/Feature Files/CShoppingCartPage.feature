Feature: To increase the iPhone count as two and get Estimated Shipping Quote
@smoke
Scenario: To increase the count of iPhone as two
Given User have to click the quantity of iPhone
When User have to clear the existed quantity value and change to two
Then User have to click Update button

@smoke
Scenario: To get Estimated Shipping Quote
Given User have to get Estimated Shipping Quote
When User have to enter the Shipping details to get Estimated Shipping Quote
And User have to click Get Quotes button
Then User have to click Apply Shipping button
And User have to click Checkout button