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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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

boolean flag = WebUI.verifyElementPresent(findTestObject('OCS-MOBILE /Product page/Swatch_3.5g'), 0)

WebUI.comment(' flag=' + flag)

WebUI.takeScreenshot()

if (flag == true) {
    not_run: WebUI.scrollToElement(findTestObject('OCS-MOBILE /Product page/Swatch_3.5g'), 1)

    WebUI.click(findTestObject('OCS-MOBILE /Product page/Swatch_3.5g'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(2)
} else {
    WebUI.back()

    WebUI.delay(2)

    WebUI.click(findTestObject('OCS-MOBILE /Collection page/Shishkaberry'))

    WebUI.delay(2)

    WebUI.click(findTestObject('OCS-MOBILE /Product page/Swatch_3.5g'))
}

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Add to Bag-button'))

WebUI.delay(1)

not_run: WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/Back icon'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Chevron_Cannabis'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Cannabis page/Dried flower'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Indica Dominant_Menu item'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('OCS-MOBILE /Collection page/Product image - 1st one'), 1)

WebUI.delay(1)

WebUI.navigateToUrl('https://ocs.ca/products/dream-weaver')

not_run: WebUI.click(findTestObject('OCS-MOBILE /Collection page/Product image - 2nd one'))

WebUI.delay(2)

not_run: WebUI.scrollToElement(findTestObject('OCS-MOBILE /Product page/Product image'), 1)

WebUI.delay(2)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.scrollToElement(findTestObject('OCS-MOBILE /Product page/Swatch_3.5g'), 1)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Swatch_1g'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Add to Bag-button'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Home - page/Cart icon -bag'))

WebUI.delay(2)

String k = WebUI.getText(findTestObject('OCS-MOBILE /Cart flyout/Unit price - 1st Product'))

WebUI.delay(2)

String a = WebUI.getText(findTestObject('OCS-MOBILE /Cart flyout/Unit price - 2nd Product'))

WebUI.delay(2)

WebUI.comment('a=' + a)

String without = a.substring(1)

WebUI.comment('without = ' + without)

//String last = without.substring(0, without.length() - 1)
//WebUI.comment('last=' + last)
// Dollar removal code... product 2
WebUI.comment('k=' + k)

String without1 = k.substring(1)

WebUI.comment('without1 = ' + without1)

double p1

double p2

// code to convert string to int
try {
    String str = without

    WebUI.comment('str=' + str)

    p1 = Double.valueOf(str)

    WebUI.comment('p1=' + p1)
}
catch (NumberFormatException ex) {
} 

try {
    String str5 = without1

    WebUI.comment('str5=' + str5)

    p2 = Double.valueOf(str5)

    WebUI.comment('p2=' + p2)
}
catch (NumberFormatException ex) {
} 

double total = p1 + p2

WebUI.comment('total =' + total)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

String amount = WebUI.getText(findTestObject('OCS-MOBILE /Cart flyout/Sub-total Price'))

WebUI.delay(2)

WebUI.comment('amount =' + amount)

String soustotal = amount.substring(1)

WebUI.comment('soustotal= ' + soustotal)

double p

try {
    String finalprice = soustotal

    WebUI.comment('finalprice=' + finalprice)

    p = Double.valueOf(finalprice)

    WebUI.comment('p=' + p)
}
catch (NumberFormatException ex) {
} 

String finalprice = soustotal

WebUI.comment('finalprice=' + finalprice)

p = Double.valueOf(finalprice)

WebUI.comment('p=' + p)

WebUI.verifyEqual(total, p)

WebUI.comment('cart items price equal')

WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/Checkbox_I confirm that'))

WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/Checkbox_Accept the Terms Condition'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/Checkout - Button'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.scrollToElement(findTestObject('OCS-MOBILE /Customer info page/input_Email'), 0)

WebUI.setText(findTestObject('OCS-MOBILE /Customer info page/input_Email'), 'suman.kompelly@diffagency.com')

WebUI.setText(findTestObject('OCS-MOBILE /Customer info page/input_First name'), 'suman')

WebUI.setText(findTestObject('OCS-MOBILE /Customer info page/input_Last name'), 'kompelly')

WebUI.setText(findTestObject('OCS-MOBILE /Customer info page/input_Address'), '300 saint alxendre')

WebUI.setText(findTestObject('OCS-MOBILE /Customer info page/input_Apartment suite etc. (op'), '199')

WebUI.setText(findTestObject('OCS-MOBILE /Customer info page/input_City'), 'montreal')

WebUI.setText(findTestObject('OCS-MOBILE /Customer info page/input_Postal code'), 'n0R1K0')

WebUI.setText(findTestObject('OCS-MOBILE /Customer info page/input_Phone'), '(514) 449-3882')

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Customer info page/Continue to shipping method - Button'))

WebUI.delay(2)

not_run: WebUI.refresh()

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Shipping page/Continue to payment method - Button'))

WebUI.verifyTextPresent('Payment', false // Dollar removal code... product 2
    // code to convert string to int
    )

