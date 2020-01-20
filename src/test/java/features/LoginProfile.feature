@LoginProfile
Feature: login into nedbanks URL
  Scenario: Login into nedbank profile
    Given login to nedbank
    When clicking  on personal
    And click  find now
    And enter pretoria in the  search bar
    And select pretoria urology hospital
    Then click on ATM
###################################################