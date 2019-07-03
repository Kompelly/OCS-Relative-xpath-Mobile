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

WebUI.callTestCase(findTestCase('OCS - MOBILE/CALL- TOGGLING LANGUAGE'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Chevron_Cannabis'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Dried Flower_Plus icon'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS- FRENCH/Indica Dominant_Menu item'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('OCS- FRENCH/Product image - 1st one'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Swatch_1g'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Quantity Increase - Button'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Add to Bag-button'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Home - page/Cart icon -bag'))

WebUI.delay(2)

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/Checkbox_I confirm that'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/Checkbox_Accept the Terms Condition'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/Checkout - Button'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Customer info page/Chevron_OrderSummary'))

WebUI.delay(2)

WebUI.delay(2)

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('OCS-MOBILE /Customer info page/Return to Cart - Link'), 1)

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Customer info page/Return to Cart - Link'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Cart page/cart page-Checkbox_I confirm that'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Cart page/cart page - Checkbox_Accept the Terms Condition'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1)

WebUI.click(findTestObject('OCS- FRENCH/Cart page -checkout button'))

WebUI.delay(1)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.setText(findTestObject('OCS- FRENCH/Page_Ontario Cannabis Store - Infor/input_Adresse e-mail_checkoute'), 'suman@gmail.com')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/OCS- FRENCH/Page_Ontario Cannabis Store - Infor/input_Prnom_checkoutshipping_a'), 
    'suman')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/OCS- FRENCH/Page_Ontario Cannabis Store - Infor/input_Nom_checkoutshipping_add'), 
    'test12')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/OCS- FRENCH/Page_Ontario Cannabis Store - Infor/input_Adresse_checkoutshipping'), 
    'test12')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/OCS- FRENCH/Page_Ontario Cannabis Store - Infor/input_Appartement suite etc. ('), 
    '12')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/OCS- FRENCH/Page_Ontario Cannabis Store - Infor/input_Ville_checkoutshipping_a'), 
    'montreal')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/OCS- FRENCH/Page_Ontario Cannabis Store - Infor/input_Code postal_checkoutship'), 
    'n0r1k0')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/OCS- FRENCH/Page_Ontario Cannabis Store - Infor/input_Tlphone_checkoutshipping'), 
    '514-449-3883')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OCS- FRENCH/Page_Ontario Cannabis Store - Infor/button_Continuer vers le mode'))

WebUI.delay(2)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OCS- FRENCH/Page_Ontario Cannabis Store - Livra/button_Continuer vers le moyen'))

