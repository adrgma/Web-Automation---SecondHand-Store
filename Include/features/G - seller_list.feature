@SLL

Feature: seller list

@SLL001
Scenario: user view seller list
Given the user already login with email "putriyulina45@gmail.com" and password "Puyulputriyulina123"
When user click logo navigation
Then Daftar Jual Saya page displayed

@SLL002
Scenario: user view list of products that buyers are interested in
Given the user already in Daftar Jual Saya page
When user click category Diminati
Then user can view list of products that buyers are interested in

@SLL003
Scenario: user view list of products that have been sold
Given the user already in DaftarJual Saya page
When user click category Terjual
Then user can view list of products that have been sold