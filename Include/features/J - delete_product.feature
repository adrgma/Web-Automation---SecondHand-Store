@DLP
Feature: delete product

	@DLP001
  Scenario: user delete product
    Given the user already login with "d.erprion@gmail.com" and "qwerty1234"
    When user open daftarjual page
    And user delete all product that want to delete
    Then not appear in the daftarjual page
