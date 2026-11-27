import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.llm.keyword.LlmKeywords as LLM
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

WebUI.openBrowser(null)

WebUI.navigateToUrl('http://localhost/SigosiWeb/public/admin')

WebUI.setText(findTestObject('Page_Login Admin - SiGoSi/input_Masukkan username'), 'admin')

WebUI.setEncryptedText(findTestObject('Page_Login Admin - SiGoSi/input_Masukkan password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Page_Login Admin - SiGoSi/button_Masuk'))

WebUI.click(findTestObject('Page_Dashboard Admin - SiGoSi/a_Pengaturan Sistem'))

WebUI.setText(findTestObject('Page_Pengaturan Sistem - SiGoSi/input_maks_gagal_login'), '3')

WebUI.click(findTestObject('Page_Pengaturan Sistem - SiGoSi/input_sesi_menit'))

WebUI.setText(findTestObject('Page_Pengaturan Sistem - SiGoSi/input_kunci_menit'), '2')

WebUI.setText(findTestObject('Page_Pengaturan Sistem - SiGoSi/input_sesi_menit'), '6')

WebUI.click(findTestObject('Page_Pengaturan Sistem - SiGoSi/button_Simpan Perubahan'))

WebUI.click(findTestObject('Page_Pengaturan Sistem - SiGoSi/button_OK'))

