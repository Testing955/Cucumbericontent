Feature: Professional Signup

  @sanity @regression
  Scenario: Successful Professional Signup
    Given the user navigates to Signup Account page
    And the user choose the profesional option and click on it
    When the user enters the details into below fields
      | firstName | Prince |
      | lastName  | Gaurav |
    And the user clicks on Continue button
    When the user enters the company details
      | Password        | Qwerty@1 |
      | ConfirmPassword | Qwerty@1 |
    And the user selects T&C
    And the user click on the user clicks on Register button
    Then the otp page should open
