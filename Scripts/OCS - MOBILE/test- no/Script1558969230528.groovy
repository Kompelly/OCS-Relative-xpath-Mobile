

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join

WebUI.openBrowser('')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.katalon.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open(" https://ocs.ca/?fts=0&preview_theme_id=53376026444")
selenium.click("id=dob__day")
selenium.select("id=dob__day", "label=22")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='SELECT YOUR DATE OF BIRTH'])[1]/following::option[23]")
selenium.select("id=dob__month", "label=May - 05")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='DAY'])[1]/following::option[6]")
selenium.click("id=dob__year")
selenium.select("id=dob__year", "label=1955")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='MONTH'])[1]/following::option[65]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='YEAR'])[1]/following::button[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='CONFIRM'])[1]/preceding::span[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='About the OCRC’s Age Requirements'])[1]/preceding::button[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Learn about cannabis'])[1]/following::button[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Français'])[2]/following::h3[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Cannabis'])[2]/following::span[1]")
