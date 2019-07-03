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

WebUI.callTestCase(findTestCase('OCS - MOBILE/CALL- SWATCH- NO INVENTORY'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

not_run: WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('OCS-MOBILE /Cannabis page/Cannabis chevron'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('OCS-MOBILE /Cannabis page/Dried flower - plus accordian'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('OCS-MOBILE /Cannabis page/Dried flower - Indica dominant'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('OCS-MOBILE /Collection page/Product image - 1st one'))

not_run: WebUI.scrollToElement(findTestObject('OCS-MOBILE /Product page/Product image'), 1)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Swatch_1g'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('OCS-MOBILE /Product page/Swatch_3.5g'), 1)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Product page/Add to Bag-button'))

WebUI.delay(4)

not_run: WebUI.click(findTestObject('OCS-MOBILE /Home - page/Cart icon -bag'))

WebUI.delay(4, FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/Back icon'))

WebUI.delay(2)

boolean flag = WebUI.verifyElementPresent(findTestObject('OCS-MOBILE /Product page/Swatch_3.5g'), 0)

WebUI.comment(' flag=' + flag)

WebUI.takeScreenshot()

if (flag == true) {
    WebUI.delay(2)

    WebUI.click(findTestObject('OCS-MOBILE /Product page/Swatch_3.5g'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(2)

    WebUI.click(findTestObject('OCS-MOBILE /Product page/Add to Bag-button'))

    WebUI.delay(3)

    WebUI.click(findTestObject('OCS-MOBILE /Home - page/Cart icon -bag'))

    WebUI.delay(2)

    WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/Checkbox_I confirm that'))

    WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/Checkbox_Accept the Terms Condition'))

    WebUI.delay(2)

    WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/Checkout - Button'))

    WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
        [])

    WebUI.delay(2)

    WebUI.scrollToElement(findTestObject('OCS-MOBILE /Customer info page/Return to Cart - Link'), 1)

    WebUI.delay(2)

    WebUI.setViewPortSize(1000, 800, FailureHandling.OPTIONAL)

    WebUI.delay(2, FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Theme_oR/Page_Ontario Cannabis Store  Ontari/button_Hide bar'), FailureHandling.OPTIONAL)

    WebUI.delay(2, FailureHandling.OPTIONAL)

    WebUI.setViewPortSize(360, 800, FailureHandling.OPTIONAL)

    WebUI.delay(1)

    WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
        [])

    WebUI.click(findTestObject('OCS-MOBILE /Customer info page/Return to Cart - Link'))

    WebUI.delay(2)

    WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
        [])

    WebUI.delay(2)

    WebUI.setViewPortSize(1000, 800, FailureHandling.OPTIONAL)

    WebUI.delay(2, FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Theme_oR/Page_Ontario Cannabis Store  Ontari/button_Hide bar'), FailureHandling.OPTIONAL)

    WebUI.delay(2, FailureHandling.OPTIONAL)

    WebUI.setViewPortSize(360, 800, FailureHandling.OPTIONAL)

    WebUI.delay(1, FailureHandling.OPTIONAL)

    String a = WebUI.getText(findTestObject('OCS-MOBILE /Cart page/Unit price - 1st product'))

    WebUI.comment(a)

    String a1 = a.substring(1)

    WebUI.comment('a1 = ' + a1)

    WebUI.delay(2)

    String b = WebUI.getText(findTestObject('OCS-MOBILE /Cart page/Unit price - 2nd product'))

    WebUI.comment(b)

    String a2 = b.substring(1)

    WebUI.comment('a2 = ' + a2)

    String c = WebUI.getText(findTestObject('OCS-MOBILE /Cart page/Sub-total'))

    WebUI.comment(c)

    String a3 = c.substring(1)

    WebUI.comment('a3 = ' + a3)

    double p2

    double p3

    try {
        String x1 = a1

        WebUI.comment('x1=' + x1)

        p2 = Double.valueOf(x1)

        WebUI.comment('p2=' + p2)
    }
    catch (NumberFormatException ex) {
    } 
    
    try {
        String x2 = a2

        WebUI.comment('x2=' + x2)

        p3 = Double.valueOf(x2)

        WebUI.comment('p3=' + p3)
    }
    catch (NumberFormatException ex) {
    } 
    
    WebUI.comment('p2=' + p2)

    WebUI.comment('p3=' + p3)

    double total = p2 + p3

    WebUI.comment('total=' + total)

    WebUI.verifyEqual(total, a3)

    WebUI.delay(2)

    WebUI.click(findTestObject('OCS-MOBILE /Cart page/Remove icon - 1st Product'))

    WebUI.delay(2)

    String c23 = WebUI.getText(findTestObject('OCS-MOBILE /Cart page/Sub-total'))

    WebUI.comment(c23)

    String a4 = c23.substring(1)

    WebUI.comment('a4= ' + a4)

    String b25 = WebUI.getText(findTestObject('OCS-MOBILE /Cart page/Unit price - 1st product'))

    WebUI.comment(b25)

    String a25 = b25.substring(1)

    WebUI.comment('a25 = ' + a25)

    WebUI.verifyEqual(a4, a25)
} else {
    WebUI.back()

    WebUI.delay(2)

    WebUI.click(findTestObject('OCS-MOBILE /Collection page/Shishkaberry'))

    WebUI.delay(2)

    WebUI.click(findTestObject('OCS-MOBILE /Product page/Swatch_3.5g'))

    WebUI.click(findTestObject('OCS-MOBILE /Product page/Add to Bag-button'))

    WebUI.delay(2)

    WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/Checkbox_I confirm that'))

    WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/Checkbox_Accept the Terms Condition'))

    WebUI.delay(2)

    WebUI.click(findTestObject('OCS-MOBILE /Cart flyout/Checkout - Button'))

    WebUI.delay(2)

    WebUI.scrollToElement(findTestObject('OCS-MOBILE /Customer info page/Return to Cart - Link'), 1)

    WebUI.delay(1)

    WebUI.click(findTestObject('OCS-MOBILE /Customer info page/Return to Cart - Link'))

    WebUI.delay(2)

    WebUI.setViewPortSize(1000, 800, FailureHandling.OPTIONAL)

    WebUI.delay(2, FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Theme_oR/Page_Ontario Cannabis Store  Ontari/button_Hide bar'), FailureHandling.OPTIONAL)

    WebUI.delay(2, FailureHandling.OPTIONAL)

    WebUI.setViewPortSize(360, 800, FailureHandling.OPTIONAL)

    WebUI.delay(1, FailureHandling.OPTIONAL)

    String a = WebUI.getText(findTestObject('OCS-MOBILE /Cart page/Unit price - 1st product'))

    WebUI.comment(a)

    String a1 = a.substring(1)

    WebUI.comment('a1 = ' + a1)

    WebUI.delay(2)

    String b = WebUI.getText(findTestObject('OCS-MOBILE /Cart page/Unit price - 2nd product'))

    WebUI.comment(b)

    String a2 = b.substring(1)

    WebUI.comment('a2 = ' + a2)

    String c = WebUI.getText(findTestObject('OCS-MOBILE /Cart page/Sub-total'))

    WebUI.comment(c)

    String a3 = c.substring(1)

    WebUI.comment('a3 = ' + a3)

    double p2

    double p3

    try {
        String x1 = a1

        WebUI.comment('x1=' + x1)

        p2 = Double.valueOf(x1)

        WebUI.comment('p2=' + p2)
    }
    catch (NumberFormatException ex) {
    } 
    
    try {
        String x2 = a2

        WebUI.comment('x2=' + x2)

        p3 = Double.valueOf(x2)

        WebUI.comment('p3=' + p3)
    }
    catch (NumberFormatException ex) {
    } 
    
    WebUI.comment('p2=' + p2)

    WebUI.comment('p3=' + p3)

    double total = p2 + p3

    WebUI.comment('total=' + total)

    WebUI.verifyEqual(total, a3)

    WebUI.click(findTestObject('OCS-MOBILE /Cart page/Remove icon - 1st Product'))

    WebUI.delay(2)

    String c23 = WebUI.getText(findTestObject('OCS-MOBILE /Cart page/Sub-total'))

    WebUI.comment(c23)

    String a4 = c23.substring(1)

    WebUI.comment('a4= ' + a4)

    String b25 = WebUI.getText(findTestObject('OCS-MOBILE /Cart page/Unit price - 1st product'))

    WebUI.comment(b25)

    String a25 = b25.substring(1)

    WebUI.comment('a25 = ' + a25)

    WebUI.delay(2)

    boolean flag2 = WebUI.verifyEqual(a4, a25)

    WebUI.comment('flag2 =' + flag2)

    if (flag2 == true) {
        WebUI.comment(' both prices are  equal')
    }
}

