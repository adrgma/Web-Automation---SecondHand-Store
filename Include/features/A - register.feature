@Register
Feature: register

@RGT001
Scenario: User register with new email address and password
 Given User go to the login page
 When User click the Masuk button
 And User click the Daftar di sini
 And User input Nama field with new credential "Mooyayy54"
 And User input Email field with new credential "mooyayya454ft3@gmail.com"
 And User input Password field with new credential "mooyayy54"
 And User click Daftar
 Then User successfully register an account

@RGT002
Scenario: User register by not filling all field
 Given User go to the login page
 When User click the Masuk button
 And User click the Daftar di sini
 And User click Daftar
 Then User failed to register an account

@RGT003
Scenario: User register with invalid email format
Given User go to the login page
 When User click the Masuk button
 And User click the Daftar di sini
 And User input Nama field with new credential "Mooyayy54"
 And User input Email field with invalid email format "mooyayy54"
 And User input Password field with new credential "mooyayy54"
 And User click Daftar
 Then User failed to register an account

@RGT004
Scenario: User register with used credential
 Given User go to the login page
 When User click the Masuk button
 And User click the Daftar di sini
 And User input Nama field with used credential "Nathalie"
 And User input Email field with used credential "nathaliemeimei@gmail.com"
 And User input Password field with used credential "aduuuh12"
 And User click Daftar
 Then User failed to register an account