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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('OCS - MOBILE/CALL - PDP'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.scrollToElement(findTestObject('OCS-MOBILE /Product page/Product image'), 1)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Learn More - Link'))

WebUI.delay(1)

not_run: WebUI.scrollToElement(findTestObject('OCS-MOBILE /Product page/Last raw of the table'), 0)

WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Product page/More items to consider section/1st Product - image - Grinder'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.back()

WebUI.click(findTestObject('OCS-MOBILE /Product page/More items to consider section/Vaporizers - Tab'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Product page/More items to consider section/1st Product - image - Vaporizer'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.back()

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OCS-MOBILE /Product page/More items to consider section/Papers Filters - Tab'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Product page/More items to consider section/1st Product - image - Paper Filter'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.back()

WebUI.delay(2)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-MOBILE /Product page/More items to consider section/Bongs Pipes - Tab'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Product page/More items to consider section/1st Product - image - Bongs Pipes'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.back()

