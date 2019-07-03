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
import org.openqa.selenium.Keys as Keys

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

WebUI.click(findTestObject('OCS-MOBILE /Product page/Swatch_1g'))

not_run: WebUI.scrollToElement(findTestObject('OCS-MOBILE /Product page/Swatch_1g'), 1)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Quantity Increase - Button'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Quantity Increase - Button'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Quantity Increase - Button'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Quantity Increase - Button'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Quantity Increase - Button'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Add to Bag-button'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Home - page/Cart icon -bag'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/Checkbox_I confirm that'))

WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/Checkbox_Accept the Terms Condition'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/Checkout - Button'))

WebUI.delay(2)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.scrollToElement(findTestObject('OCS-MOBILE /Customer info page/Return to Cart - Link'), 1)

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Customer info page/Return to Cart - Link'))

WebUI.delay(1)

String a = WebUI.getText(findTestObject('OCS-MOBILE /Cart page/Unit price - product - price in cart page'))

WebUI.comment(a)

WebUI.click(findTestObject('OCS-MOBILE /Cart page/Quantity Input field'))

WebUI.sendKeys(findTestObject('OCS-MOBILE /Cart page/Quantity Input field'), Keys.chord(Keys.CLEAR))

WebUI.delay(2)

WebUI.setText(findTestObject('OCS-MOBILE /Cart page/Quantity Input field'), '10')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('OCS-MOBILE /Cart page/Quantity Input field'), Keys.chord(Keys.CLEAR))

not_run: WebUI.click(findTestObject('OCS-MOBILE /Cart page/enter quantity'))

WebUI.delay(2)

WebUI.setText(findTestObject('OCS-MOBILE /Cart page/Quantity Input field'), '7')

WebUI.delay(2)

not_run: WebUI.click(findTestObject('OCS-MOBILE /Cart page/Unit price - product'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Cart page/Qty Decrease icon'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Cart page/Qty Decrease icon'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Cart page/Qty Decrease icon'))

WebUI.delay(2)

String b = WebUI.getText(findTestObject('OCS-MOBILE /Cart page/Unit price - product - price in cart page'))

WebUI.comment(b)

WebUI.verifyNotEqual('a', 'b')

WebUI.comment(' price changed . Quantity selector is working')

