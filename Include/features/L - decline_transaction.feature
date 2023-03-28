@UTD
Feature: buyer bid or buy product

  @UTD001
  Scenario: Seller Decline Bid
    Given the user login to website with "j.inprion@gmail.com" "qwerty1234"
    When Seller go to daftarjual page
    And Seller click Diminati in category
    And Seller click the product langsung tolak
    And Seller click button Tolak to decline bid
    And Seller click Iya in pop up decline bid
    Then Decline bid pop up appears Tawaran produk ditolak

  @UTD002
  Scenario: Seller Change transaction status to decline
    Given the user already login in Seller Account
    When Seller go to daftarjual page
    And Seller click Diminati in category
    And Seller click the product to change status to decline
    And Seller click button Terima
    And Seller click button Status
    And Seller click radio button Batalkan transaksi
    Then Sellers success to decline bid
