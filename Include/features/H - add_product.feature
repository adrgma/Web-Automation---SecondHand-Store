@ADP
Feature: add product

  @ADP001
  Scenario: user add product to sell from Homepage
    Given the user already login with "d.erprion@gmail.com" and "qwerty1234"
    When user click + Jual button from Homepage
    And user input Product Name "HomepageProduct"
    And user input product price "141414"
    And user choose category product "Hoby"
    And user input product description "hanya untuk testing deskripsi saja"
    And user click Terbitkan button
    Then the product is publish and can be seen in daftarjual page

  @ADP002
  Scenario: user add product to sell from daftarjual page
    Given the user already login with "d.erprion@gmail.com" and "qwerty1234"
    And in thedaftarjual page
    When user click Tambah Produk
    And user input Product Name "NewProduct"
    And user input product price "115300000"
    And user choose category product "Kendaraan"
    And user input product description "hanya untuk testing deskripsi saja"
    And user click Terbitkan button
    Then the product is publish and can be seen in daftarjual page

  @ADP003
  Scenario: user Cancel add product
    Given the user already login with "d.erprion@gmail.com" and "qwerty1234"
    And in the daftarjual page
    When user click Tambah Produk button
    And user click back button
    Then user is redirect to previous page

  @ADP004
  Scenario: Add Product more than limit
    Given the user already login with "d.erprion@gmail.com" and "qwerty1234"
    And in the daftarjual page
    When user add product more than limit "NewProduct" "115300000" "Kendaraan" "hanya untuk testing deskripsi saja"
    Then warning message can be seen in display
