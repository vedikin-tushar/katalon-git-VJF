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

WebUI.navigateToUrl('https://www.vrajfresh.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/img'))

WebUI.setText(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/input_Login to your account below_email'), 
    'tushar.bagul@vedikin.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/input_Login to your account below_password'), 
    'eeAC9iT4uKA=')

WebUI.click(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/button_Login'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Final VJF T/Page_vrajfresh/input_All Categories_search'), 'Kawan Flakey Paratha')

WebUI.click(findTestObject('Object Repository/Final VJF T/Page_vrajfresh/img_1'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Final VJF T/Page_vrajfresh/button_'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Final VJF T/Page_vrajfresh/button_Add (1)'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Final VJF T/Page_vrajfresh/img_1_2_3_4_5'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Final VJF T/Page_vrajfresh/button_Add (1)'))

WebUI.click(findTestObject('Object Repository/Final VJF T/Page_vrajfresh/button_Frozen_but'))

WebUI.click(findTestObject('Object Repository/Final VJF T/Page_vrajfresh/a_Roti Paratha  Naan'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Final VJF T/Page_vrajfresh/button_Add (1)'))

WebUI.setText(findTestObject('Object Repository/Final VJF T/Page_vrajfresh/input_All Categories_search'), 'Gits Gulab Jamun')

WebUI.click(findTestObject('Object Repository/Final VJF T/Page_vrajfresh/img_1'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Final VJF T/Page_vrajfresh/button_'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Final VJF T/Page_vrajfresh/button_Add_1'))

WebUI.click(findTestObject('Object Repository/Final VJF T/Page_vrajfresh/img_1_2_3_4_5_6'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Final VJF T/Page_vrajfresh/button_Add_1'))

WebUI.click(findTestObject('Object Repository/Final VJF T/Page_vrajfresh/button_Grocery_but'))

WebUI.click(findTestObject('Object Repository/Final VJF T/Page_vrajfresh/a_Instant Mix'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Final VJF T/Page_vrajfresh/button_Add_1'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/input_All Categories_search'), 'kinder joy')

WebUI.click(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/img_1'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/button_Add_1_2'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/img_1_2'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/button_'))

WebUI.click(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/a_Update Cart'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/input_All Categories_search'), 'blackberry1')

WebUI.click(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/img_1'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('New for front live/Page_vrajfresh/div_Product Out of stock'), 'Product Out of stock')

WebUI.click(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/img_1_2_3'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Front Live Test case/Page_vrajfresh/div_Product is out of stock'), 'Product is out of stock')

WebUI.setText(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/input_All Categories_search'), 'Ramdev aata')

WebUI.click(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/img_1'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('New for front live/Page_vrajfresh/div_Product Out of stock'), 'Product Out of stock')

WebUI.click(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/img_1_2_3'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Front Live Test case/Page_vrajfresh/div_Product is out of stock'), 'Product is out of stock')

WebUI.setText(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/input_All Categories_search'), 'parle - s')

WebUI.click(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/img_1'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/button_Add_1_2_3'))

WebUI.click(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/img_1_2_3'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Front Live Test case/Page_vrajfresh/div_Product is out of stock'), 'Product is out of stock')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Final 14-8/Page_vrajfresh/input_All Categories_search (1)'), 'vadilal Pista Ice cream')

WebUI.click(findTestObject('Object Repository/Final 14-8/Page_vrajfresh/img_1 (1)'))

WebUI.click(findTestObject('Object Repository/Final 14-8/Page_vrajfresh/button_Add'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Final 14-8/Page_vrajfresh/select_2.00lb - 4.003.00lb - 5.00'), 
    '3.00-5.00-4114', true)

WebUI.click(findTestObject('Object Repository/Final 14-8/Page_vrajfresh/button_Add'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/img_1_2'))

WebUI.setText(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/input_43.9_zipcode'), '07005')

WebUI.click(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/img_1_2_3_4'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/a_Proceed to checkout'))

WebUI.delay(5)

WebUI.setText(findTestObject('New final T1/Page_vrajfresh/input__street_address'), '1237 Cottonwood Lane')

WebUI.setText(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/input__apartment'), 'near 2nd street')

WebUI.setText(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/input__city'), 'Rockford')

WebUI.setText(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/input__phone'), '06159864973')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/button_Same as Shipping Address'))

WebUI.verifyElementText(findTestObject('New for front live/Page_vrajfresh/span_46.28'), '46.28')

WebUI.click(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/img_1_2'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/input_X_coupon_code'), 'qwertyuipasdfghjklzxcvbnm')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/button_Apply Coupon'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/a_Proceed to checkout'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Front Live Test case/Page_vrajfresh/span_6.28'), '6.28')

WebUI.click(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/button_10'))

WebUI.verifyElementText(findTestObject('Front Live Test case/Page_vrajfresh/span_16.28'), '16.28')

WebUI.click(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/a_Remove Tip'))

WebUI.verifyElementText(findTestObject('Front Live Test case/Page_vrajfresh/span_6.29'), '6.29')

WebUI.click(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/button_Custom Tip'))

WebUI.setText(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/input_Custom Tip_tip_amount'), '8')

WebUI.click(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/a_Add Tip'))

WebUI.verifyElementText(findTestObject('Front Live Test case/Page_vrajfresh/span_14.29'), '14.29')

WebUI.click(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/a_Remove Tip'))

WebUI.verifyElementText(findTestObject('Front Live Test case/Page_vrajfresh/span_6.29'), '6.29')

WebUI.click(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/button_5'))

WebUI.verifyElementText(findTestObject('Front Live Test case/Page_vrajfresh/span_11.29'), '11.29')

WebUI.delay(5)

WebUI.setText(findTestObject('New final T1/Page_vrajfresh/input__street_address'), '1237 Cottonwood Lane')

WebUI.setText(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/input__apartment'), 'near 2nd street')

WebUI.setText(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/input__city'), 'Rockford')

WebUI.setText(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/input__phone'), '06159864973')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/button_Same as Shipping Address'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Front Live Test case/Page_vrajfresh/input_Yes, please substitute unavailable it_302eac'))

WebUI.click(findTestObject('New for front live/Page_vrajfresh/button_Proceed to Pay'))

WebUI.delay(5)

