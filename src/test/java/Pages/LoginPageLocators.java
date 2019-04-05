package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageLocators {
	@FindBy(how=How.XPATH,using=".//*[@id='menu-item-50']/a")
	public WebElement myAccountLink;

	@FindBy(how=How.ID,using="username")
	public WebElement username;
	
	@FindBy(how=How.ID,using="password")
	public WebElement password;
	
	@FindBy(how=How.XPATH,using=".//*[@id='customer_login']/div[1]/form/p[3]/input[3]")
	public WebElement loginIn;
	
	@FindBy(how=How.LINK_TEXT,using="Sign out")
	public WebElement logOutLink;
}
