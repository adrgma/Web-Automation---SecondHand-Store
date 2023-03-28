$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/A - register.feature");
formatter.feature({
  "name": "register",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Register"
    }
  ]
});
formatter.scenario({
  "name": "User register with new email address and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Register"
    },
    {
      "name": "@RGT001"
    }
  ]
});
formatter.step({
  "name": "User go to the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "register.user_go_to_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the Masuk button",
  "keyword": "When "
});
formatter.match({
  "location": "register.user_click_the_masuk_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the Daftar di sini",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_click_the_daftar_di_sini()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input Nama field with new credential \"Mooyayy54\"",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_input_nama_field_with_new_credential(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input Email field with new credential \"mooyayya454ft3@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_input_email_field_with_new_credential(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input Password field with new credential \"mooyayy54\"",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_input_password_field_with_new_credential(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click Daftar",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_click_daftar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User successfully register an account",
  "keyword": "Then "
});
formatter.match({
  "location": "register.user_successfully_register_an_account()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User register by not filling all field",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Register"
    },
    {
      "name": "@RGT002"
    }
  ]
});
formatter.step({
  "name": "User go to the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "register.user_go_to_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the Masuk button",
  "keyword": "When "
});
formatter.match({
  "location": "register.user_click_the_masuk_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the Daftar di sini",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_click_the_daftar_di_sini()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click Daftar",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_click_daftar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User failed to register an account",
  "keyword": "Then "
});
formatter.match({
  "location": "register.user_failed_to_register_an_account()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User register with invalid email format",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Register"
    },
    {
      "name": "@RGT003"
    }
  ]
});
formatter.step({
  "name": "User go to the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "register.user_go_to_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the Masuk button",
  "keyword": "When "
});
formatter.match({
  "location": "register.user_click_the_masuk_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the Daftar di sini",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_click_the_daftar_di_sini()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input Nama field with new credential \"Mooyayy54\"",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_input_nama_field_with_new_credential(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input Email field with invalid email format \"mooyayy54\"",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_input_email_field_with_invalid_email_format(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input Password field with new credential \"mooyayy54\"",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_input_password_field_with_new_credential(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click Daftar",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_click_daftar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User failed to register an account",
  "keyword": "Then "
});
formatter.match({
  "location": "register.user_failed_to_register_an_account()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User register with used credential",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Register"
    },
    {
      "name": "@RGT004"
    }
  ]
});
formatter.step({
  "name": "User go to the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "register.user_go_to_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the Masuk button",
  "keyword": "When "
});
formatter.match({
  "location": "register.user_click_the_masuk_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the Daftar di sini",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_click_the_daftar_di_sini()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input Nama field with used credential \"Nathalie\"",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_input_nama_field_with_used_credential(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input Email field with used credential \"nathaliemeimei@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_input_email_field_with_used_credential(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input Password field with used credential \"aduuuh12\"",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_input_password_field_with_used_credential(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click Daftar",
  "keyword": "And "
});
formatter.match({
  "location": "register.user_click_daftar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User failed to register an account",
  "keyword": "Then "
});
formatter.match({
  "location": "register.user_failed_to_register_an_account()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("Include/features/B - login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.scenario({
  "name": "User want to login using correct credential",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@LGI001"
    }
  ]
});
formatter.step({
  "name": "User navigate to the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "login.user_navigate_to_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the Masuk",
  "keyword": "When "
});
formatter.match({
  "location": "login.user_click_the_Masuk()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input Email field with registered credential \"nathaliemeimei@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_input_Email_field_with_registered_credential(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input Password field with registered credential \"aduuuh12\"",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_input_Password_field_with_registered_credential(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click Masuk",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_click_Masuk()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Daftar Jual page appears",
  "keyword": "Then "
});
formatter.match({
  "location": "login.daftar_Jual_page_appears()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User want to login by not filling all field",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@LGI002"
    }
  ]
});
formatter.step({
  "name": "User navigate to the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "login.user_navigate_to_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the Masuk",
  "keyword": "When "
});
formatter.match({
  "location": "login.user_click_the_Masuk()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click Masuk",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_click_Masuk()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can not login",
  "keyword": "Then "
});
formatter.match({
  "location": "login.user_can_not_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User want to login using incorrect email credential",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@LGI003"
    }
  ]
});
formatter.step({
  "name": "User navigate to the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "login.user_navigate_to_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the Masuk",
  "keyword": "When "
});
formatter.match({
  "location": "login.user_click_the_Masuk()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input Email field with incorrect credential \"nataa32@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_input_email_field_with_incorrect_credential(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input Password field with registered credential \"aduuuh12\"",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_input_Password_field_with_registered_credential(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click Masuk",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_click_Masuk()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can not login",
  "keyword": "Then "
});
formatter.match({
  "location": "login.user_can_not_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User want to login using incorrect password credential",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@LGI004"
    }
  ]
});
formatter.step({
  "name": "User navigate to the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "login.user_navigate_to_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the Masuk",
  "keyword": "When "
});
formatter.match({
  "location": "login.user_click_the_Masuk()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input Email field with registered credential \"nathaliemeimei@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_input_Email_field_with_registered_credential(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input Password field with incorrect credential \"adudu12\"",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_input_password_field_with_incorrect_credential(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click Masuk",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_click_Masuk()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can not login",
  "keyword": "Then "
});
formatter.match({
  "location": "login.user_can_not_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User input incorrect email format on email textfield",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@LGI005"
    }
  ]
});
formatter.step({
  "name": "User navigate to the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "login.user_navigate_to_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the Masuk",
  "keyword": "When "
});
formatter.match({
  "location": "login.user_click_the_Masuk()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input Email field with incorrect format \"nathaliemeimei\"",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_input_email_field_with_incorrect_format(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input Password field with registered credential \"aduuuh12\"",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_input_Password_field_with_registered_credential(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click Masuk",
  "keyword": "And "
});
formatter.match({
  "location": "login.user_click_Masuk()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can not login",
  "keyword": "Then "
});
formatter.match({
  "location": "login.user_can_not_login()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("Include/features/C - logout.feature");
formatter.feature({
  "name": "Logout",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Logout"
    }
  ]
});
formatter.scenario({
  "name": "User wants to log out from his account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Logout"
    },
    {
      "name": "@LGO001"
    }
  ]
});
formatter.step({
  "name": "User already login with \"nathaliemeimei@gmail.com\" and \"aduuuh12\"",
  "keyword": "Given "
});
formatter.match({
  "location": "logout.user_already_login_with_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click Profile Icon",
  "keyword": "And "
});
formatter.match({
  "location": "logout.user_click_profile_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click Log Out",
  "keyword": "Then "
});
formatter.match({
  "location": "logout.user_click_log_out()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("Include/features/D - notification.feature");
formatter.feature({
  "name": "Notification",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@notification"
    }
  ]
});
formatter.scenario({
  "name": "User should be success see notification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@notification"
    },
    {
      "name": "@NOT001"
    }
  ]
});
formatter.step({
  "name": "user already on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "notification.user_already_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input email \"afkoke@gmail.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "notification.user_input_email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input password \"1234567890\"",
  "keyword": "And "
});
formatter.match({
  "location": "notification.user_input_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click button login",
  "keyword": "And "
});
formatter.match({
  "location": "notification.user_click_button_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click icon lonceng",
  "keyword": "And "
});
formatter.match({
  "location": "notification.user_click_icon_lonceng()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a list of product offerings appears",
  "keyword": "Then "
});
formatter.match({
  "location": "notification.a_list_of_product_offerings_appears()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("Include/features/E - filter.feature");
formatter.feature({
  "name": "filter",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@FLT"
    }
  ]
});
formatter.scenario({
  "name": "User filter product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FLT"
    },
    {
      "name": "@FLT"
    }
  ]
});
formatter.step({
  "name": "the user already in home page",
  "keyword": "Given "
});
formatter.match({
  "location": "filter.the_user_already_in_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select category",
  "keyword": "When "
});
formatter.match({
  "location": "filter.user_select_category()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "product list displayed by category",
  "keyword": "Then "
});
formatter.match({
  "location": "filter.product_list_displayed_by_category()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("Include/features/F - edit_profile.feature");
formatter.feature({
  "name": "Edit Profile",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@edit_profile"
    }
  ]
});
formatter.scenario({
  "name": "User should be success edit profile",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@edit_profile"
    },
    {
      "name": "@EPR001"
    }
  ]
});
formatter.step({
  "name": "usr already on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "edit_profile.usr_already_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usr input email \"afkoke@gmail.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "edit_profile.usr_input_email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usr input password \"1234567890\"",
  "keyword": "And "
});
formatter.match({
  "location": "edit_profile.usr_input_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usr click button login",
  "keyword": "And "
});
formatter.match({
  "location": "edit_profile.usr_click_button_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click icon people",
  "keyword": "And "
});
formatter.match({
  "location": "edit_profile.user_click_icon_people()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click button profile",
  "keyword": "And "
});
formatter.match({
  "location": "edit_profile.user_click_button_profile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input nama \"Binar QA2\"",
  "keyword": "And "
});
formatter.match({
  "location": "edit_profile.user_input_nama(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input kota \"Kediri\"",
  "keyword": "And "
});
formatter.match({
  "location": "edit_profile.user_input_kota(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input alamat \"Jatim\"",
  "keyword": "And "
});
formatter.match({
  "location": "edit_profile.user_input_alamat(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input phone number \"098129173\"",
  "keyword": "And "
});
formatter.match({
  "location": "edit_profile.user_input_phone_number(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click button submit",
  "keyword": "And "
});
formatter.match({
  "location": "edit_profile.user_click_button_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "appears notification the profile data has been successfully updated",
  "keyword": "Then "
});
formatter.match({
  "location": "edit_profile.appears_notification_the_profile_data_has_been_successfully_updated()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("Include/features/G - seller_list.feature");
formatter.feature({
  "name": "seller list",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@SLL"
    }
  ]
});
formatter.scenario({
  "name": "user view seller list",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SLL"
    },
    {
      "name": "@SLL001"
    }
  ]
});
formatter.step({
  "name": "the user already login with email \"putriyulina45@gmail.com\" and password \"Puyulputriyulina123\"",
  "keyword": "Given "
});
formatter.match({
  "location": "seller_list.the_user_already_login_with_email_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click logo navigation",
  "keyword": "When "
});
formatter.match({
  "location": "seller_list.user_click_logo_navigation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Daftar Jual Saya page displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "seller_list.daftar_Jual_Saya_page_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user view list of products that buyers are interested in",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SLL"
    },
    {
      "name": "@SLL002"
    }
  ]
});
formatter.step({
  "name": "the user already in Daftar Jual Saya page",
  "keyword": "Given "
});
formatter.match({
  "location": "seller_list.the_user_already_in_Daftar_Jual_Saya_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click category Diminati",
  "keyword": "When "
});
formatter.match({
  "location": "seller_list.user_click_category_Diminati()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can view list of products that buyers are interested in",
  "keyword": "Then "
});
formatter.match({
  "location": "seller_list.user_can_view_list_of_products_that_buyers_are_interested_in()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user view list of products that have been sold",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SLL"
    },
    {
      "name": "@SLL003"
    }
  ]
});
formatter.step({
  "name": "the user already in DaftarJual Saya page",
  "keyword": "Given "
});
formatter.match({
  "location": "seller_list.the_user_already_in_DaftarJual_Saya_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click category Terjual",
  "keyword": "When "
});
formatter.match({
  "location": "seller_list.user_click_category_Terjual()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can view list of products that have been sold",
  "keyword": "Then "
});
formatter.match({
  "location": "seller_list.user_can_view_list_of_products_that_have_been_sold()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("Include/features/H - add_product.feature");
formatter.feature({
  "name": "add product",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@ADP"
    }
  ]
});
formatter.scenario({
  "name": "user add product to sell from Homepage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ADP"
    },
    {
      "name": "@ADP001"
    }
  ]
});
formatter.step({
  "name": "the user already login with \"d.erprion@gmail.com\" and \"qwerty1234\"",
  "keyword": "Given "
});
formatter.match({
  "location": "add_product.the_user_already_login_with_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click + Jual button from Homepage",
  "keyword": "When "
});
formatter.match({
  "location": "add_product.user_click_Jual_button_from_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input Product Name \"HomepageProduct\"",
  "keyword": "And "
});
formatter.match({
  "location": "add_product.user_input_Product_Name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input product price \"141414\"",
  "keyword": "And "
});
formatter.match({
  "location": "add_product.user_input_product_price(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user choose category product \"Hoby\"",
  "keyword": "And "
});
formatter.match({
  "location": "add_product.user_choose_category_product(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input product description \"hanya untuk testing deskripsi saja\"",
  "keyword": "And "
});
formatter.match({
  "location": "add_product.user_input_product_description(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click Terbitkan button",
  "keyword": "And "
});
formatter.match({
  "location": "add_product.user_click_Terbitkan_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the product is publish and can be seen in daftarjual page",
  "keyword": "Then "
});
formatter.match({
  "location": "add_product.the_product_is_publish_and_can_be_seen_in_daftarjual_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user add product to sell from daftarjual page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ADP"
    },
    {
      "name": "@ADP002"
    }
  ]
});
formatter.step({
  "name": "the user already login with \"d.erprion@gmail.com\" and \"qwerty1234\"",
  "keyword": "Given "
});
formatter.match({
  "location": "add_product.the_user_already_login_with_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "in thedaftarjual page",
  "keyword": "And "
});
formatter.match({
  "location": "add_product.in_thedaftarjual_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click Tambah Produk",
  "keyword": "When "
});
formatter.match({
  "location": "add_product.user_click_Tambah_Produk()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input Product Name \"NewProduct\"",
  "keyword": "And "
});
formatter.match({
  "location": "add_product.user_input_Product_Name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input product price \"115300000\"",
  "keyword": "And "
});
formatter.match({
  "location": "add_product.user_input_product_price(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user choose category product \"Kendaraan\"",
  "keyword": "And "
});
formatter.match({
  "location": "add_product.user_choose_category_product(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input product description \"hanya untuk testing deskripsi saja\"",
  "keyword": "And "
});
formatter.match({
  "location": "add_product.user_input_product_description(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click Terbitkan button",
  "keyword": "And "
});
formatter.match({
  "location": "add_product.user_click_Terbitkan_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the product is publish and can be seen in daftarjual page",
  "keyword": "Then "
});
formatter.match({
  "location": "add_product.the_product_is_publish_and_can_be_seen_in_daftarjual_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user Cancel add product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ADP"
    },
    {
      "name": "@ADP003"
    }
  ]
});
formatter.step({
  "name": "the user already login with \"d.erprion@gmail.com\" and \"qwerty1234\"",
  "keyword": "Given "
});
formatter.match({
  "location": "add_product.the_user_already_login_with_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "in the daftarjual page",
  "keyword": "And "
});
formatter.match({
  "location": "add_product.in_the_daftarjual_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click Tambah Produk button",
  "keyword": "When "
});
formatter.match({
  "location": "add_product.user_click_Tambah_Produk_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click back button",
  "keyword": "And "
});
formatter.match({
  "location": "add_product.user_click_back_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is redirect to previous page",
  "keyword": "Then "
});
formatter.match({
  "location": "add_product.user_is_redirect_to_previous_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add Product more than limit",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ADP"
    },
    {
      "name": "@ADP004"
    }
  ]
});
formatter.step({
  "name": "the user already login with \"d.erprion@gmail.com\" and \"qwerty1234\"",
  "keyword": "Given "
});
formatter.match({
  "location": "add_product.the_user_already_login_with_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "in the daftarjual page",
  "keyword": "And "
});
formatter.match({
  "location": "add_product.in_the_daftarjual_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user add product more than limit \"NewProduct\" \"115300000\" \"Kendaraan\" \"hanya untuk testing deskripsi saja\"",
  "keyword": "When "
});
formatter.match({
  "location": "add_product.user_add_product_more_than_limit(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "warning message can be seen in display",
  "keyword": "Then "
});
formatter.match({
  "location": "add_product.warning_message_can_be_seen_in_display()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("Include/features/I - edit_product.feature");
formatter.feature({
  "name": "edit product",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@EDP"
    }
  ]
});
formatter.scenario({
  "name": "user edit product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EDP"
    },
    {
      "name": "@EDP001"
    }
  ]
});
formatter.step({
  "name": "the user already login with \"d.erprion@gmail.com\" and \"qwerty1234\"",
  "keyword": "Given "
});
formatter.match({
  "location": "add_product.the_user_already_login_with_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user open daftarjual page",
  "keyword": "When "
});
formatter.match({
  "location": "edit_product.user_open_daftarjual_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user open productpage page that want to edit",
  "keyword": "And "
});
formatter.match({
  "location": "edit_product.user_open_productpage_page_that_want_to_edit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click Edit button",
  "keyword": "And "
});
formatter.match({
  "location": "edit_product.user_click_Edit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user change Product Name \"edit produk berhasil\"",
  "keyword": "And "
});
formatter.match({
  "location": "edit_product.user_change_Product_Name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user change Product Price \"333333333\"",
  "keyword": "And "
});
formatter.match({
  "location": "edit_product.user_change_Product_Price(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user choose another Product Category \"Kendaraan\"",
  "keyword": "And "
});
formatter.match({
  "location": "edit_product.user_choose_another_Product_Category(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user change Product Description \"edit deksripsi produk\"",
  "keyword": "And "
});
formatter.match({
  "location": "edit_product.user_change_Product_Description(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click Terbitkan button",
  "keyword": "And "
});
formatter.match({
  "location": "add_product.user_click_Terbitkan_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can publish their product, their product will be show in their Sell List page",
  "keyword": "Then "
});
formatter.match({
  "location": "edit_product.user_can_publish_their_product_their_product_will_be_show_in_their_Sell_List_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user cancel edit product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EDP"
    },
    {
      "name": "@EDP002"
    }
  ]
});
formatter.step({
  "name": "the user already login with \"d.erprion@gmail.com\" and \"qwerty1234\"",
  "keyword": "Given "
});
formatter.match({
  "location": "add_product.the_user_already_login_with_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user open daftarjual page",
  "keyword": "When "
});
formatter.match({
  "location": "edit_product.user_open_daftarjual_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user open productpage page that want to edit",
  "keyword": "And "
});
formatter.match({
  "location": "edit_product.user_open_productpage_page_that_want_to_edit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click Edit button",
  "keyword": "And "
});
formatter.match({
  "location": "edit_product.user_click_Edit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click back button for Edit",
  "keyword": "And "
});
formatter.match({
  "location": "edit_product.user_click_back_button_for_Edit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the product will not publish",
  "keyword": "Then "
});
formatter.match({
  "location": "edit_product.the_product_will_not_publish()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("Include/features/J - delete_product.feature");
formatter.feature({
  "name": "delete product",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@DLP"
    }
  ]
});
formatter.scenario({
  "name": "user delete product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@DLP"
    },
    {
      "name": "@DLP001"
    }
  ]
});
formatter.step({
  "name": "the user already login with \"d.erprion@gmail.com\" and \"qwerty1234\"",
  "keyword": "Given "
});
formatter.match({
  "location": "add_product.the_user_already_login_with_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user open daftarjual page",
  "keyword": "When "
});
formatter.match({
  "location": "edit_product.user_open_daftarjual_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user delete all product that want to delete",
  "keyword": "And "
});
formatter.match({
  "location": "delete_product.user_delete_all_product_that_want_to_delete()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "not appear in the daftarjual page",
  "keyword": "Then "
});
formatter.match({
  "location": "delete_product.not_appear_in_the_daftarjual_page()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("Include/features/K - buy_product.feature");
formatter.feature({
  "name": "buyer bid or buy product",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@BBP"
    }
  ]
});
formatter.scenario({
  "name": "user want to bid price product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@BBP"
    },
    {
      "name": "@BBP001"
    }
  ]
});
formatter.step({
  "name": "the buyer already login with \"jin.prion@gmail.com\" \"qwerty1234\"",
  "keyword": "Given "
});
formatter.match({
  "location": "buy_product.the_buyer_already_login_with(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "buyer open home page",
  "keyword": "When "
});
formatter.match({
  "location": "buy_product.buyer_open_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the product",
  "keyword": "And "
});
formatter.match({
  "location": "buy_product.click_the_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "buyer click Saya tertarik dan ingin nego button",
  "keyword": "And "
});
formatter.match({
  "location": "buy_product.buyer_click_Saya_tertarik_dan_ingin_nego_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "buyer input Harga Tawar \"99998\"",
  "keyword": "And "
});
formatter.match({
  "location": "buy_product.buyer_input_Harga_Tawar(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "buyer click Kirim button",
  "keyword": "And "
});
formatter.match({
  "location": "buy_product.buyer_click_Kirim_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Harga tawarmu berhasil dikirim ke penjual notification appears",
  "keyword": "Then "
});
formatter.match({
  "location": "buy_product.harga_tawarmu_berhasil_dikirim_ke_penjual_notification_appears()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Saya tertarik dan ingin nego button change into Menunggu respon penjual.",
  "keyword": "And "
});
formatter.match({
  "location": "buy_product.saya_tertarik_dan_ingin_nego_button_change_into_Menunggu_respon_penjual()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Helper for change status to decline",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@BBP"
    },
    {
      "name": "@BBPHelper"
    }
  ]
});
formatter.step({
  "name": "the buyer already login with \"derprion@gmail.com\" \"qwerty1234\"",
  "keyword": "Given "
});
formatter.match({
  "location": "buy_product.the_buyer_already_login_with(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "buyer open home page",
  "keyword": "When "
});
formatter.match({
  "location": "buy_product.buyer_open_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the product",
  "keyword": "And "
});
formatter.match({
  "location": "buy_product.click_the_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "buyer click Saya tertarik dan ingin nego button",
  "keyword": "And "
});
formatter.match({
  "location": "buy_product.buyer_click_Saya_tertarik_dan_ingin_nego_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "buyer input Harga Tawar \"123456\"",
  "keyword": "And "
});
formatter.match({
  "location": "buy_product.buyer_input_Harga_Tawar(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "buyer click Kirim button",
  "keyword": "And "
});
formatter.match({
  "location": "buy_product.buyer_click_Kirim_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Harga tawarmu berhasil dikirim ke penjual notification appears",
  "keyword": "Then "
});
formatter.match({
  "location": "buy_product.harga_tawarmu_berhasil_dikirim_ke_penjual_notification_appears()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Saya tertarik dan ingin nego button change into Menunggu respon penjual.",
  "keyword": "And "
});
formatter.match({
  "location": "buy_product.saya_tertarik_dan_ingin_nego_button_change_into_Menunggu_respon_penjual()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("Include/features/L - decline_transaction.feature");
formatter.feature({
  "name": "buyer bid or buy product",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@UTD"
    }
  ]
});
formatter.scenario({
  "name": "Seller Decline Bid",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@UTD"
    },
    {
      "name": "@UTD001"
    }
  ]
});
formatter.step({
  "name": "the user login to website with \"j.inprion@gmail.com\" \"qwerty1234\"",
  "keyword": "Given "
});
formatter.match({
  "location": "decline_transaction.the_user_login_to_website_with(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Seller go to daftarjual page",
  "keyword": "When "
});
formatter.match({
  "location": "decline_transaction.seller_go_to_daftarjual_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Seller click Diminati in category",
  "keyword": "And "
});
formatter.match({
  "location": "decline_transaction.seller_click_Diminati_in_category()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Seller click the product langsung tolak",
  "keyword": "And "
});
formatter.match({
  "location": "decline_transaction.seller_click_the_product_langsung_tolak()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Seller click button Tolak to decline bid",
  "keyword": "And "
});
formatter.match({
  "location": "decline_transaction.seller_click_button_Tolak_to_decline_bid()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Seller click Iya in pop up decline bid",
  "keyword": "And "
});
formatter.match({
  "location": "decline_transaction.seller_click_Iya_in_pop_up_decline_bid()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Decline bid pop up appears Tawaran produk ditolak",
  "keyword": "Then "
});
formatter.match({
  "location": "decline_transaction.decline_bid_pop_up_appears_Tawaran_produk_ditolak()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Seller Change transaction status to decline",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@UTD"
    },
    {
      "name": "@UTD002"
    }
  ]
});
formatter.step({
  "name": "the user already login in Seller Account",
  "keyword": "Given "
});
formatter.match({
  "location": "decline_transaction.the_user_already_login_Seller_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Seller go to daftarjual page",
  "keyword": "When "
});
formatter.match({
  "location": "decline_transaction.seller_go_to_daftarjual_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Seller click Diminati in category",
  "keyword": "And "
});
formatter.match({
  "location": "decline_transaction.seller_click_Diminati_in_category()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Seller click the product to change status to decline",
  "keyword": "And "
});
formatter.match({
  "location": "decline_transaction.seller_click_the_product_to_change_status_to_decline()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Seller click button Terima",
  "keyword": "And "
});
formatter.match({
  "location": "decline_transaction.seller_click_button_Terima()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Seller click button Status",
  "keyword": "And "
});
formatter.match({
  "location": "decline_transaction.seller_click_button_Status()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Seller click radio button Batalkan transaksi",
  "keyword": "And "
});
formatter.match({
  "location": "decline_transaction.seller_click_radio_button_Batalkan_transaksi()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Sellers success to decline bid",
  "keyword": "Then "
});
formatter.match({
  "location": "decline_transaction.Sellers_success_to_decline_bid()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("Include/features/M - accept_bid.feature");
formatter.feature({
  "name": "accept bid",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@ACB001"
    }
  ]
});
formatter.scenario({
  "name": "User accept bid",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ACB001"
    },
    {
      "name": "@ACB001"
    }
  ]
});
formatter.step({
  "name": "the user already login to website with email \"putriyulina45@gmail.com\" and password \"Puyulputriyulina123\"",
  "keyword": "Given "
});
formatter.match({
  "location": "accept_bid.the_user_already_login_to_website_with_email_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user open Daftar Jual page",
  "keyword": "When "
});
formatter.match({
  "location": "accept_bid.user_open_Daftar_Jual_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click tab Diminati",
  "keyword": "And "
});
formatter.match({
  "location": "accept_bid.user_click_tab_Diminati()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click product",
  "keyword": "And "
});
formatter.match({
  "location": "accept_bid.user_click_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click button Terima",
  "keyword": "And "
});
formatter.match({
  "location": "accept_bid.user_click_button_Terima()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user success to update status negotiation and accept bid",
  "keyword": "Then "
});
formatter.match({
  "location": "accept_bid.user_success_to_update_status_negotiation_and_accept_bid()"
});
formatter.result({
  "status": "passed"
});
});