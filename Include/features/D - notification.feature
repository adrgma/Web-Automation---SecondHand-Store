@notification
Feature: Notification



@NOT001
Scenario: User should be success see notification
    Given user already on login page
    When user input email "afkoke@gmail.com"
    And user input password "1234567890"
    And user click button login
    And user click icon lonceng
    Then a list of product offerings appears
    