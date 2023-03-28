package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class login {
	@Given("User navigate to the login page")
	public void user_navigate_to_the_login_page() {
		WebUI.openBrowser('https://secondhand-store.herokuapp.com/');
		WebUI.maximizeWindow();
	}

	@When("User click the Masuk")
	public void user_click_the_Masuk() {
		WebUI.callTestCase(findTestCase('Pages/page_home/navigate_to_login_page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User input Email field with registered credential {string}")
	public void user_input_Email_field_with_registered_credential(String email) {
		WebUI.callTestCase(findTestCase('Pages/page_login/input_email'), [('email') : email], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User input Password field with registered credential {string}")
	public void user_input_Password_field_with_registered_credential(String password) {
		WebUI.callTestCase(findTestCase('Pages/page_login/input_password'), [('password') : password], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User click Masuk")
	public void user_click_Masuk() {
		WebUI.callTestCase(findTestCase('Pages/page_login/click_masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Daftar Jual page appears")
	public void daftar_Jual_page_appears() {
		WebUI.callTestCase(findTestCase('Pages/page_home/navigate_to_daftarjual_page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User can not login")
	public void user_can_not_login() {
		WebUI.callTestCase(findTestCase('Pages/page_login/verify_content'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User input Email field with incorrect credential {string}")
	public void user_input_email_field_with_incorrect_credential(String email) {
		WebUI.callTestCase(findTestCase('Pages/page_login/input_email'), [('email') : email], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User input Password field with incorrect credential {string}")
	public void user_input_password_field_with_incorrect_credential(String password) {
		WebUI.callTestCase(findTestCase('Pages/page_login/input_password'), [('password') : password], FailureHandling.STOP_ON_FAILURE)
	}
	@And("User input Email field with incorrect format {string}")
	public void user_input_email_field_with_incorrect_format(String email) {
		WebUI.callTestCase(findTestCase('Pages/page_login/input_email'), [('email') : email], FailureHandling.STOP_ON_FAILURE)
	}
}