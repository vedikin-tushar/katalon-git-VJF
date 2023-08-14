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

WebUI.navigateToUrl('https://dev.thcitsolutions.com/vrajfresh/front/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/img'))

WebUI.setText(findTestObject('Object Repository/Final/Page_vrajfresh/input_Login to your account below_email'), 'tushar.bagul@vedikin.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Final/Page_vrajfresh/input_Login to your account below_password'), 
    'eeAC9iT4uKA=')

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/button_Login'))

WebUI.setText(findTestObject('Object Repository/Final/Page_vrajfresh/input_All Categories_search'), 'Kawan Flakey Paratha')

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/img_1'))

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/button_Add'))

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/img_1_2'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/button_Add'))

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/button_Frozen_but'))

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/a_Roti Paratha  Naan'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/button_Add'))

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/img_1_2_3'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Object Repository/Final/Page_vrajfresh/button_More Options'), 0)

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/button_More Options'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/button_Add'))

WebUI.setText(findTestObject('Object Repository/Final/Page_vrajfresh/input_All Categories_search'), 'Gits Gulab Jamun')

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/img_1'))

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/button_Add_1'))

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/img_1_2_3_4'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/button_Add_1'))

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/img_1_2_3'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/img_1_2_3_4_5'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/button_Add_1'))

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/button_Grocery_but'))

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/a_Instant Mix'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/button_Add_1'))

WebUI.setText(findTestObject('Object Repository/Final/Page_vrajfresh/input_All Categories_search'), 'Kinder Joy')

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/img_1'))

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/button_Add_1_2'))

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/img_1_2_3_4_5_6'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/button_'))

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/a_Update Cart'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Final/Page_vrajfresh/input_All Categories_search'), 'blackberry1')

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/img_1'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Object Repository/Final/Page_vrajfresh/div_Product Out of stock'), 'Product Out of stock')

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/h4_blackberry1'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('Object Repository/Final/Page_vrajfresh/div_Product is out of stock'))

WebUI.setText(findTestObject('Object Repository/Final/Page_vrajfresh/input_All Categories_search'), 'Ramdev aata')

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/img_1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Final/Page_vrajfresh/div_Product Out of stock'))

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/h4_Ramdev aata'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('Object Repository/Final/Page_vrajfresh/div_Product is out of stock'))

WebUI.setText(findTestObject('Object Repository/Final/Page_vrajfresh/input_All Categories_search'), 'Parle - s')

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/img_1'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/button_Add_1_2_3'))

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/img_1_2_3_4_5_6_7'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('Object Repository/Final/Page_vrajfresh/div_Product is out of stock'))

WebUI.setText(findTestObject('Object Repository/Final/Page_vrajfresh/input_All Categories_search'), 'vadilal Pista Ice cream')

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/img_1'))

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/button_Add_1_2_3_4'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Final/Page_vrajfresh/select_2.00lb - 4.003.00lb - 5.00'), '3.00-5.00-3495', 
    true)

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/button_Add_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/img_1_2_3_4_5_6'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Final/Page_vrajfresh/input_43.9_zipcode'), '07005')

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/img_1_2_3_4_5_6_7_8'))

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/a_Proceed to checkout'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Final/Page_vrajfresh/span_46.28'), '46.28')

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/img_1_2_3_4_5_6'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Final/Page_vrajfresh/input_X_coupon_code'), 'qwertyuipasdfghjklzxcvbnm')

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/button_Apply Coupon'))

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/a_Proceed to checkout'))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Final/Page_vrajfresh/span_26.28'), '26.28')

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/button_10'))

WebUI.verifyElementText(findTestObject('Final/Page_vrajfresh/span_36.28'), '36.28')

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/a_Remove Tip'))

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/button_Custom Tip'))

WebUI.setText(findTestObject('Object Repository/Final/Page_vrajfresh/input_Custom Tip_tip_amount'), '8')

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/a_Add Tip'))

WebUI.verifyElementText(findTestObject('Final/Page_vrajfresh/span_34.30'), '34.30')

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/a_Remove Tip'))

WebUI.verifyElementText(findTestObject('Final/Page_vrajfresh/span_26.30'), '26.30')

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/button_10'))

WebUI.verifyElementText(findTestObject('Final/Page_vrajfresh/span_36.30'), '36.30')

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/input_Yes, please substitute unavailable it_302eac'))

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/button_Proceed to Pay'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Final/Page_vrajfresh/input_Order Amount          36.3_cvc'), '123')

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/button_Submit Payment'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Final/Page_vrajfresh/strong_Thank you for your purchase'), 'THANK YOU FOR YOUR PURCHASE!', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/a_Continue Shopping'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/img'))

WebUI.click(findTestObject('Object Repository/Final/Page_vrajfresh/a_Logout'))

WebUI.closeBrowser()

