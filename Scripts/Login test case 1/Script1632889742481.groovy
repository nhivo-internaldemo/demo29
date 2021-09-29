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

WebUI.openBrowser('')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.katalon.com/')

WebUI.mouseOver(findTestObject('Object Repository/Page_Katalon  Simplify Web, API, Mobile, De_2f1b85/a_Resources'))

WebUI.click(findTestObject('Object Repository/Page_Katalon  Simplify Web, API, Mobile, De_2f1b85/div_Submit a ticket'))

WebUI.click(findTestObject('Object Repository/Page_Katalon Help Center/a_Submit a ticket'))

WebUI.setText(findTestObject('Object Repository/Page_Sign in  Katalon Solution/input_Sign in to Katalon_user_email'), 'nhi.vo@katalon.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in  Katalon Solution/input_Sign in to Katalon_user_pass'), 
    'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Object Repository/Page_Sign in  Katalon Solution/input_Remember me_login-btn'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sign in  Katalon Solution/div_Incorrect email or password. Please try again'), 
    'Incorrect email or password. Please try again')

WebUI.takeScreenshotAsCheckpoint('')

WebUI.closeBrowser()

