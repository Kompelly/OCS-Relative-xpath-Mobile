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

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Learn chevron'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/How Cannabis Works plus accordian'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/How Cannabis Works Subtract accordian'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/How Cannabis Works plus accordian'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/The Effects of Cannabis'))

WebUI.verifyTextPresent('The Effects of Cannabis', true)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Learn chevron'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/How Cannabis Works plus accordian'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Endocannabinoids chevron'))

WebUI.verifyTextPresent('The Endocannabinoid System', true)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Learn chevron'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/How Cannabis Works plus accordian'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Read More -1'))

WebUI.delay(2)

WebUI.verifyTextPresent('The human reaction to cannabis.', false)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Learn chevron'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Cannabis Anatomy plus accordian'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Cannabis Anatomy subtract accordian'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Cannabis Anatomy plus accordian'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/CBD'))

WebUI.delay(2)

WebUI.verifyTextPresent('CANNABIS ANATOMY', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Learn chevron'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Cannabis Anatomy plus accordian'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Terpenes'))

not_run: WebUI.click(findTestObject('Learn_spy/Page_Ontario Cannabis Store  Ontari/h3_Learn'))

not_run: WebUI.click(findTestObject('Object Repository/Learn_OR/Page_The Effects of Cannabis  Ontar/a_Read More'))

WebUI.verifyTextPresent('Terpenes give cannabis strains their unique aromas.', true)

not_run: WebUI.click(findTestObject('Learn_spy/Page_Ontario Cannabis Store  Ontari/h3_Learn'))

not_run: WebUI.click(findTestObject('Object Repository/Learn_OR/Page_How Cannabis Works  Ontario Ca/span_Cannabis Anatomy'))

not_run: WebUI.click(findTestObject('Learn_spy/Page_Ontario Cannabis Store  Ontari/h3_Learn'))

not_run: WebUI.verifyTextPresent('Terpenes give cannabis strains their unique aromas.', true)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Learn chevron'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Cannabis Anatomy plus accordian'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/THC'))

WebUI.verifyTextPresent('THC is the component in cannabis that is primarily responsible for its intoxicating, psychoactive effects.', 
    true)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Learn chevron'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Cannabis Anatomy plus accordian'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Read More -2'))

WebUI.verifyTextPresent('The components of a complex plant.', true)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Learn chevron'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Cannabis Consumption'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Cannabis Consumption subtract accordian'))

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Cannabis Consumption'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Cooking with cannabis'))

WebUI.verifyTextPresent('Cannabis-infused foods are becoming more common, and careful preparation is required to avoid overconsumption.', 
    true)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Learn chevron'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Cannabis Consumption'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/storing cannabis - chevron'))

WebUI.verifyTextPresent('How to keep your family safe and your cannabis from spoiling.', true)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Learn chevron'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Cannabis Consumption'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Growing cannabis - chevron'))

WebUI.verifyTextPresent('It is legal in Ontario to own and grow up to 4 cannabis plants in your own residential dwelling. Get beginner growing tips here.', 
    true)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Learn chevron'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Cannabis Consumption'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Read More -3'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Learn chevron'))

WebUI.delay(2)

not_run: WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Cannabis Consumption plus accordian'))

not_run: WebUI.click(findTestObject('Object Repository/Learn_OR/Page_Methods of Consumption  Ontari/li_LearnLearnHow Cannabis Work'))

not_run: WebUI.verifyTextPresent('The Endocannabinoid System', true)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/How to Choose Cannabis Products'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/How to Choose Cannabis Products subtract accordian'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/How to Choose Cannabis Products'))

WebUI.delay(1)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Reading a product label - chevron'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Learn chevron'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/How to Choose Cannabis Products'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/cannabinoid content - chveron'))

WebUI.verifyTextPresent('Understanding Cannabinoid Content on Product Labels', true)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Learn chevron'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/How to Choose Cannabis Products'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Factors in Choosing Canna - chevron'))

WebUI.verifyTextPresent('Six things to know before deciding to consume cannabis.', true)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Learn chevron'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/How to Choose Cannabis Products'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Read More -5'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Learn chevron'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Buying Cannabis at OCS plus accordian'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Buying Cannabis at OCS subtract accordian'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Buying Cannabis at OCS plus accordian'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Why Legal Cannabis Costs more - chevron'))

WebUI.verifyTextPresent('Four Reasons Why Legal Cannabis Costs More', true)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Learn chevron'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Buying Cannabis at OCS plus accordian'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/why trust us - chevron'))

WebUI.verifyTextPresent('Legal products and reliable information.', true)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Learn chevron'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Buying Cannabis at OCS plus accordian'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/about buying cannabis - chveron'))

WebUI.delay(2)

WebUI.verifyTextPresent('These facts are good to know before making a cannabis purchase.', true)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Learn chevron'))

WebUI.delay(2)

not_run: WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Buying Cannabis at OCS plus accordian'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Read More -6'))

not_run: WebUI.delay(1)

not_run: WebUI.verifyTextPresent('How and why to shop with us.', true)

WebUI.delay(2)

not_run: WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Learn chevron'))

not_run: WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Whats Legal plus accordian'))

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Whats Legal subtract accordian'))

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Whats Legal plus accordian'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/History -part 1 - chveron'))

WebUI.verifyTextPresent('A Brief History of Cannabis - Part 1', true)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Learn chevron'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Whats Legal plus accordian'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/History -part 2 - chveron'))

WebUI.verifyTextPresent('A Brief History of Cannabis - Part 2', true)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Learn chevron'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Whats Legal plus accordian'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Legal Use of Cannabis in ontario - chevron'))

WebUI.verifyTextPresent('What you need to know before your start shopping.', true)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Learn chevron'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Whats Legal plus accordian'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Read More -4'))

WebUI.verifyTextPresent('Learn about cannabis laws.', true)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Learn chevron'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/see the learn section button'))

WebUI.verifyTextPresent('Learn about cannabis laws.', true)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Learn chevron'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/a brief history of cannabis'))

WebUI.verifyTextPresent('How to Recycle Cannabis Packaging', true)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Learn chevron'))

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/see our FAQ'))

WebUI.verifyTextPresent('Legal Use of Cannabis in Ontario', true, FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/Learn chevron'))

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-MOBILE /LEARN page/SEE OUR GLOSSARY'))

