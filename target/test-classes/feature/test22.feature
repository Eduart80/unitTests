
Feature:
  @unit1
  Scenario: Test web Application
    When open Zedy3d i get the title 'Home'
    And click on the contact button
    Then fill out the form with name 'Johnny'
    Then fill email 'john@example.com'
    And go back to main page
    Then mouse over Other presentations