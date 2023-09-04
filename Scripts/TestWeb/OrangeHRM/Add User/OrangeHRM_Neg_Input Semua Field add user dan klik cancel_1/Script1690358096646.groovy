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

WebUI.callTestCase(findTestCase('TestWeb/OrangeHRM/Add User/Orang HRM_Pos Klik button add pada menu table employee_1'), [:], FailureHandling.OPTIONAL)
WebUI.click(findTestObject('Object Repository/Add User/dd_Role'))
WebUI.click(findTestObject('Object Repository/Add User/div_ESS'))
WebUI.setText(findTestObject('Object Repository/Add User/input'),"Odis Adalwin")
WebUI.delay(4)
WebUI.click(findTestObject('Admin Search/div_Odis  Adalwin'))
WebUI.click(findTestObject('Object Repository/Add User/dd_Status'))
WebUI.click(findTestObject('Add User/div_Enabled'))
WebUI.setText(findTestObject('Add User/in_Username'),"sukia125")
WebUI.setText(findTestObject('Add User/in_Password'),"sukia123")
WebUI.setText(findTestObject('Add User/in_Confirm'),"sukia125")
WebUI.click(findTestObject('Add User/button_Cancel'))