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

public class notification {
	@Given("user already on login page")
	public void user_already_on_login_page() {
		WebUI.openBrowser('https://secondhand-store.herokuapp.com/');
		WebUI.maximizeWindow();
		WebUI.callTestCase(findTestCase('Pages/page_home/navigate_to_login_page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user input email {string}")
	public void user_input_email(String email) {
		WebUI.callTestCase(findTestCase('Pages/page_login/input_email'), [('email') : email], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user input password {string}")
	public void user_input_password(String password) {
		WebUI.callTestCase(findTestCase('Pages/page_login/input_password'), [('password') : password], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user click button login")
	public void user_click_button_login() {
		WebUI.callTestCase(findTestCase('Pages/page_login/click_masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("user click icon lonceng")
	public void user_click_icon_lonceng() {
		WebUI.callTestCase(findTestCase('Pages/page_notification/click_icon_lonceng'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("a list of product offerings appears")
	public void a_list_of_product_offerings_appears() {
		WebUI.callTestCase(findTestCase('Pages/page_notification/list_notif'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}
