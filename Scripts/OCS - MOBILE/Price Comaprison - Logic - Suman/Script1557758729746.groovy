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

WebUI.comment('a=' + a)

String without = a.substring(1)

WebUI.comment('without = ' + without)

String last = without.substring(0, without.length() - 1)

WebUI.comment('last=' + last)

String last1 = last.substring(0, last.length() - 1)

WebUI.comment(' last1 =' + last1)

String last2 = last1.substring(0, last1.length() - 1)

WebUI.comment('last2 =' + last2)

// Dollar removal code... product 2
WebUI.comment('k=' + k)

String without1 = k.substring(1)

WebUI.comment('without1 = ' + without1)

String la = without1.substring(0, without1.length() - 1)

WebUI.comment('la=' + la)

String la1 = la.substring(0, la.length() - 1)

WebUI.comment(' la1 =' + la1)

String la2 = la1.substring(0, la1.length() - 1)

WebUI.comment('la2 =' + la2)

double p1

double p2

// code to convert stringto int
try {
    String str = last2

    WebUI.comment('str=' + str)

    p1 = Double.valueOf(str)

    WebUI.comment('p1=' + p1)
}
catch (NumberFormatException ex) {
} 

String str = last2

WebUI.comment('str=' + str)

p1 = Double.valueOf(str)

WebUI.comment('p1=' + p1)

try {
    String str5 = la2

    WebUI.comment('str5=' + str5)

    p2 = Double.valueOf(str5)

    WebUI.comment('p2=' + p2)
}
catch (NumberFormatException ex) {
} 

String str5 = la2

WebUI.comment('str5=' + str5)

p2 = Double.valueOf(str5)

WebUI.comment('p2=' + p2)

double total = p1 + p2

WebUI.comment('total =' + total)

String amount = WebUI.getText(findTestObject('OCS-MOBILE/Cart flyout/Sub-total Price'))

WebUI.delay(2)

WebUI.comment('amount =' + amount)

String soustotal = amount.substring(1)

WebUI.comment('soustotal= ' + soustotal)

/* String soustotal1 = soustotal.substring(0, soustotal.length() - 1)

WebUI.comment('soustotal1' + soustotal1)

String soustotal2 = soustotal1.substring(0, soustotal1.length() - 1)

WebUI.comment(' soustotal2=' + soustotal2)

String soustotal3 = soustotal2.substring(0, soustotal2.length() - 1)

WebUI.comment('soustotal3 =' + soustotal3) */
double p

try {
    String finalprice = soustotal

    WebUI.comment('finalprice=' + finalprice)

    p = Double.valueOf(finalprice)

    WebUI.comment('p=' + p)
}
catch (NumberFormatException ex) {
} 

String finalprice = soustotal

WebUI.comment('finalprice=' + finalprice)

p = Double.valueOf(finalprice)

WebUI.comment('p=' + p)

WebUI.verifyEqual(total, p)

WebUI.comment('cart items price equal')

