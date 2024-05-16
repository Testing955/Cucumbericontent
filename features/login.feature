Feature: Login with valid credentials

  @sanity
  Scenario: Successful login with valid credentails
    Given the user is on the login page
    When user enters email as "ratant@yopmail.com" and password as "Qwerty@1"
    And when the user clicks on the login button
    Then the user should be redirected to the Dashboardpage
