@Login
Feature: Login

@LGI001
Scenario: User want to login using correct credential
 Given User navigate to the login page
 When User click the Masuk
 And User input Email field with registered credential "nathaliemeimei@gmail.com"
 And User input Password field with registered credential "aduuuh12"
 And User click Masuk
 Then Daftar Jual page appears
 
@LGI002
Scenario: User want to login by not filling all field
  Given User navigate to the login page
  When User click the Masuk
  And User click Masuk
  Then User can not login

@LGI003
Scenario: User want to login using incorrect email credential
  Given User navigate to the login page
  When User click the Masuk
  And User input Email field with incorrect credential "nataa32@gmail.com"
  And User input Password field with registered credential "aduuuh12"
  And User click Masuk
  Then User can not login
  
@LGI004
Scenario: User want to login using incorrect password credential
  Given User navigate to the login page
  When User click the Masuk
  And User input Email field with registered credential "nathaliemeimei@gmail.com"
  And User input Password field with incorrect credential "adudu12"
  And User click Masuk
  Then User can not login

@LGI005
Scenario: User input incorrect email format on email textfield
  Given User navigate to the login page
  When User click the Masuk
  And User input Email field with incorrect format "nathaliemeimei"
  And User input Password field with registered credential "aduuuh12"
  And User click Masuk
  Then User can not login