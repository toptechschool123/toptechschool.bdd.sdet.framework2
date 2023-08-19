Feature: Items checkout functionality

@checkout
  Scenario: Test ItemsCheckout
    Given user is in homepage
    When user clicks MyAccount
    And user clicks Login
    And user enters email 'sadatsayedibrahim@gmail.com'
    And user enters password 'test123'
    And user clicks loginButton
    Then user move to Cameras
    And user user moves to SonyItem and clicks it
    Then user adds an item to cart
    And user clicks items MyAccount at the bottom of the page
    Then user logs out
