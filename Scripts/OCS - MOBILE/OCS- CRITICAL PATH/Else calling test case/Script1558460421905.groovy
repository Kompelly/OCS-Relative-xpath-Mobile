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

WebUI.back()

	WebUI.delay(2)

	WebUI.setViewPortSize(1000, 800, FailureHandling.OPTIONAL)

	WebUI.delay(2, FailureHandling.OPTIONAL)

	WebUI.click(findTestObject('Theme_oR/Page_Ontario Cannabis Store  Ontari/button_Hide bar'), FailureHandling.OPTIONAL)

	WebUI.delay(2, FailureHandling.OPTIONAL)

	WebUI.setViewPortSize(360, 800, FailureHandling.OPTIONAL)

	WebUI.delay(2)

	WebUI.click(findTestObject('OCS-MOBILE /Collection page/Shishkaberry'))

	WebUI.delay(2)

	WebUI.setViewPortSize(1000, 800, FailureHandling.OPTIONAL)

	WebUI.delay(2, FailureHandling.OPTIONAL)

	WebUI.click(findTestObject('Theme_oR/Page_Ontario Cannabis Store  Ontari/button_Hide bar'), FailureHandling.OPTIONAL)

	WebUI.delay(2, FailureHandling.OPTIONAL)

	WebUI.setViewPortSize(360, 800, FailureHandling.OPTIONAL)

	WebUI.delay(2)

	WebUI.click(findTestObject('OCS-MOBILE /Product page/Swatch_3.5g'))
