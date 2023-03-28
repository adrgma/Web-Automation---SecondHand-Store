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

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import groovy.json.StringEscapeUtils


class register {
	@Given("User go to the login page")
	public void user_go_to_the_login_page() {
		WebUI.openBrowser('https://secondhand-store.herokuapp.com/');
		WebUI.maximizeWindow();
	}

	@When("User click the Masuk button")
	public void user_click_the_masuk_button() {
		WebUI.callTestCase(findTestCase('Pages/page_home/navigate_to_login_page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User click the Daftar di sini")
	public void user_click_the_daftar_di_sini() {
		WebUI.callTestCase(findTestCase('Pages/page_register/navigate_to_register_page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User input Nama field with new credential {string}")
	public void user_input_nama_field_with_new_credential(String name) {
		WebUI.callTestCase(findTestCase('Pages/page_register/input_nama'), [('nama') : name], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User input Email field with new credential {string}")
	public void user_input_email_field_with_new_credential(String email) {
		WebUI.callTestCase(findTestCase('Pages/page_register/input_email'), [('email') : email], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User input Password field with new credential {string}")
	public void user_input_password_field_with_new_credential(String password) {
		WebUI.callTestCase(findTestCase('Pages/page_register/input_password'), [('password') : password], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User click Daftar")
	public void user_click_daftar() {
		WebUI.callTestCase(findTestCase('Pages/page_register/click_daftar'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User successfully register an account")
	public void user_successfully_register_an_account() {
		WebUI.callTestCase(findTestCase('Pages/page_register/verify_content'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User leave Nama field empty {string}")
	public void user_leave_nama_field_empty(String string) {
		WebUI.callTestCase(findTestCase('Pages/page_register/input_nama'), [('nama') : ''], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User failed to register an account")
	public void user_failed_to_register_an_account() {
		WebUI.callTestCase(findTestCase('Pages/page_register/verify_content'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User input Email field with invalid email format {string}")
	public void user_input_email_field_with_invalid_email_format(String email) {
		WebUI.callTestCase(findTestCase('Pages/page_register/input_email'), [('email') : email], FailureHandling.STOP_ON_FAILURE)
	}
	@And("User input Nama field with used credential {string}")
	public void user_input_nama_field_with_used_credential(String name) {
		WebUI.callTestCase(findTestCase('Pages/page_register/input_nama'), [('nama') : name], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User input Email field with used credential {string}")
	public void user_input_email_field_with_used_credential(String email) {
		WebUI.callTestCase(findTestCase('Pages/page_register/input_email'), [('email') : email], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User input Password field with used credential {string}")
	public void user_input_password_field_with_used_credential(String password) {
		WebUI.callTestCase(findTestCase('Pages/page_register/input_password'), [('password') : password], FailureHandling.STOP_ON_FAILURE)
	}
}