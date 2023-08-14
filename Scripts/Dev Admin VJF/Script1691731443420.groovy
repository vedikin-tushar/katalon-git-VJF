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

WebUI.navigateToUrl('https://dev.thcitsolutions.com/vrajfresh/admin/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/For Admin/Page_Admin/input_Login as a Admin User_login_view'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/For Admin/Page_Admin/input_Login as a Admin User_password'), '6oMmwZZA07MyRRYyQOVcuQ==')

WebUI.click(findTestObject('Object Repository/For Admin/Page_Admin/button_Sign In'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/For Admin/Page_VrajFresh Admin/i_My Dashboard_fa fa-shopping-cart'))

WebUI.click(findTestObject('Object Repository/For Admin/Page_VrajFresh Admin/a_My Orders'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/New admin VJF/Page_VrajFresh Admin/a_Order Status_2223'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/For Admin/Page_VrajFresh Admin/i_Order Status_fa fa-pencil'))

WebUI.delay(10)

WebUI.verifyElementText(findTestObject('For Admin/Page_VrajFresh Admin/span_36.30'), '$ 36.28', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/For Admin/Page_VrajFresh Admin/span_36.30'))

WebUI.verifyElementText(findTestObject('For Admin/Page_VrajFresh Admin/label_36.30'), '$ 36.28')

WebUI.click(findTestObject('Object Repository/For Admin/Page_VrajFresh Admin/label_36.30'))

WebUI.verifyElementVisible(findTestObject('For Admin/Page_VrajFresh Admin/input_Tip Amount_order_tip'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/For Admin/Page_VrajFresh Admin/input_Tip Amount_order_tip'))

WebUI.verifyElementVisible(findTestObject('For Admin/Page_VrajFresh Admin/input_Order Discount_discount_amount'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/For Admin/Page_VrajFresh Admin/input_Order Discount_discount_amount'))

WebUI.verifyElementText(findTestObject('For Admin/Page_VrajFresh Admin/td_36.30'), '36.30')

WebUI.click(findTestObject('Object Repository/For Admin/Page_VrajFresh Admin/td_36.30'))

WebUI.setText(findTestObject('Object Repository/For Admin/Page_VrajFresh Admin/input_Kinder Joy (20g  0.7Oz)_qty3620'), 
    '1')

WebUI.click(findTestObject('Object Repository/For Admin/Page_VrajFresh Admin/button_Update Order'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/For Admin/Page_VrajFresh Admin/i_Order Status_fa fa-pencil'))

WebUI.verifyElementText(findTestObject('For Admin/Page_VrajFresh Admin/span_33.29'), '33.29')

WebUI.click(findTestObject('Object Repository/For Admin/Page_VrajFresh Admin/span_33.29'))

WebUI.verifyElementText(findTestObject('For Admin/Page_VrajFresh Admin/label_33.29'), '$ 33.29')

WebUI.click(findTestObject('Object Repository/For Admin/Page_VrajFresh Admin/label_33.29'))

WebUI.verifyElementVisible(findTestObject('For Admin/Page_VrajFresh Admin/input_Tip Amount_order_tip'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/For Admin/Page_VrajFresh Admin/input_Tip Amount_order_tip'))

WebUI.verifyElementVisible(findTestObject('For Admin/Page_VrajFresh Admin/input_Order Discount_discount_amount'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/For Admin/Page_VrajFresh Admin/input_Order Discount_discount_amount'))

WebUI.click(findTestObject('Object Repository/For Admin/Page_VrajFresh Admin/button_Update Order'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/For Admin/Page_VrajFresh Admin/i_Order Status_fa fa-pencil'))

WebUI.click(findTestObject('Object Repository/For add new one/Page_VrajFresh Admin/img'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/For add new one/Page_VrajFresh Admin/span_Select'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/For add new one/Page_VrajFresh Admin/input_Sa_select2-search__field'), 'parle - s - 3 gms')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Object Repository/For add new one/Page_VrajFresh Admin/input_Sa_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/For add new one/Page_VrajFresh Admin/button_Update Order'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/For Admin/Page_VrajFresh Admin/i_Order Status_fa fa-pencil'))

WebUI.verifyElementText(findTestObject('For Admin/Page_VrajFresh Admin/span_38.29'), '38.29')

WebUI.click(findTestObject('Object Repository/For Admin/Page_VrajFresh Admin/span_38.29'))

WebUI.verifyElementText(findTestObject('For Admin/Page_VrajFresh Admin/label_38.29'), '$ 38.29')

WebUI.click(findTestObject('Object Repository/For Admin/Page_VrajFresh Admin/label_38.29'))

WebUI.click(findTestObject('Object Repository/For Admin/Page_VrajFresh Admin/button_Capture Payment'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/New admin VJF/Page_VrajFresh Admin/a_Order Status_2223'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('For Admin/Page_VrajFresh Admin/td_38.29'), '38.29')

WebUI.click(findTestObject('Object Repository/For Admin/Page_VrajFresh Admin/td_38.29'))

WebUI.click(findTestObject('Object Repository/For Admin/Page_VrajFresh Admin/i_Order Status_fa fa-download'))

WebUI.switchToWindowTitle('')

WebUI.verifyElementText(findTestObject('For Admin/Page_VrajFresh Admin/td_38.29'), '38.29')

WebUI.click(findTestObject('Object Repository/For Admin/Page_/td_38.29'))

