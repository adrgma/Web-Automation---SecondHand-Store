import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.verifyElementVisible(findTestObject('page_productpage/div_photo_product'))

WebUI.verifyElementVisible(findTestObject('page_productpage/div_profil_penjual'))

WebUI.verifyElementVisible(findTestObject('page_productpage/h5_nama_penjual'))

WebUI.verifyElementVisible(findTestObject('page_productpage/p_lokasi_penjual'))

WebUI.verifyElementVisible(findTestObject('page_productpage/h5_nama_produk'))

WebUI.verifyElementVisible(findTestObject('page_productpage/h4_Rp94.506,00'))

WebUI.verifyElementVisible(findTestObject('page_productpage/p_kategori_produk'))

WebUI.verifyElementVisible(findTestObject('page_productpage/h5_deskripsi'))

WebUI.verifyElementVisible(findTestObject('page_productpage/p_isi_deskripsi'))

WebUI.verifyElementVisible(findTestObject('page_productpage/button_bid_buy_product'))

