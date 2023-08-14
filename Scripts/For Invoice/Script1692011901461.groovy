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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.vrajfresh.com/admin/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/For Invoice Admin/Page_Admin/input_Login as a Admin User_login_view'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/For Invoice Admin/Page_Admin/input_Login as a Admin User_password'), 
    '6oMmwZZA07MyRRYyQOVcuQ==')

WebUI.click(findTestObject('Object Repository/For Invoice Admin/Page_Admin/button_Sign In'))

WebUI.click(findTestObject('Object Repository/For Invoice Admin/Page_VrajFresh Admin/i_My Dashboard_fa fa-shopping-cart'))

WebUI.click(findTestObject('Object Repository/For Invoice Admin/Page_VrajFresh Admin/a_My Orders'))

WebUI.click(findTestObject('Object Repository/For Invoice Admin/Page_VrajFresh Admin/i_Order Status_fa fa-download'))

WebUI.switchToWindowTitle('')

WebUI.verifyElementText(findTestObject('Object Repository/For Invoice Admin/Page_/td_0.4'), '$0.4')

WebUI.verifyElementText(findTestObject('Object Repository/For Invoice Admin/Page_/td_40.00'), '$ 40.00')

WebUI.verifyElementText(findTestObject('Object Repository/For Invoice Admin/Page_/td_13.29'), '$ 13.29')

