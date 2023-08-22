Feature: Register new user functionality

  @RegForm
  Scenario: Register Account for new User
    Given User is on TEST Environment page
    When User click on MyAccount
    And User click on Register
    And user fills out the following information
      | FirstName | LastName | Email                     | Telephone  | Country     | Password | ConfirmPassword |
      | Sayed     | Sadat    | sayed0220@toptechschool.us | 2536529199 | Afghanistan | test123  | test123         |
    And User select 'yes' for Subscribe
    And User click privacy and policy button
    And User click Continue button
    Then user account is created with a message as follows: 'Your Account Has Been Created!'
