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

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/FAQ'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/First chevron link'))

WebUI.delay(1)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.scrollToElement(findTestObject('OCS-MOBILE /FAQ page/scroll view element'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/Dropdown button -First chevron -open- FAQ'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/Dropdown button -First chevron - close -FAQ'))

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.setViewPortSize(1000, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Theme_oR/Page_Ontario Cannabis Store  Ontari/button_Hide bar'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setViewPortSize(360, 800, FailureHandling.OPTIONAL)

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/First accordian - add'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/First accordian - Subtract'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/Second accordian- add'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/Second accordian - subtract'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/Load more1'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/Loadmore2'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/Loadmore3'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/Learn about cannabis'))

WebUI.delay(1)

WebUI.back()

WebUI.delay(1)

WebUI.setViewPortSize(1000, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Theme_oR/Page_Ontario Cannabis Store  Ontari/button_Hide bar'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setViewPortSize(360, 800, FailureHandling.OPTIONAL)

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/Loadmore4'))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setViewPortSize(1000, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Theme_oR/Page_Ontario Cannabis Store  Ontari/button_Hide bar'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setViewPortSize(360, 800, FailureHandling.OPTIONAL)

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/Learn about OCS'))

WebUI.back()

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setViewPortSize(1000, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Theme_oR/Page_Ontario Cannabis Store  Ontari/button_Hide bar'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setViewPortSize(360, 800, FailureHandling.OPTIONAL)

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/Choose cannabis products'))

WebUI.back()

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'))

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/FAQ'))

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/Second chveron link'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('OCS-MOBILE /FAQ page/scroll view element'), 0)

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/Dropdown button -second chevron -open- FAQ'))

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/Dropdown button -second chevron -close - FAQ'))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setViewPortSize(1000, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Theme_oR/Page_Ontario Cannabis Store  Ontari/button_Hide bar'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setViewPortSize(360, 800, FailureHandling.OPTIONAL)

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/First accordian - add'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/First accordian - Subtract'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/Second accordian- add'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/Second accordian - subtract'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/Load more1'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/Loadmore2'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/Loadmore3'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/Learn about cannabis'))

WebUI.delay(1)

WebUI.back()

WebUI.delay(1)

WebUI.setViewPortSize(1000, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Theme_oR/Page_Ontario Cannabis Store  Ontari/button_Hide bar'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setViewPortSize(360, 800, FailureHandling.OPTIONAL)

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/Loadmore4'))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setViewPortSize(1000, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Theme_oR/Page_Ontario Cannabis Store  Ontari/button_Hide bar'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setViewPortSize(360, 800, FailureHandling.OPTIONAL)

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/Learn about OCS'))

WebUI.back()

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setViewPortSize(1000, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Theme_oR/Page_Ontario Cannabis Store  Ontari/button_Hide bar'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setViewPortSize(360, 800, FailureHandling.OPTIONAL)

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/Choose cannabis products'))

WebUI.back()

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/FAQ'))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/third chevron link'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('OCS-MOBILE /FAQ page/scroll view element'), 0)

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/Dropdown button -First chevron -open- FAQ'))

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/Dropdown button -First chevron - close -FAQ'))

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.setViewPortSize(1000, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Theme_oR/Page_Ontario Cannabis Store  Ontari/button_Hide bar'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setViewPortSize(360, 800, FailureHandling.OPTIONAL)

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/First accordian - add'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/First accordian - Subtract'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/Second accordian- add'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/Second accordian - subtract'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/Load more1'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/Loadmore2'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/Loadmore3'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/Learn about cannabis'))

WebUI.delay(1)

WebUI.back()

WebUI.delay(1)

WebUI.setViewPortSize(1000, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Theme_oR/Page_Ontario Cannabis Store  Ontari/button_Hide bar'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setViewPortSize(360, 800, FailureHandling.OPTIONAL)

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/Loadmore4'))

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setViewPortSize(1000, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Theme_oR/Page_Ontario Cannabis Store  Ontari/button_Hide bar'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setViewPortSize(360, 800, FailureHandling.OPTIONAL)

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/Learn about OCS'))

WebUI.back()

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setViewPortSize(1000, 800, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Theme_oR/Page_Ontario Cannabis Store  Ontari/button_Hide bar'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.setViewPortSize(360, 800, FailureHandling.OPTIONAL)

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-MOBILE /FAQ page/Choose cannabis products'))

not_run: WebUI.back()

not_run: WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'))

not_run: WebUI.delay(1, FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('OCS-MOBILE /FAQ page/FAQ'))

not_run: WebUI.delay(1, FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('OCS-MOBILE /FAQ page/See all FAQs'))

not_run: WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

