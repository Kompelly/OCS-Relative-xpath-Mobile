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

WebUI.click(findTestObject('OCS-MOBILE /Product page/Add to Bag-button'))

WebUI.delay(4)

not_run: WebUI.click(findTestObject('OCS-MOBILE /Home - page/Cart icon -bag'))

WebUI.delay(4, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/Back icon'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Swatch_3.5g'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Add to Bag-button'))

WebUI.delay(3)

WebUI.click(findTestObject('OCS-MOBILE /Home - page/Cart icon -bag'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/Checkbox_I confirm that'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/Checkbox_Accept the Terms Condition'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/Checkout - Button'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('OCS-MOBILE /Customer info page/Return to Cart - Link'), 1)

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Customer info page/Return to Cart - Link'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(2)

String a = WebUI.getText(findTestObject('OCS-MOBILE /Cart page/Unit price - 1st product'))

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

//
String b = WebUI.getText(findTestObject('OCS-MOBILE /Cart page/Unit price - 2nd product'))

WebUI.comment(b)

//
String a2 = b.substring(0, b.length() - 1)

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
String c = WebUI.getText(findTestObject('OCS-MOBILE /Cart page/Sub-total'))

WebUI.comment(c)

//
String a3 = c.substring(0, c.length() - 1)

WebUI.comment('a3 = ' + a3)

String z1 = a3.substring(0, a3.length() - 1)

WebUI.comment('z1 = ' + z1)

String z2 = z1.substring(0, z1.length() - 1)

WebUI.comment('z2 = ' + z2)

String z3 = z2.substring(0, z2.length() - 1)

WebUI.comment('z3 = ' + z3)

String z4 = z3.substring(0, z3.length() - 1)

WebUI.comment('z4 = ' + z4)

//
double p2

double p3

try {
    String s1 = x6

    WebUI.comment('s1=' + s1)

    p2 = Double.valueOf(s1)

    WebUI.comment('p2=' + p2)
}
catch (NumberFormatException ex) {
} 

try {
    String s2 = y4

    WebUI.comment('s2=' + s2)

    p3 = Double.valueOf(s2)

    WebUI.comment('p3=' + p3)
}
catch (NumberFormatException ex) {
} 

WebUI.comment('p2=' + p2)

WebUI.comment('p3=' + p3)

double total = p2 + p3

WebUI.comment('total=' + total)

WebUI.verifyEqual(total, z4)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Cart page/Remove icon - 1st Product'))

WebUI.delay(2)

String c23 = WebUI.getText(findTestObject('OCS-MOBILE /Cart page/Sub-total'))

WebUI.comment(c23)

//
String a4 = c23.substring(0, c23.length() - 1)

WebUI.comment('a4= ' + a4)

String v1 = a4.substring(0, a4.length() - 1)

WebUI.comment('v1= ' + v1)

String v2 = v1.substring(0, v1.length() - 1)

WebUI.comment('v2= ' + v2)

String v3 = v2.substring(0, v2.length() - 1)

WebUI.comment('v3= ' + v3)

String v7 = v3.substring(0, v3.length() - 1)

WebUI.comment('v7= ' + v7)

//
String b25 = WebUI.getText(findTestObject('OCS-MOBILE /Cart page/Unit price - 1st product'))

WebUI.comment(b25)

//
String a25 = b25.substring(0, b25.length() - 1)

WebUI.comment('a25 = ' + a25)

String v4 = a25.substring(0, a25.length() - 1)

WebUI.comment('v4= ' + v4)

String v5 = v4.substring(0, v4.length() - 1)

WebUI.comment('v5= ' + v5)

String v6 = v5.substring(0, v5.length() - 1)

WebUI.comment('v6= ' + v6)

String v8 = v6.substring(0, v6.length() - 1)

WebUI.comment('v8= ' + v8)

//
WebUI.verifyEqual(v7, v8)

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Cart page/cart page-Checkbox_I confirm that'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Cart page/cart page - Checkbox_Accept the Terms Condition'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1)

WebUI.click(findTestObject('OCS- FRENCH/Cart page -checkout button'))

WebUI.delay(1)

WebUI.callTestCase(findTestCase('OCS - MOBILE/CALL- SHIPPING TO PAYMENT'), [:], FailureHandling.STOP_ON_FAILURE)

