package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import javax.lang.model.element.VariableElement

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
import groovy.json.StringEscapeUtils



class add_product {
	@Given("the user already login with {string} and {string}")
	public void the_user_already_login_with_and(String email, String password) {
		WebUI.openBrowser('https://secondhand-store.herokuapp.com/');

		WebUI.maximizeWindow();

		WebUI.callTestCase(findTestCase('Pages/page_home/navigate_to_login_page'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_login/verify_content'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_login/input_email'), [('email') : email], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_login/input_password'), [('password') : password], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_login/click_masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user click + Jual button from Homepage")
	public void user_click_Jual_button_from_Homepage() {
		WebUI.callTestCase(findTestCase('Pages/page_home/click_add_product_button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user input Product Name {string}")
	public void user_input_Product_Name(String product_name) {
		WebUI.callTestCase(findTestCase('Pages/page_productinfo/input_nama_produk_field'), [('product_name') : product_name], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user input product price {string}")
	public void user_input_product_price(String product_price) {
		WebUI.callTestCase(findTestCase('Pages/page_productinfo/input_harga_produk_field'), [('product_price') : product_price],
		FailureHandling.STOP_ON_FAILURE)
	}

	@When("user choose category product {string}")
	public void user_choose_category_product(String category) {
		WebUI.callTestCase(findTestCase('Pages/page_productinfo/choose_kategori_field'), [('category') : "Hoby"], FailureHandling.STOP_ON_FAILURE)
	}


	@When("user click Terbitkan button")
	public void user_click_Terbitkan_button() {
		WebUI.callTestCase(findTestCase('Pages/page_productinfo/click_terbitkan_button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("the product is publish and can be seen in daftarjual page")
	public void the_product_is_publish_and_can_be_seen_in_daftarjual_page() {
		WebUI.callTestCase(findTestCase('Pages/page_home/navigate_to_daftarjual_page'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.callTestCase(findTestCase('Pages/page_daftarjual/verify_add_product_from_homepage_success'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.closeBrowser();
	}

	@Given("in thedaftarjual page")
	public void in_thedaftarjual_page() {
		WebUI.callTestCase(findTestCase('Pages/page_home/navigate_to_daftarjual_page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user click Tambah Produk")
	public void user_click_Tambah_Produk() {
		WebUI.callTestCase(findTestCase('Pages/page_daftarjual/click_tambah_produk_button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user input product description {string}")
	public void user_input_product_description(String description) {
		WebUI.callTestCase(findTestCase('Pages/page_productinfo/input_deskripsi_field'), [('product_description') : description],
		FailureHandling.STOP_ON_FAILURE)
	}

	@Given("in the daftarjual page")
	public void in_the_daftarjual_page() {
		WebUI.callTestCase(findTestCase('Pages/page_home/navigate_to_daftarjual_page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user click Tambah Produk button")
	public void user_click_Tambah_Produk_button() {
		WebUI.callTestCase(findTestCase('Pages/page_daftarjual/click_tambah_produk_button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user click back button")
	public void user_click_back_button() {
		WebUI.callTestCase(findTestCase('Pages/page_productinfo/cancel_add_product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("user is redirect to previous page")
	public void user_is_redirect_to_previous_page() {
		WebUI.callTestCase(findTestCase('Pages/page_daftarjual/verify_cancel_add_product'), [:], FailureHandling.STOP_ON_FAILURE)
		WebUI.closeBrowser();
	}

	@When("user add product more than limit {string} {string} {string} {string}")
	public void user_add_product_more_than_limit(String product_name, String product_price, String category, String product_description) {
		WebUI.callTestCase(findTestCase('Pages/page_home/navigate_to_daftarjual_page'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_daftarjual/click_tambah_produk_button'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_productinfo/input_nama_produk_field'), [('product_name') : product_name], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_productinfo/input_harga_produk_field'), [('product_price') : product_price],
		FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_productinfo/input_deskripsi_field'), [('product_description') : product_description],
		FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_productinfo/choose_kategori_field'), [('category') : category], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_productinfo/click_terbitkan_button'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.delay(3)

		WebUI.callTestCase(findTestCase('Pages/page_daftarjual/click_tambah_produk_button'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_productinfo/input_nama_produk_field'), [('product_name') : product_name], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_productinfo/input_harga_produk_field'), [('product_price') : product_price],
		FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_productinfo/input_deskripsi_field'), [('product_description') : product_description],
		FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_productinfo/choose_kategori_field'), [('category') : category], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_productinfo/click_terbitkan_button'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.delay(3)

		WebUI.callTestCase(findTestCase('Pages/page_daftarjual/click_tambah_produk_button'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_productinfo/input_nama_produk_field'), [('product_name') : product_name], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_productinfo/input_harga_produk_field'), [('product_price') : product_price],
		FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_productinfo/input_deskripsi_field'), [('product_description') : product_description],
		FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_productinfo/choose_kategori_field'), [('category') : category], FailureHandling.STOP_ON_FAILURE)

		WebUI.callTestCase(findTestCase('Pages/page_productinfo/click_terbitkan_button'), [:], FailureHandling.STOP_ON_FAILURE)

		WebUI.delay(3)
	}

	@Then("warning message can be seen in display")
	public void warning_message_can_be_seen_in_display() {
		WebUI.callTestCase(findTestCase('Pages/page_productinfo/verify_alert_limit_product'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}