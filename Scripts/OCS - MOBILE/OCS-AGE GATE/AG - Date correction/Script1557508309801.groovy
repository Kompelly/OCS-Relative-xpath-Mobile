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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ocs.ca/?fts=0&preview_theme_id=74203301708')

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.setViewPortSize(360, 800)

WebUI.delay(4)

WebUI.selectOptionByValue(findTestObject('OCS-MOBILE /Age gate and Mega menu/Date'), '12', true)

WebUI.selectOptionByValue(findTestObject('OCS-MOBILE /Age gate and Mega menu/month'), '6', true)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('OCS-MOBILE /Age gate and Mega menu/Year Dropdown'), '1990', true)

WebUI.delay(3)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and Mega menu/button_Verify'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and Mega menu/a_Correct your date of birth'))

WebUI.selectOptionByValue(findTestObject('OCS-MOBILE /Age gate and Mega menu/Date'), '1', true)

WebUI.selectOptionByValue(findTestObject('OCS-MOBILE /Age gate and Mega menu/month'), '5', true)

WebUI.selectOptionByValue(findTestObject('OCS-MOBILE /Age gate and Mega menu/Year Dropdown'), '1980', true)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and Mega menu/button_Verify'))

WebUI.closeBrowser()
