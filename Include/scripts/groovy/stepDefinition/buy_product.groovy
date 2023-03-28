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

public class buy_product {
	@Given("the buyer already login with {string} {string}")
	public void the_buyer_already_login_with(String email, String password) {
		WebUI.openBrowser('https://secondhand-store.herokuapp.com/');

		WebUI.maximizeWindow();

		WebUI.callTestCase(findTestCase('Pages/page_home/navigate_to_login_page'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_login/verify_content'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_login/input_email'), [('email') : email], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_login/input_password'), [('password') : password], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_login/click_masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("buyer open home page")
	public void buyer_open_home_page() {
		WebUI.callTestCase(findTestCase('Pages/page_home/navigate_to_produk_tolak_langsung'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("click the product")
	public void click_the_product() {
		WebUI.callTestCase(findTestCase('Pages/page_productpage/verify_product_page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("buyer click Saya tertarik dan ingin nego button")
	public void buyer_click_Saya_tertarik_dan_ingin_nego_button() {
		WebUI.callTestCase(findTestCase('Pages/page_productpage/click_saya_tertarik_dan_ingin_nego'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("buyer input Harga Tawar {string}")
	public void buyer_input_Harga_Tawar(String harga_tawar) {
		WebUI.callTestCase(findTestCase('Pages/page_productpage/input_harga_tawar'), [('harga_tawar') : harga_tawar], FailureHandling.STOP_ON_FAILURE)
	}

	@When("buyer click Kirim button")
	public void buyer_click_Kirim_button() {
		WebUI.callTestCase(findTestCase('Pages/page_productpage/click_kirim_harga_tawar'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Harga tawarmu berhasil dikirim ke penjual notification appears")
	public void harga_tawarmu_berhasil_dikirim_ke_penjual_notification_appears() {
		WebUI.delay(2)

		WebUI.verifyElementVisible(findTestObject('page_productpage/div_alert_berhasil_kirim'))
	}

	@Then("Saya tertarik dan ingin nego button change into Menunggu respon penjual.")
	public void saya_tertarik_dan_ingin_nego_button_change_into_Menunggu_respon_penjual() {
		WebUI.verifyElementVisible(findTestObject('page_productpage/div_menunggu_respon_penjual'))
	}
}
