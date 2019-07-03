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

WebUI.scrollToElement(findTestObject('OCS-MOBILE /Product page/How to choose cannabis product - Section'), 2)

WebUI.click(findTestObject('OCS-MOBILE /Product page/How to choose cannabis product - Button'))

a = WebUI.getWindowTitle()

String b = 'Factors in Choosing Cannabis Products | Ontario Cannabis Store'

WebUI.comment('WINDOW TITLE IS: ' + a)

if (a == b) {
    WebUI.comment('TITLE IS SAME')
} else {
    WebUI.comment('TITLE IS NOT SAME')
}

WebUI.back()

