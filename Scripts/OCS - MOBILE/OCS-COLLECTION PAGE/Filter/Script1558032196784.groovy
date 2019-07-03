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

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and Mega menu/Chevron_Cannabis'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Cannabis page/Dried flower'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Cannabis page/Dried flower - Indica dominant'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Filter option'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/THC - CBD Tool tip'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/THC CBD plus accordian'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/THC - CBD Subtract accordian'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/THC CBD plus accordian'))

not_run: WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/div_18.00'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/div_25.00'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/div_14.00'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/div_19.00'))

WebUI.delay(2)

not_run: WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Learn More About THC CBD'))

WebUI.delay(4)

not_run: WebUI.callTestCase(findTestCase('OCS - MOBILE/OCS-COLLECTION PAGE/calling test case'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Filter option'))

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Plant type tooltip'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Plant type plus accordian'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Plant type subtract accordian'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Plant type plus accordian'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Indica Dominant'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Sativa Dominant'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Hybrid'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Blend'))

WebUI.delay(2)

not_run: WebUI.click(findTestObject('Object Repository/COLLECTION PAGE _OR/Filter_OR/Page_Pre-Rolled  Ontario Cannabis S/label_Sativa Dominant'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Object Repository/COLLECTION PAGE _OR/Filter_OR/Page_Pre-Rolled  Ontario Cannabis S/label_Hybrid'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Object Repository/COLLECTION PAGE _OR/Filter_OR/Page_Pre-Rolled  Ontario Cannabis S/label_Blend'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Learn More About Plant Type'))

not_run: WebUI.delay(2)

not_run: WebUI.callTestCase(findTestCase('OCS - MOBILE/OCS-COLLECTION PAGE/calling test case'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Plant type subtract accordian'))

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Filter option'), FailureHandling.OPTIONAL)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Brand tool tip'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Brand plus accordian'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Brand subtract accordian'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Brand plus accordian'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Edison'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Haven St'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Emerald'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Gage Cannabis Co'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/INDIVA'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/RIFF'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Seven Oaks'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/COLLECTION PAGE _OR/Filter_OR/Page_Pre-Rolled  Ontario Cannabis S/label_Synr.g'), 
    FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Trailblazer'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/_Xscape'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Aurora'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Canna Farms'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Edison'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Flowr'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Haven St'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/liiv'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Saturday'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Spinach'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/COLLECTION PAGE _OR/Filter_OR/Page_Pre-Rolled  Ontario Cannabis S/label_Spinach'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/THC BioMed'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Whistler Cannabis Co'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Spinach'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Spinach1'), FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Learn More About brand'), FailureHandling.OPTIONAL)

not_run: WebUI.setText(findTestObject('OCS-MOBILE /Filter flyout/Input to search - brand'), 'boveda', FailureHandling.OPTIONAL)

not_run: WebUI.verifyTextPresent('', Keys.chord(Keys.ENTER), FailureHandling.OPTIONAL)

not_run: WebUI.verifyTextPresent('Boveda', false, FailureHandling.OPTIONAL)

not_run: WebUI.setText(findTestObject('OCS-MOBILE /Filter flyout/Input to search - brand'), 'ace valley', FailureHandling.OPTIONAL)

not_run: WebUI.sendKeys(findTestObject('Object Repository/COLLECTION PAGE _OR/Filter_OR/Page_Shop by Brands  Ontario Cannab/input_Shop by Brands_q'), 
    Keys.chord(Keys.ENTER), FailureHandling.OPTIONAL)

not_run: WebUI.verifyTextPresent('Ace Valley', false, FailureHandling.OPTIONAL)

not_run: WebUI.back(FailureHandling.OPTIONAL)

not_run: WebUI.back(FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Filter option'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Terpenes tooltip'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Terpenes plus accordian'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Terpenes subtract accordian'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Terpenes plus accordian'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Alpha-bisabolol'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Alpha-pinene'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/COLLECTION PAGE _OR/Filter_OR/Page_Pre-Rolled  Ontario Cannabis S/label_Alpha-pinene'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Beta-pinene'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Guaiol'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Limonene'), FailureHandling.OPTIONAL)

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Myrcene'), FailureHandling.OPTIONAL)

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Ocimene'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Terpinene'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Terpinolene'), FailureHandling.OPTIONAL)

WebUI.delay(1, FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Object Repository/COLLECTION PAGE _OR/Filter_OR/Page_Pre-Rolled  Ontario Cannabis S/span_Trans-caryophyllene'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Terpineol'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Para-cymenene'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Nerolidol'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Linalool'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Humulene'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Bisabolol'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Beta-caryophyllene'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Alpha-caryophyllene'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Trans-caryophyllene'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-MOBILE /Filter flyout/Done (43)'))

String a = WebUI.getText(findTestObject('OCS-MOBILE /Filter flyout/li_Pre-Rolled'))

WebUI.comment(a)

if (a == '40 Products') {
    WebUI.comment('products are not filtered')
} else {
    WebUI.comment('products filtered')
}

