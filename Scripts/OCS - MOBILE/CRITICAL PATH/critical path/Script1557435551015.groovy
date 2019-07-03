import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ocs.ca/?fts=0&preview_theme_id=53373863756')

WebUI.setViewPortSize(360, 800)

WebUI.delay(4)

WebUI.selectOptionByValue(findTestObject('OCS-MOBILE/Age gate and burger menu/Date'), '12', true)

WebUI.selectOptionByValue(findTestObject('OCS-MOBILE/Age gate and burger menu/month'), '6', true)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('OCS-MOBILE/Age gate and burger menu/Year Dropdown'), '1990', true)

WebUI.click(findTestObject('OCS-MOBILE/Age gate and burger menu/button_Verify'))

WebUI.click(findTestObject('OCS-MOBILE/Age gate and burger menu/Checkbox_CONFIRM AND ACKNOWLEDGE'))

WebUI.click(findTestObject('OCS-MOBILE/Age gate and burger menu/button_CONFIRM'))

WebUI.click(findTestObject('OCS-MOBILE/Age gate and burger menu/button_Start Browsing'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE/Age gate and burger menu/Burger menu'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE/Age gate and burger menu/Chevron_Cannabis'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE/Age gate and burger menu/Dried Flower_Plus icon'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE/Age gate and burger menu/Indica Dominant_Menu item'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE/Collection page/Product image - 1st one'))

WebUI.scrollToElement(findTestObject('OCS-MOBILE/Product page/Product image'), 1)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE/Product page/Swatch_3.5g'))

WebUI.scrollToElement(findTestObject('OCS-MOBILE/Product page/Swatch_3.5g'), 1)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE/Product page/Add to Bag-button'))

WebUI.delay(1)

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.click(findTestObject('Theme_oR/Page_Ontario Cannabis Store  Ontari/button_Hide bar'))

WebUI.delay(2)

WebUI.setViewPortSize(360, 800)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE/Cart flyout/Checkbox_I confirm that'))

WebUI.click(findTestObject('OCS-MOBILE/Cart flyout/Checkbox_Accept the Terms Condition'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE/Cart flyout/Checkout - Button'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE/Customer info page/Chevron_OrderSummary'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('OCS-MOBILE/Customer info page/input_Email'), 0)

WebUI.setText(findTestObject('OCS-MOBILE/Customer info page/input_Email'), 'suman.kompelly@diffagency.com')

WebUI.setText(findTestObject('OCS-MOBILE/Customer info page/input_First name'), 'suman')

WebUI.setText(findTestObject('OCS-MOBILE/Customer info page/input_Last name'), 'kompelly')

WebUI.setText(findTestObject('OCS-MOBILE/Customer info page/input_Address'), '300 saint alxendre')

WebUI.setText(findTestObject('OCS-MOBILE/Customer info page/input_Apartment suite etc. (op'), '199')

WebUI.setText(findTestObject('OCS-MOBILE/Customer info page/input_City'), 'montreal')

WebUI.setText(findTestObject('OCS-MOBILE/Customer info page/input_Postal code'), 'n0R1K0')

WebUI.setText(findTestObject('OCS-MOBILE/Customer info page/input_Phone'), '(514) 449-3882')

WebUI.delay(1)

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.click(findTestObject('Theme_oR/Page_Ontario Cannabis Store  Ontari/button_Hide bar'))

WebUI.delay(2)

WebUI.setViewPortSize(360, 800)

WebUI.click(findTestObject('OCS-MOBILE/Customer info page/Continue to shipping method - Button'))

WebUI.delay(2)

WebUI.refresh()

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE/Shipping page/Continue to payment method - Button'))

WebUI.verifyTextPresent('Payment', false)

