@edit_profile
Feature: Edit Profile



@EPR001
Scenario: User should be success edit profile
    Given usr already on login page
    When usr input email "afkoke@gmail.com"
    And usr input password "1234567890"
    And usr click button login
    And user click icon people
    And user click button profile
    And user input nama "Binar QA2"
    And user input kota "Kediri"
    And user input alamat "Jatim"
    And user input phone number "098129173"
    And user click button submit
    Then appears notification the profile data has been successfully updated
    