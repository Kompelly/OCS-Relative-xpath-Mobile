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

not_run: WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Collection page/Product image - 1st one'))

not_run: WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

not_run: WebUI.click(findTestObject('Object Repository/Cart flyout-tooltips_OR/Page_Ontario Cannabis Store  Ontari/h3_Cannabis'))

not_run: WebUI.click(findTestObject('Object Repository/Cart flyout-tooltips_OR/Page_Ontario Cannabis Store  Ontari/span_Indica Dominant'))

not_run: WebUI.click(findTestObject('Object Repository/Cart flyout-tooltips_OR/Page_Indica Dominant Dried Flower/h3_Shishkaberry'))

not_run: WebUI.click(findTestObject('Object Repository/Cart flyout-tooltips_OR/Page_Shishkaberry  Ontario Cannabis/label_1g'))

not_run: WebUI.click(findTestObject('Object Repository/Cart flyout-tooltips_OR/Page_Shishkaberry  Ontario Cannabis/button_Add to Bag9.75'))

WebUI.delay(3)

not_run: WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

not_run: WebUI.scrollToElement(findTestObject('OCS-MOBILE /Product page/Product image'), 1)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Swatch_1g'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Add to Bag-button'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Home - page/Cart icon -bag'))

WebUI.delay(4)

WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/tool tip - TOP'))

WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/tool tip -DOWN'))

WebUI.takeScreenshot()

not_run: WebUI.closeBrowser()

