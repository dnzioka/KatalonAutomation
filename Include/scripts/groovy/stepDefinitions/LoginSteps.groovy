package stepDefinitions

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeOptions
import com.kms.katalon.core.webui.driver.DriverFactory

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {

		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')
	}

	@When("user enters valid (.*) and (.*)")
	public void user_enters_valid_username_and_password(String username, String password) {
		WebUI.setText(findTestObject('Object Repository/Reusable Test case/login/input_Username_username'), username)
		WebUI.setText(findTestObject('Object Repository/Reusable Test case/login/input_Password_password'), password)
	}
	@When("user enters invalid (.*) and (.*)")
	public void user_enters_invalid_username_and_password(String username, String password) {
		WebUI.setText(findTestObject('Object Repository/Reusable Test case/login/input_Username_username'), username)
		WebUI.setText(findTestObject('Object Repository/Reusable Test case/login/input_Password_password'), password)
	}


	@When("clicks on login button")
	public void clicks_on_login_button() {
		WebUI.click(findTestObject('Object Repository/Reusable Test case/login/button_Login'))
	}

	@Then("user is navigated to the homePage")
	public void user_is_navigated_to_the_homePage() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Reusable Test case/login/Homepage'), 10)
	}
	@Then("user sees an error message")
	public void user_sees_an_error_message() {
		// Verify the error message element is present
		WebUI.verifyElementPresent(findTestObject('Object Repository/Reusable Test case/login/loginError'), 10)
		// Verify the error message text (adjust this as per the site)
		WebUI.verifyElementText(findTestObject('Object Repository/Reusable Test case/login/loginError'), 'Invalid credentials')
	}
}
