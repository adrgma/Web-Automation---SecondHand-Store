package stepDefinition

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable

public class accept_bid {
	@Given("the user already login to website with email {string} and password {string}")
	public void the_user_already_login_to_website_with_email_and_password(String email, String password) {
		WebUI.callTestCase(findTestCase('Step Definition/feature_see_product_detail/SDPhelper for accept bid'), [('email') : 'derprion@gmail.com'
			, ('password') : 'qwerty1234'], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_productpage/click_saya_tertarik_dan_ingin_nego'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_productpage/input_harga_tawar'), [('harga_tawar') : '888888'], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_productpage/click_kirim_harga_tawar'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_productpage/verify_message_success_send_harga_tawar'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_login/navigate_to_login_page'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_login/input_email'), [('email') : email], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_login/input_password'), [('password') : password], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_login/click_masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user open Daftar Jual page")
	public void user_open_Daftar_Jual_page() {
		WebUI.callTestCase(findTestCase('Pages/page_home/navigate_to_daftarjual_page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user click tab Diminati")
	public void user_click_tab_Diminati() {
		WebUI.callTestCase(findTestCase('Pages/page_sellerlist/click_button_diminati'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user click product")
	public void user_click_product() {
		WebUI.callTestCase(findTestCase('Pages/page_accept_bid/click_card_diminati'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User click button Terima")
	public void user_click_button_Terima() {
		WebUI.callTestCase(findTestCase('Pages/page_accept_bid/click_accept'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("user success to update status negotiation and accept bid")
	public void user_success_to_update_status_negotiation_and_accept_bid() {
		WebUI.callTestCase(findTestCase('Pages/page_accept_bid/success_to_accept_bid'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}
