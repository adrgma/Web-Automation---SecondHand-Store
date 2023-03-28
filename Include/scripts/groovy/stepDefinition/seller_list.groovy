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
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable

public class seller_list {

	@Given("the user already login with email {string} and password {string}")
	public void the_user_already_login_with_email_and_password(String email, String password) {
		WebUI.callTestCase(findTestCase('Pages/page_login/navigate_to_login_page'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_login/input_email'), [('email') : email], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_login/input_password'), [('password') : password], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_login/click_masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user click logo navigation")
	public void user_click_logo_navigation() {
		WebUI.callTestCase(findTestCase('Pages/page_home/navigate_to_daftarjual_page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Daftar Jual Saya page displayed")
	public void daftar_Jual_Saya_page_displayed() {
		WebUI.callTestCase(findTestCase('Pages/page_sellerlist/verify_all_product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("the user already in Daftar Jual Saya page")
	public void the_user_already_in_Daftar_Jual_Saya_page() {
		WebUI.callTestCase(findTestCase('Pages/page_home/navigate_to_daftarjual_page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user click category Diminati")
	public void user_click_category_Diminati() {
		WebUI.callTestCase(findTestCase('Pages/page_sellerlist/click_button_diminati'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("user can view list of products that buyers are interested in")
	public void user_can_view_list_of_products_that_buyers_are_interested_in() {
		WebUI.callTestCase(findTestCase('Pages/page_sellerlist/verify_list_diminati'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("the user already in DaftarJual Saya page")
	public void the_user_already_in_DaftarJual_Saya_page() {
		WebUI.callTestCase(findTestCase('Pages/page_home/navigate_to_daftarjual_page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user click category Terjual")
	public void user_click_category_Terjual() {
		WebUI.callTestCase(findTestCase('Pages/page_sellerlist/click_button_terjual'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("user can view list of products that have been sold")
	public void user_can_view_list_of_products_that_have_been_sold() {
		WebUI.callTestCase(findTestCase('Pages/page_sellerlist/verify_list_terjual'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}