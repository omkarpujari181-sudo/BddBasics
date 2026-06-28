Feature: order the product


Scenario: Verify that the user is able to order the product.

Given User is at product page. 
When he added a product to a cart. 
When he clicks on order now button.
Then The order should get placed for product.


Scenario: Verify that the user is able to cancle the order 

Given The order is already placed.
When User clicks on cancle order button
Then user is able cancle his order 