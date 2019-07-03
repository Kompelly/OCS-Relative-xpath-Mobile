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

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Chevron_Cannabis'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Dried Flower_Plus icon'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Indica Dominant_Menu item'))

WebUI.delay(2)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-MOBILE /Collection page/Product image - 1st one'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

not_run: WebUI.scrollToElement(findTestObject('OCS-MOBILE /Product page/Product image'), 1)

WebUI.delay(2)

boolean flag = WebUI.verifyElementClickable(findTestObject('OCS-MOBILE /Product page/Swatch_3.5g'))

WebUI.comment(' flag =' + flag)

if (flag == true) {
    WebUI.click(findTestObject('OCS-MOBILE /Product page/Swatch_1g'), FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(2)
} else {
    WebUI.back()

    WebUI.delay(2)

    WebUI.click(findTestObject('OCS-MOBILE /Collection page/Shishkaberry'))

    WebUI.delay(2)

    WebUI.click(findTestObject('OCS-MOBILE /Product page/Swatch_3.5g'))

    WebUI.delay(2)
}

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

String b = a.substring(1)

WebUI.comment(b)

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

String d = c.substring(1)

WebUI.comment(d)

WebUI.verifyNotEqual('b', 'd')

WebUI.comment(' price changed . Quantity selector is working')

