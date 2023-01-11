Feature: checking login functionality
  Background:
  Scenario: login using username and password
    Given user is on the main page
    When user enters username and password
    And user clicks on the login button
    Then user lands on the landing page


Scenario Outline: Login Functionality
  Given user will enter Home Page
  When user will enter <username> and <password>
  And user will click on login button
  Then user navigate on the landing page

  Examples:
  |username    |  password    |
  |Srivastava  |  sri@1997    |
  |Srikanth232 |  WhiteBox123 |
