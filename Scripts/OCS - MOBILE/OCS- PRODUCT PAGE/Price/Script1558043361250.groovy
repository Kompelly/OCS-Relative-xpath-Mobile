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

not_run: WebUI.navigateToUrl('https://ocs.ca/?fts=0&preview_theme_id=53373863756')

WebUI.delay(2)

not_run: WebUI.scrollToElement(findTestObject('OCS-MOBILE /Product page/Product image'), 1)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Swatch_1g'))

WebUI.delay(2)

String a = WebUI.getText(findTestObject('OCS-MOBILE /Product page/Price/1g Price - Swatch'))

WebUI.comment('a =' + a)

WebUI.delay(1, FailureHandling.OPTIONAL)

boolean flag = WebUI.verifyElementPresent(findTestObject('OCS-MOBILE /Product page/Price/Price - Add to cart button'), 0, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('flag =' + flag)

if (flag == true) {
    String b = WebUI.getText(findTestObject('OCS-MOBILE /Product page/Price/Price - Add to cart button'))

    WebUI.comment('a =' + a)

    String a1 = a.substring(1)

    WebUI.comment('a1=' + a1)

    WebUI.comment('b =' + b)

    String b1 = a.substring(1)

    WebUI.comment('b1 =' + b1)

    WebUI.verifyEqual(a1, b1)

    WebUI.click(findTestObject('OCS-MOBILE /Product page/Swatch_3.5g'))

    String c = WebUI.getText(findTestObject('OCS-MOBILE /Product page/Price/3.5g Price - Swatch'), FailureHandling.STOP_ON_FAILURE)

    WebUI.comment('c =' + c)

    String c1 = c.substring(1)

    WebUI.comment('c1 =' + c1)

    String d = WebUI.getText(findTestObject('OCS-MOBILE /Product page/Price/Price - Add to cart button'))

    WebUI.comment('d =' + d)

    String d1 = d.substring(1)

    WebUI.comment('d1 =' + d1)

    WebUI.verifyEqual(c1, d1)
} else {
    WebUI.back()

    WebUI.delay(1, FailureHandling.OPTIONAL)

    not_run: WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
        [])

    WebUI.click(findTestObject('OCS-MOBILE /Collection page/Product image - 2nd one'))

    not_run: WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
        [])

    WebUI.delay(1, FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('OCS-MOBILE /Product page/Swatch_1g'))

    WebUI.delay(2)

    String p1 = WebUI.getText(findTestObject('OCS-MOBILE /Product page/Price/1g Price - Swatch'))

    WebUI.comment('p1 =' + p1)

    WebUI.delay(1, FailureHandling.OPTIONAL)

    boolean flag1 = WebUI.verifyElementPresent(findTestObject('OCS-MOBILE /Product page/Price/Price - Add to cart button'), 
        0, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.comment('flag1 =' + flag1)

    if (flag1 == true) {
        String b = WebUI.getText(findTestObject('OCS-MOBILE /Product page/Price/Price - Add to cart button'))

        WebUI.comment('p1 =' + p1)

        String a1 = p1.substring(1)

        WebUI.comment('a1=' + a1)

        WebUI.comment('b =' + b)

        String b1 = b.substring(1)

        WebUI.comment('b1 =' + b1)

        WebUI.verifyEqual(a1, b1)

        WebUI.click(findTestObject('OCS-MOBILE /Product page/Swatch_3.5g'))

        String c = WebUI.getText(findTestObject('OCS-MOBILE /Product page/Price/3.5g Price - Swatch'), FailureHandling.STOP_ON_FAILURE)

        WebUI.comment('c =' + c)

        String c1 = c.substring(1)

        WebUI.comment('c1 =' + c1)

        String d = WebUI.getText(findTestObject('OCS-MOBILE /Product page/Price/Price - Add to cart button'))

        WebUI.comment('d =' + d)

        String d1 = d.substring(1)

        WebUI.comment('d1 =' + d1)

        WebUI.delay(4)

        WebUI.verifyEqual(c1, d1)
    } else {
        WebUI.back()

        not_run: WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
            [])

        WebUI.delay(1, FailureHandling.OPTIONAL)

        WebUI.navigateToUrl('https://ocs.ca/products/dream-weaver')

        not_run: WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
            [])

        WebUI.delay(1, FailureHandling.OPTIONAL)

        WebUI.click(findTestObject('OCS-MOBILE /Product page/Swatch_1g'))

        WebUI.delay(2)

        String p2 = WebUI.getText(findTestObject('OCS-MOBILE /Product page/Price/1g Price - Swatch'))

        WebUI.comment('p2 =' + p2)

        String a1 = p2.substring(1)

        WebUI.comment('a1 =' + a1)

        String b2 = WebUI.getText(findTestObject('OCS-MOBILE /Product page/Price/Price - Add to cart button'))

        WebUI.comment('b2 =' + b2)

        String b1 = b2.substring(1)

        WebUI.comment('b1 =' + b1)

        WebUI.verifyEqual(a1, b1)

        WebUI.click(findTestObject('OCS-MOBILE /Product page/Swatch_3.5g'))

        WebUI.delay(1, FailureHandling.OPTIONAL)

        String c = WebUI.getText(findTestObject('OCS-MOBILE /Product page/Price/3.5g Price - Swatch'), FailureHandling.STOP_ON_FAILURE)

        WebUI.comment('c =' + c)

        String c1 = c.substring(1)

        WebUI.comment('c1 =' + c1)

        String d = WebUI.getText(findTestObject('OCS-MOBILE /Product page/Price/Price - Add to cart button'))

        WebUI.comment('d =' + d)

        String d1 = d.substring(1)

        WebUI.comment('d1 =' + d1)

        WebUI.delay(4)

        WebUI.verifyEqual(c1, d1)

        WebUI.delay(1, FailureHandling.OPTIONAL)
    }
}

