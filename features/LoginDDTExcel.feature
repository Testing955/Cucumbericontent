Feature: Login Data Driven with Excel

  Scenario Outline: Login Data Driven Excel
    Given the user should be redirected to the login Page by passing email and password with excel row "<row_index>"

    Examples: 
      | row_index |
      |         1 |
      |         2 |
      |         3 |
