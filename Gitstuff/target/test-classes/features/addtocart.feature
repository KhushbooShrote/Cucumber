Feature: AddToCart Functionality for OpenCart E-commerce Website

Background:
    Given I am on the AddToCart  page
    
Scenario: Navigating to the Home page
   When I click on the "Home" icon
   Then I should be redirected to the Home page 
   
Scenario: Add item "MacBook" in the cart
   When I click on the Add TO Cart button
   Then Item should be added to the cart
   