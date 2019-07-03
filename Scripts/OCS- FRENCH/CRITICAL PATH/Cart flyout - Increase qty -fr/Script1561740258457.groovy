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

WebUI.callTestCase(findTestCase('OCS - MOBILE/CALL - AGE GATE'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('OCS - MOBILE/CALL- TOGGLING LANGUAGE'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Chevron_Cannabis'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Dried Flower_Plus icon'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS- FRENCH/Indica Dominant_Menu item'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('OCS- FRENCH/Product image - 1st one'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Swatch_1g'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Quantity Increase - Button'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Add to Bag-button'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Home - page/Cart icon -bag'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/Quantity increase - Product'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/Quantity increase - Product'))

WebUI.delay(2)

String a = WebUI.getText(findTestObject('OCS-MOBILE /Cart flyout/Unit price - Product'))

WebUI.comment(a)

//
String a1 = a.substring(0, a.length() - 1)

WebUI.comment('a1 = ' + a1)

String x1 = a1.substring(0, a1.length() - 1)

WebUI.comment('x1 = ' + x1)

String x2 = x1.substring(0, x1.length() - 1)

WebUI.comment('x2 = ' + x2)

String x3 = x2.substring(0, x2.length() - 1)

WebUI.comment('x3 = ' + x3)

String x6 = x3.substring(0, x3.length() - 1)

WebUI.comment('x6 = ' + x6)

WebUI.setText(findTestObject('OCS-MOBILE /Cart flyout/input_-_updates'), '3')

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/i_-_icon--plus'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/i_-_icon--plus'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/i_-_icon--plus'))

WebUI.delay(2)

String c = WebUI.getText(findTestObject('OCS-MOBILE /Cart flyout/Unit price - Product'))

WebUI.comment(c)

//
String a2 = c.substring(0, c.length() - 1)

WebUI.comment('a2 = ' + a2)

String y1 = a2.substring(0, a2.length() - 1)

WebUI.comment('y1 = ' + y1)

String y2 = y1.substring(0, y1.length() - 1)

WebUI.comment('y2 = ' + y2)

String y3 = y2.substring(0, y2.length() - 1)

WebUI.comment('y3 = ' + y3)

String y4 = y3.substring(0, y3.length() - 1)

WebUI.comment('y4 = ' + y4)

//
WebUI.verifyNotEqual('x6', 'y4')

WebUI.comment(' price changed . Quantity selector is working')

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/Checkbox_I confirm that'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/Checkbox_Accept the Terms Condition'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/Checkout - Button'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1)

WebUI.callTestCase(findTestCase('OCS - MOBILE/CALL- SHIPPING TO PAYMENT'), [:], FailureHandling.STOP_ON_FAILURE)

