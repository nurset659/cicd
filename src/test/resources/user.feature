Feature: As a user i want up to date user data

  Scenario: As a user i want to update data user
    Given user on valid PUT endpoint
    When user send PUT HTTP request enponint
    Then user send update data user
    And user received HTTP response code 200 ok