@EnterNameAndDOB
Feature: Howord Account Management

  Scenario Outline: Enter Name and Birthday information
    Given I am on how old are you page
    When I enter  "<Name>" "<Birthday>"
    And I click on submit button
    Then My Name and Birthday should displayed



    Examples:
      | Name    | Birthday   |
      | michael | 28/12/1988 |
