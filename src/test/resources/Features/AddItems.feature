Feature: Add Items to shopping cart

  Background: 
    Given user is on homepage

@AddToCart
  Scenario: Add to shoppincart test
    When user clicks myAccount
    And user clicks loginBttn
    And user enters email 'sadatsayedibrahim@gmail.com' and password 'test123'
    And user clicks login
    Then user moves to Cameras
    Then user moves to SonyItem and clicks it
    And user adds an item to shopping cart
    Then user clicks My Account at the bottom of the page
    And user logs out
