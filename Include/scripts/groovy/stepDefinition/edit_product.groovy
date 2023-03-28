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

class edit_product {
	@When("user open daftarjual page")
	public void user_open_daftarjual_page() {
		WebUI.callTestCase(findTestCase('Pages/page_home/navigate_to_daftarjual_page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user open productpage page that want to edit")
	public void user_open_productpage_page_that_want_to_edit() {
		WebUI.callTestCase(findTestCase('Pages/page_daftarjual/navigate_to_edit_product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user click Edit button")
	public void user_click_Edit_button() {
		WebUI.callTestCase(findTestCase('Pages/page_productpage/click_edit_button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user change Product Name {string}")
	public void user_change_Product_Name(String product_name) {
		WebUI.callTestCase(findTestCase('Pages/page_productinfo/input_nama_produk_field'), [('product_name') : product_name], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user change Product Price {string}")
	public void user_change_Product_Price(String product_price) {
		WebUI.callTestCase(findTestCase('Pages/page_productinfo/input_harga_produk_field'), [('product_price') : product_price],
		FailureHandling.STOP_ON_FAILURE)
	}

	@When("user choose another Product Category {string}")
	public void user_choose_another_Product_Category(String category) {
		WebUI.callTestCase(findTestCase('Pages/page_productinfo/choose_kategori_field'), [('category') : category], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user change Product Description {string}")
	public void user_change_Product_Description(String product_description) {
		WebUI.callTestCase(findTestCase('Pages/page_productinfo/input_deskripsi_field'), [('product_description') : product_description],
		FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User can publish their product, their product will be show in their Sell List page")
	public void user_can_publish_their_product_their_product_will_be_show_in_their_Sell_List_page() {

		WebUI.callTestCase(findTestCase('Pages/page_home/navigate_to_daftarjual_page'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_daftarjual/verify_edit_product_success'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user click back button for Edit")
	public void user_click_back_button_for_Edit() {
		WebUI.click(findTestObject('page_productinfo/btn_back_cancel'))
	}

	@Then("the product will not publish")
	public void the_product_will_not_publish() {
		WebUI.verifyElementVisible(findTestObject('page_home/h2_homepage'), FailureHandling.STOP_ON_FAILURE)
	}
}
