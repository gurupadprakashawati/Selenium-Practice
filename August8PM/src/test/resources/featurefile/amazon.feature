Feature: To validate the Search functionality of Amazon
  #before // import from cucumber
  @AM1 @AMAll
  Scenario: Validate Amazon Search
    Given User navigates to Amazon page
    When User enters the search word "iPhone"
    And  User clicks on Search Button
    Then Validate the search result
  #after
@AM2 @AMAll
  Scenario: Validate the login functionality
    Given User navigates to Amazon page
    When  User click the login menu
    And User enter the credentials
    And User click on Continue button
    And User enters the Password
    And User click on sign-in button
    Then Validate error message
@AM3
  Scenario: Validate 'sort by featured' in search in Page
    Given User navigates to Amazon page
    When User enters the search word "iPhone"
    Then User clicks on Search Button
    And User clicks on Sort by featured
    And User clicks on Sort by featured dropdown value
  @AM4
  Scenario: validate static dropdown
    Given User navigates to Amazon page
    When User selects the category dropdown

    @AM5
      #before
    Scenario Outline: Search functionality with multiple data
      When User enters the search word "<Search Keyword>"

      And User clicks on Search Button
      Examples:
        | Search Keyword | Type   |
        | iPhone         | Mobile |
        | Apple          | Laptop |
        | Motorola       | Mobile |
      #after

  #before
  @Mouse
  Scenario: User check the your list
    Given User clicks the baby wishlist
    Then Verify user navigates to baby wishlist
  #after