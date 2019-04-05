package Pages;

import org.junit.Assert;
import org.openqa.jetty.html.Page;
import org.openqa.selenium.support.PageFactory;

import Utilities.HelperClass;
import Utilities.SeleniumDriver;

public class LoginPageAction {

	
	Pages.LoginPageLocators LoginPageLocators;
	Utilities.HelperClass helper=new Utilities.HelperClass();
	
	public LoginPageAction()
	{
		this.LoginPageLocators=new Pages.LoginPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), LoginPageLocators);
	}
	
	public void clickOnMyAccountLink() throws Exception
	{
		LoginPageLocators.myAccountLink.click();
	}
	
	public void enterUserName(String username) throws Exception
	{

		//LoginPageLocators.username.sendKeys(username);
		helper.wait(4000);
		helper.EnterText(LoginPageLocators.username, username);
	}
	
	public void enterPassword(String password) throws Exception
	{
		helper.wait(4000);
		//LoginPageLocators.password.sendKeys(password);
		helper.EnterText(LoginPageLocators.password, password);
	}

	
	public void clickOnSignButton() throws Exception
	{
		//LoginPageLocators.loginIn.click();
		helper.clickElement(LoginPageLocators.loginIn);
		
	}
	public void accessToTheDashboard()
	{
		//Assert.assertEquals(true,LoginPageLocators.logOutLink.isDisplayed());
		Assert.assertEquals(true,helper.isElementPresent(LoginPageLocators.logOutLink));
}	

}
