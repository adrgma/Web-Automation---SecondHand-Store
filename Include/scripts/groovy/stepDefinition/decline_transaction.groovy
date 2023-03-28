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

public class decline_transaction {
	@Given("the user login to website with {string} {string}")
	public void the_user_login_to_website_with(String email, String password) {
		WebUI.openBrowser('https://secondhand-store.herokuapp.com/');

		WebUI.maximizeWindow();

		WebUI.callTestCase(findTestCase('Pages/page_home/navigate_to_login_page'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_login/verify_content'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_login/input_email'), [('email') : email], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_login/input_password'), [('password') : password], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_login/click_masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Seller go to daftarjual page")
	public void seller_go_to_daftarjual_page() {
		WebUI.callTestCase(findTestCase('Pages/page_home/navigate_to_daftarjual_page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Seller click Diminati in category")
	public void seller_click_Diminati_in_category() {
		WebUI.verifyElementVisible(findTestObject('page_productpage/Tab_Diminati/button_diminati'))

		WebUI.click(findTestObject('page_productpage/Tab_Diminati/button_diminati'))
	}

	@When("Seller click the product langsung tolak")
	public void seller_click_the_product_langsung_tolak() {
		WebUI.verifyElementVisible(findTestObject('page_productpage/Tab_Diminati/div_tolak_langsung'))

		WebUI.click(findTestObject('page_productpage/Tab_Diminati/div_tolak_langsung'))
	}

	@When("Seller click button Tolak to decline bid")
	public void seller_click_button_Tolak_to_decline_bid() {
		WebUI.verifyElementVisible(findTestObject('page_productpage/Tab_Diminati/button_tolak_langsung'))

		WebUI.click(findTestObject('page_productpage/Tab_Diminati/button_tolak_langsung'))
	}

	@When("Seller click Iya in pop up decline bid")
	public void seller_click_Iya_in_pop_up_decline_bid() {
		WebUI.click(findTestObject('page_productpage/Tab_Diminati/button_Iya'))
	}

	@Then("Decline bid pop up appears Tawaran produk ditolak")
	public void decline_bid_pop_up_appears_Tawaran_produk_ditolak() {
		WebUI.callTestCase(findTestCase('Pages/page_productpage/tab_diminati/verify_bid_decline'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("the user already login in Seller Account")
	public void the_user_already_login_Seller_Account() {
		WebUI.verifyElementPresent(findTestObject('page_home/btn_daftar_jual_page'), 3)
	}

	@When("Seller click the product to change status to decline")
	public void seller_click_the_product_to_change_status_to_decline() {
		WebUI.verifyElementVisible(findTestObject('page_productpage/Tab_Diminati/div_produk_change_status_decline'))

		WebUI.click(findTestObject('page_productpage/Tab_Diminati/div_produk_change_status_decline'))
	}

	@When("Seller click button Terima")
	public void seller_click_button_Terima() {
		WebUI.callTestCase(findTestCase('Pages/page_productpage/tab_diminati/click_terima_button'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.verifyElementVisible(findTestObject('page_productpage/Tab_Diminati/alert_produk_diterima'))
	}

	@When("Seller click button Status")
	public void seller_click_button_Status() {
		WebUI.verifyElementVisible(findTestObject('page_productpage/Tab_Diminati/button_Status'))

		WebUI.click(findTestObject('page_productpage/Tab_Diminati/button_Status'))
	}

	@When("Seller click radio button Batalkan transaksi")
	public void seller_click_radio_button_Batalkan_transaksi() {
		WebUI.click(findTestObject('page_productpage/Tab_Diminati/input_batalkan_transaksi'))

		WebUI.click(findTestObject('page_productpage/Tab_Diminati/button_change_status_transaction'))
	}

	@Then("Sellers success to decline bid")
	public void Sellers_success_to_decline_bid() {
		WebUI.click(findTestObject('page_daftarjual/btn_daftar_jual_page'))

		WebUI.click(findTestObject('page_productpage/Tab_Diminati/button_diminati'))

		WebUI.verifyElementNotPresent(findTestObject('page_productpage/Tab_Diminati/div_produk_change_status_decline'), 3)
	}
}
