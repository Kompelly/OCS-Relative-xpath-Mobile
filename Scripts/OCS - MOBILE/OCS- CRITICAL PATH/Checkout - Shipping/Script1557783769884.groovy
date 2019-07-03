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

WebUI.refresh()

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Chevron_Cannabis'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Dried Flower_Plus icon'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Indica Dominant_Menu item'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Collection page/Product image - 1st one'))

WebUI.delay(1)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(3)

WebUI.navigateToUrl('https://ocs.ca/products/dream-weaver')

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

not_run: WebUI.scrollToElement(findTestObject('OCS-MOBILE /Product page/Product image'), 1)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Swatch_3.5g'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Add to Bag-button'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Home - page/Cart icon -bag'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/Checkbox_I confirm that'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/Checkbox_Accept the Terms Condition'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/Checkout - Button'))

WebUI.delay(1)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(2)

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

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Customer info page/Chevron_OrderSummary'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Shipping page/Change link'))

WebUI.delay(1)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

not_run: WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Customer info page/Continue to shipping method - Button'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Shipping page/Change link 2'))

WebUI.delay(1)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

not_run: WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Customer info page/Continue to shipping method - Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Shipping page/Return to customer info'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1)

not_run: WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Customer info page/Continue to shipping method - Button'))

WebUI.closeBrowser()

