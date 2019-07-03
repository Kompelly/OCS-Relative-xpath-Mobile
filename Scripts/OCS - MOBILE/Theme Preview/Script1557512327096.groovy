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

WebUI.navigateToUrl('https://ocs.ca/?fts=0#/verify-age')

WebUI.delay(1)

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.click(findTestObject('Theme_oR/Page_Ontario Cannabis Store  Ontari/button_Hide bar'))

WebUI.delay(2)

WebUI.setViewPortSize(360, 800)

WebUI.delay(1)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ocs.ca/?fts=0#/verify-age')

WebUI.setText(findTestObject('Object Repository/OCS- FRENCH/Page_Ontario Cannabis Store - Infor/input_Adresse e-mail_checkoute'), 
    'suman@gmail.com')

WebUI.setText(findTestObject('Object Repository/OCS- FRENCH/Page_Ontario Cannabis Store - Infor/input_Prnom_checkoutshipping_a'), 
    'suman')

WebUI.setText(findTestObject('Object Repository/OCS- FRENCH/Page_Ontario Cannabis Store - Infor/input_Nom_checkoutshipping_add'), 
    'test12')

WebUI.setText(findTestObject('Object Repository/OCS- FRENCH/Page_Ontario Cannabis Store - Infor/input_Adresse_checkoutshipping'), 
    'test12')

WebUI.setText(findTestObject('Object Repository/OCS- FRENCH/Page_Ontario Cannabis Store - Infor/input_Appartement suite etc. ('), 
    '12')

WebUI.setText(findTestObject('Object Repository/OCS- FRENCH/Page_Ontario Cannabis Store - Infor/input_Ville_checkoutshipping_a'), 
    'montreal')

WebUI.setText(findTestObject('Object Repository/OCS- FRENCH/Page_Ontario Cannabis Store - Infor/input_Code postal_checkoutship'), 
    'n0r1k0')

WebUI.setText(findTestObject('Object Repository/OCS- FRENCH/Page_Ontario Cannabis Store - Infor/input_Tlphone_checkoutshipping'), 
    '514-449-3883')

WebUI.click(findTestObject('Object Repository/OCS- FRENCH/Page_Ontario Cannabis Store - Infor/button_Continuer vers le mode'))

WebUI.click(findTestObject('Object Repository/OCS- FRENCH/Page_Ontario Cannabis Store - Livra/button_Continuer vers le moyen'))

