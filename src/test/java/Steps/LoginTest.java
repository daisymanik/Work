package Steps;

import java.util.HashMap;

import org.openqa.jetty.html.Page;
import org.openqa.selenium.WebDriver;

import Pages.LoginPageAction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataprovider.DataProvider;


public class LoginTest {
public static WebDriver driver=null;
	
	Pages.LoginPageAction LoginPageAction=new Pages.LoginPageAction();
	
	DataProvider GetExcelData = new DataProvider();
	
    HashMap<String, String> excelHashMapValues = new HashMap <String, String>();
    public String TestCaseID = "TC_001";
	
	@Given("^I am a registered user on the web page$")
	public void i_am_a_registered_user_on_the_web_page() throws Throwable {
		LoginPageAction.clickOnMyAccountLink();
	}

	@When("^I enter username in email field$")
	public void i_enter_username_in_email_field() throws Throwable {
		GetExcelData.extractExcelData(TestCaseID, excelHashMapValues);
		LoginPageAction.enterUserName(excelHashMapValues.get("Username"));
	}

	@When("^I enter passwowrd in password field$")
	public void i_enter_passwowrd_in_password_field() throws Throwable {
		GetExcelData.extractExcelData(TestCaseID, excelHashMapValues);
		LoginPageAction.enterPassword(excelHashMapValues.get("Password"));
	}

	@When("^ckick on login button$")
	public void ckick_on_login_button() throws Throwable {
		LoginPageAction.clickOnSignButton();
	}

	@Then("^I should get access to the Dashboard$")
	public void i_should_get_access_to_the_Dashboard() throws Throwable {
		LoginPageAction.accessToTheDashboard();
	}
}
