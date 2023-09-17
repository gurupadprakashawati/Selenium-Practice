Feature: To validate the login functionality of sales force


 @sc1 @alpha1
   #before
  Scenario: user validate the error message
    Given user navigates to sales force application
    When user enters the username "Guru" and password "123"
    And user clicks on login button
    Then user validate the error message
    #after
  @sc2 @alpha
  Scenario: user validate the login functionality
    Given user navigates to sales force application
    When user enters the username "JONNY" and password "123"
    And user clicks on login button
    Then user should navigate to homepage
