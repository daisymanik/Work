package Utilities;

import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HelperClass {
	public static WebDriver driver=null;

	
	 public static boolean isElementPresent(WebElement webElement) {
	        try {
	            boolean isPresent = webElement.isDisplayed();
	            return isPresent;
	        } catch (NoSuchElementException e) {
	            return false;
	        }
	        
	    }
	 
	public void wait(int sec){
   	try {
			Thread.sleep(sec);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      }
	
	
	public void EnterText(WebElement element,String value){
	    try {
		element.clear();
		element.sendKeys(value);
	       }
	    catch(NoSuchElementException e)
	      {
		    System.out.println("Specifed WebElement is not Present in the WebPage: "+e);
	      }
       }	
	

   public void clickElement(WebElement element) 
      {
	     try {
		element.click();
		System.out.println("element is clicked successfully.");
	    } 
	    catch (NoSuchElementException e) 
	      {
		System.out.println(" Unable to clicked on element" +e);
	     }
     }
   
   
   public void moveToElement(WebElement main_menu,WebElement sub_menu)
	{
		try
		{
			Actions a = new Actions(driver);
			a.moveToElement(main_menu).moveToElement(sub_menu).click().perform();
		}
		catch(WebDriverException e)
		{
			System.out.println(" WebElement is Not Found :"+e);
		}
   }
   
   
	public String getText(WebElement element)
	   { 
		String text=null;
		try
		{
			text =element.getText();
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Specifed WebElement is not Present in the WebPage: "+e);
		}
		return text;
	}
   
	
	public  void selectByText(WebElement element,String str_msg)
	   {
	     try
	    {
		 Select s = new Select(element);
		 s.selectByValue(str_msg);
	    }
	 catch(NoSuchElementException e)
	   {
		 System.out.println("Specifed WebElement is not Present in the WebPage: "+e);
	   }
     }
	
	
   
	public  void scrollToBottom() {
		try
		{
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		}
		catch(Exception e)
		{
			System.out.println(" Unable to ScrollDown in webpage :"+e);
		}
    }

	
   public  void scrollToUp() {
		try
		{
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-500)");
		}
		catch(Exception e)
		{
			System.out.println(" Unable to ScrollDown in webpage :"+e);
		}
    }
   
   
   
	public  boolean verifyText(WebElement element ,String expectedString)
	{
	try
		{
			String actualString= getText(element);
			if(expectedString.equals(actualString))
			{
				System.out.println(" text is verified");
				return true;
			}
			else
			{
				System.out.println("String content is different");
				return false;
			}
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Specifed WebElement is not Present in the WebPage: "+e);
		}
	      return false;
	 }
  
public String getAlertText()
	 {
		 String text =null;
		 try
		 {
			 Thread.sleep(4000);
			 text =driver.switchTo().alert().getText();
			 Thread.sleep(2000);
		 }
		 catch(Exception e)
		 {
			 System.out.println(" Alert is not present or searching the webElemnt is not valid :"+e);
		 }
		 return text;
	 }
  
 public  void switchToFrame(String Name) {
		try {
			driver.switchTo().frame(Name);
			System.out.println("Navigated to frame with id ");
		} catch (NoSuchFrameException e) {
			System.out.println("Unable to locate frame with id : "+ e);
		} 
	}

public void switchtoDefaultFrame() {
		try {
			driver.switchTo().defaultContent();
			System.out.println("Navigated back to webpage from frame");
		} catch (Exception e) {
			System.out.println("unable to navigate back to main webpage from frame :"+e);
		}
	} 

	public  boolean verifyAlertMessage( String verify_msg) 
	{
		try
		{
			String Actual_msg =  getAlertText();
			if(Actual_msg.equals(verify_msg))
			{
				System.out.println("Both the msg is verifyed & it's same");
				return true;
			}
			else
			{
				System.out.println("Messgae is not same");
				return false;
			}
			}
		 
		catch(Exception  e)
		{
			System.out.println(" Alert is not present or searching the webElemnt is not valid :"+e);
		}
		return false;
	 }

}
