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

WebUI.callTestCase(findTestCase('OCS - MOBILE/CALL - PDP'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Tooltips/THC - Tooltip'))

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Tooltips/CBD - Tooltip'))

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Tooltips/Plant type - Tooltip'))

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Tooltips/Terpenes - Tooltip'))

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('OCS-MOBILE /Product page/About Product - Section'), 0)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Tooltips/THC - Tooltip - About this product'))

WebUI.delay(1)

WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Tooltips/Close - Tooltip - THC'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Tooltips/CBD - Tooltip - About this product'))

WebUI.delay(1)

WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Tooltips/Close - Tooltip - CBD'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Tooltips/Plant type - Tooltip - About this product'))

WebUI.delay(1)

WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Tooltips/Close - Tooltip - Plant'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Tooltips/Terpenes - Tooltip - About this product'))

WebUI.delay(1)

WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Tooltips/Close - Tooltip - Terepenes'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Tooltips/GTIN - Tooltip - About this product'))

WebUI.delay(1)

WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Tooltips/Close - Tooltip - GTIN'))

WebUI.delay(1)
