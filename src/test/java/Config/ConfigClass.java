package Config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public class ConfigClass {
	Properties prop;

	@BeforeClass
	public Properties LoadConfigProperties() throws IOException{
		        
		        File propFile = new File("D:\\A-SCB\\Automation Framework\\SCB_Cucumber_For Premises\\SCB_Cucumber\\src\\test\\java\\Config\\Config.properties");
		        FileInputStream fileInput = null;
		        try{
		            fileInput = new FileInputStream(propFile);
		        } catch (FileNotFoundException e){
		            e.printStackTrace();
		        }

		        Properties prop = new Properties();
		        //Load properties file
		        try{
		            prop.load(fileInput);
		        }catch (IOException e){
		            e.printStackTrace();
		        }
		        return prop;
		    }

	@AfterClass
	public void afterSutie()
	{
		
	}

}
