package Utilities;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.WebDriverWait;

import Config.ConfigClass;

public class SeleniumDriver {
	 private static SeleniumDriver seleniumDriver;
	    private static WebDriver driver;
	    public final static int TIMEOUT = 30;
	    public final static int PAGE_LOAD_TIMEOUT = 50;
	    
	    
	    private  SeleniumDriver() throws IOException {
	    	
	    	
	    	ConfigClass ConfigProp=new ConfigClass();
	    	Properties ConfigObj = ConfigProp.LoadConfigProperties();
			
	    	File pathBinary = new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
			FirefoxProfile firefoxProfile = new FirefoxProfile();       
			WebDriver driver = new FirefoxDriver(firefoxBinary, firefoxProfile);
	        driver.manage().window().maximize();
	        new WebDriverWait(driver, TIMEOUT);
	        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
	        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	       driver.get(ConfigObj.getProperty("url"));
	}
	 
	 public static WebDriver getDriver() {
	     return driver;
	 }
	 
	 public static void setUpDriver() throws IOException {
	     if (seleniumDriver == null)
	          seleniumDriver = new SeleniumDriver();
	    
	  }

	  public static void tearDown() {
	      if (driver != null) {
	          driver.close();
	          driver.quit();
	      }
	      seleniumDriver = null;
	  }


}
