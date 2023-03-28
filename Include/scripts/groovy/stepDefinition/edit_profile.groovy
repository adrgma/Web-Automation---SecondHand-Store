package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.security.PublicKey

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class edit_profile {

	@Given("usr already on login page")
	public void usr_already_on_login_page() {
		WebUI.openBrowser('https://secondhand-store.herokuapp.com/');
		WebUI.maximizeWindow();
		WebUI.callTestCase(findTestCase('Pages/page_home/navigate_to_login_page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("usr input email {string}")	
	public void usr_input_email(String email) {
		WebUI.callTestCase(findTestCase('Pages/page_login/input_email'), [('email') : email], FailureHandling.STOP_ON_FAILURE)
	}

	@And("usr input password {string}")
	public void usr_input_password(String password) {
		WebUI.callTestCase(findTestCase('Pages/page_login/input_password'), [('password') : password], FailureHandling.STOP_ON_FAILURE)
	}

	@And("usr click button login")
	public void usr_click_button_login() {
		WebUI.callTestCase(findTestCase('Pages/page_login/click_masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user click icon people")
	public void user_click_icon_people() {
		WebUI.callTestCase(findTestCase('Pages/page_profile/click_icon_orang'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user click button profile")
	public void user_click_button_profile() {
		WebUI.callTestCase(findTestCase('Pages/page_profile/click_btn_profile'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user input nama {string}")
	public void user_input_nama(String nama) {
		WebUI.callTestCase(findTestCase('Pages/page_profile/input_nama'), [('nama') : nama], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user input kota {string}")
	public void user_input_kota(String kota) {
		WebUI.callTestCase(findTestCase('Pages/page_profile/input_kota'), [('kota') : kota], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user input alamat {string}")
	public void user_input_alamat(String alamat) {
		WebUI.callTestCase(findTestCase('Pages/page_profile/input_alamat'), [('alamat') : alamat], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user input phone number {string}")
	public void user_input_phone_number(String nohp) {
		WebUI.callTestCase(findTestCase('Pages/page_profile/input_no_handphone'), [('nohp') : nohp], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user click button submit")
	public void user_click_button_submit() {
		WebUI.callTestCase(findTestCase('Pages/page_profile/click_button_submit'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("appears notification the profile data has been successfully updated")
	public void appears_notification_the_profile_data_has_been_successfully_updated() {
		WebUI.callTestCase(findTestCase('Pages/page_profile/notif_success_update'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}

