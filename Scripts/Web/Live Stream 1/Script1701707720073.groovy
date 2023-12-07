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

WebUI.navigateToUrl('https://fanid.qc.frgapps.com/oauth2/auth?client_id=fici7kFkJPgPY3IEN-ofiyUhZfaBwqbctZ1OieVwaC4-vk0z&preview=sdikhjbgggr3249rgf279384rtfg42i8uwehkjdcbc7438908f4323heouwi&redirect_uri=https%3A%2F%2Fos.staging.fanatics.live%2Fauth%2Ffan_id%2Fcallback&response_type=code&scope=openid+account%3Aread&state=BrEpH4ELzG1QDY1AVDzPzDZ0')

WebUI.setText(findTestObject('Object Repository/Page_Fanatics ID/input_Email_ant-input css-g9hr2g Input_floa_98f4ff'), 'chong.li+local@fanatics.live')

WebUI.click(findTestObject('Object Repository/Page_Fanatics ID/div_Next Step'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Fanatics ID/input_Not you_ant-input css-g9hr2g'), 'sKcMxX/s+noMn/ymOENrXA==')

WebUI.click(findTestObject('Object Repository/Page_Fanatics ID/div_Log in with Fanatics ID'))

WebUI.click(findTestObject('Object Repository/Page_fanatics/button_Schedule a show'))

WebUI.click(findTestObject('Object Repository/Page_fanatics/input_Title_live_streamname'))

WebUI.setText(findTestObject('Object Repository/Page_fanatics/input_Title_live_streamname'), 'QA Test Session Dec 04')

WebUI.click(findTestObject('Object Repository/Page_fanatics/div_Cover Image_file-preview h-full w-full _961bca'))

WebUI.click(findTestObject('Object Repository/Page_fanatics/label_Description'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_fanatics/select_Select a breakerchong.lilocalfanatics.live'), 
    'df59d04f-68dc-4054-bbf5-96fadf9c505c', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_fanatics/select_Select a breakerchong.lilocalfanatics.live'), 
    'df59d04f-68dc-4054-bbf5-96fadf9c505c', true)

WebUI.click(findTestObject('Object Repository/Page_fanatics/button_Add listings'))

WebUI.click(findTestObject('Object Repository/Page_fanatics/button_Save show as draft'))

WebUI.closeBrowser()

