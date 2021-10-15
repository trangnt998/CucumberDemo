Feature: MyAccount-Register Feature
  Description: This feature will test a Register feature

  #Simple login without parameters
  Scenario: Register with valid email and password
    Given Open the browser
    When Enter the URL "http://practice.automationtesting.in/"
    And Click on My Account Menu
    And Enter registered email and password
    And Click on register button
    Then User must successfully register to the web page