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

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(2)

not_run: WebUI.refresh()

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/English dropdown'))

WebUI.delay(2)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/Select French'))

WebUI.delay(5)

String a = WebUI.getWindowTitle()

WebUI.comment('a = ' + a)

String b = 'Magasin de Cannabis de l\'Ontario | Ontario Cannabis Store'

WebUI.delay(2)

//boolean flag = WebUI.verifyTextPresent('Découvrez nos solutions de rangement pour votre cannabis', false, FailureHandling.CONTINUE_ON_FAILURE)
boolean flag1 = WebUI.verifyMatch(a, b, false)

WebUI.comment('flag = ' + flag1)

if (flag1 == true) {
    WebUI.comment('translated  to french')
} else {
    WebUI.comment(' French translation failed  ')
}

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - French'))

WebUI.delay(2)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/French dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/Select English'))

WebUI.delay(5)

String c = WebUI.getWindowTitle()

WebUI.comment('c =' + c)

String d = 'Ontario Cannabis Store | Ontario Cannabis Store'

WebUI.comment('d =' + d)

//WebUI.verifyTextPresent('Discover our storage solutions for your cannabis', false, FailureHandling.CONTINUE_ON_FAILURE)
boolean flag = WebUI.verifyMatch(c, d, false)

WebUI.comment(' flag = ' + flag)

if (flag == true) {
    WebUI.comment(' Language changing is successful')
} else {
    WebUI.comment(' error in the langauge changing ')
}

