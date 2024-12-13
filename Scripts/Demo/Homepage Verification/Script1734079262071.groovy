import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Demo/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Reusable Test case/Used/span_My Info'))

WebUI.setText(findTestObject('Object Repository/Reusable Test case/Used/input_Employee Full Name_middleName'), 
    'Engineer')

WebUI.setText(findTestObject('Object Repository/Reusable Test case/Used/input_Employee Full Name_lastName'), 
    'Hired')

WebUI.click(findTestObject('Object Repository/Reusable Test case/Used/button_Save'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Reusable Test case/Used/p_Success'), 10)
boolean isPopupPresent = WebUI.verifyElementPresent(findTestObject('Object Repository/Reusable Test case/Used/p_Success'), 10)

WebUI.closeBrowser()

