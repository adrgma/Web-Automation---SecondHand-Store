@EDP
Feature: edit product

  @EDP001
  Scenario: user edit product
    Given the user already login with "d.erprion@gmail.com" and "qwerty1234"
    When user open daftarjual page
    And user open productpage page that want to edit
    And user click Edit button
    And user change Product Name "edit produk berhasil"
    And user change Product Price "333333333"
    And user choose another Product Category "Kendaraan"
    And user change Product Description "edit deksripsi produk"
    And user click Terbitkan button
    Then User can publish their product, their product will be show in their Sell List page

  @EDP002
  Scenario: user cancel edit product
    Given the user already login with "d.erprion@gmail.com" and "qwerty1234"
    When user open daftarjual page
    And user open productpage page that want to edit
    And user click Edit button
    And user click back button for Edit
    Then the product will not publish
