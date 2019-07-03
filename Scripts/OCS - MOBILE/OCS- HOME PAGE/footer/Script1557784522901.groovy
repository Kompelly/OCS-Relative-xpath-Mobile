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

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-MOBILE /Home - page/Return Policy'))

WebUI.delay(2)

WebUI.setViewPortSize(1000, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Theme_oR/Page_Ontario Cannabis Store  Ontari/button_Hide bar'), FailureHandling.OPTIONAL)

WebUI.setViewPortSize(360, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-MOBILE /Home - page/Glossary of terms'))

WebUI.delay(2)

WebUI.setViewPortSize(1000, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Theme_oR/Page_Ontario Cannabis Store  Ontari/button_Hide bar'), FailureHandling.OPTIONAL)

WebUI.setViewPortSize(360, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-MOBILE /Home - page/Product Recall'))

WebUI.delay(2)

WebUI.setViewPortSize(1000, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Theme_oR/Page_Ontario Cannabis Store  Ontari/button_Hide bar'), FailureHandling.OPTIONAL)

WebUI.setViewPortSize(360, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-MOBILE /Home - page/Government of Canada - Canna'))

WebUI.delay(2)

WebUI.setViewPortSize(1000, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Theme_oR/Page_Ontario Cannabis Store  Ontari/button_Hide bar'), FailureHandling.OPTIONAL)

WebUI.setViewPortSize(360, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-MOBILE /Home - page/Government of Ontario - Cann'))

WebUI.delay(2)

WebUI.setViewPortSize(1000, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Theme_oR/Page_Ontario Cannabis Store  Ontari/button_Hide bar'), FailureHandling.OPTIONAL)

WebUI.setViewPortSize(360, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-MOBILE /Home - page/About the OCS'))

WebUI.delay(2)

WebUI.setViewPortSize(1000, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Theme_oR/Page_Ontario Cannabis Store  Ontari/button_Hide bar'), FailureHandling.OPTIONAL)

WebUI.setViewPortSize(360, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-MOBILE /Home - page/Careers'))

WebUI.delay(2)

WebUI.setViewPortSize(1000, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Theme_oR/Page_Ontario Cannabis Store  Ontari/button_Hide bar'), FailureHandling.OPTIONAL)

WebUI.setViewPortSize(360, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

not_run: WebUI.scrollToElement(findTestObject('OCS-MOBILE /Home - page/Contact us -'), 0)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-MOBILE /Home - page/News'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.setViewPortSize(1000, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Theme_oR/Page_Ontario Cannabis Store  Ontari/button_Hide bar'), FailureHandling.OPTIONAL)

WebUI.setViewPortSize(360, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-MOBILE /Home - page/Doing Business With OCS'))

WebUI.delay(2)

WebUI.setViewPortSize(1000, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Theme_oR/Page_Ontario Cannabis Store  Ontari/button_Hide bar'), FailureHandling.OPTIONAL)

WebUI.setViewPortSize(360, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-MOBILE /Home - page/Help us improve OCS.ca'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.setViewPortSize(1000, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Theme_oR/Page_Ontario Cannabis Store  Ontari/button_Hide bar'), FailureHandling.OPTIONAL)

WebUI.setViewPortSize(360, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-MOBILE /Home - page/Terms and Conditions'))

WebUI.delay(2)

WebUI.setViewPortSize(1000, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Theme_oR/Page_Ontario Cannabis Store  Ontari/button_Hide bar'), FailureHandling.OPTIONAL)

WebUI.setViewPortSize(360, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-MOBILE /Home - page/Privacy'))

WebUI.delay(2)

WebUI.setViewPortSize(1000, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Theme_oR/Page_Ontario Cannabis Store  Ontari/button_Hide bar'), FailureHandling.OPTIONAL)

WebUI.setViewPortSize(360, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-MOBILE /Home - page/Accessibility'))

WebUI.delay(2)

WebUI.setViewPortSize(1000, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Theme_oR/Page_Ontario Cannabis Store  Ontari/button_Hide bar'), FailureHandling.OPTIONAL)

WebUI.setViewPortSize(360, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-MOBILE /Home - page/Delivery to First Nations'))

WebUI.delay(2)

WebUI.setViewPortSize(1000, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Theme_oR/Page_Ontario Cannabis Store  Ontari/button_Hide bar'), FailureHandling.OPTIONAL)

WebUI.setViewPortSize(360, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-MOBILE /Home - page/Hello OCS image'))

WebUI.delay(2)

WebUI.setViewPortSize(1000, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Theme_oR/Page_Ontario Cannabis Store  Ontari/button_Hide bar'), FailureHandling.OPTIONAL)

WebUI.setViewPortSize(360, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Home - page/twitter'))

