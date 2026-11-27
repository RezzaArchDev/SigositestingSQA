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

WebUI.sendKeys(findTestObject('Page_Login Admin - SiGoSi/input_Masukkan password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Dashboard Admin - SiGoSi/a_Akun Pengguna'))

WebUI.click(findTestObject('Page_Akun Pengguna - SiGoSi/button_Tambah Akun'))

WebUI.setText(findTestObject('Page_Akun Pengguna - SiGoSi/input_Nama lengkap (wajib diisi)'), 'pak aseptian')

WebUI.setText(findTestObject('Page_Akun Pengguna - SiGoSi/input_username'), 'tatib03')

WebUI.setEncryptedText(findTestObject('Page_Akun Pengguna - SiGoSi/input_password'), '0a298FFpku2ezQmeNB8plw==')

WebUI.click(findTestObject('Page_Akun Pengguna - SiGoSi/button_Simpan'))

WebUI.click(findTestObject('Page_Akun Pengguna - SiGoSi/button_OK'))

WebUI.closeBrowser()

