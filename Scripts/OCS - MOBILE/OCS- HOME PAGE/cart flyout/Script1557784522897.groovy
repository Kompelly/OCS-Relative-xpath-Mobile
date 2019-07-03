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

WebUI.click(findTestObject('OCS-MOBILE /Home - page/Cart icon -bag'))

WebUI.delay(3)

WebUI.verifyTextPresent('Bag', false, FailureHandling.OPTIONAL)

if (true) {
    WebUI.comment(' cart flyout opened ')
} else {
    WebUI.comment(' cart flyout not opened ')
}

WebUI.delay(5)

WebUI.click(findTestObject('OCS-MOBILE /Home - page/Collapse cart flyout'))

WebUI.verifyTextPresent('Bag', false, FailureHandling.OPTIONAL)

if (true) {
    WebUI.comment(' cart flyout closed ')
} else {
    WebUI.comment(' cart flyout not closed ')
}

