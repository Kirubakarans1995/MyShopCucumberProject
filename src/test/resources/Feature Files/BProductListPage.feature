Feature: To add an iPhone in the cart
@smoke
Scenario: To select a latest model iPhone
Given User have to enable Search in Product Description check box and click Search button
When User have to apply Sort and select Price(Low>High) option 
Then User have to select iPhone listed below

@smoke
Scenario: To check the Review and add iPhone to the cart
Given User have to check the pictures of the product
When User have to check the review for the product
And User have to click Add to Cart button
Then User have to click Shopping Cart link text