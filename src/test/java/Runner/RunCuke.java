package Runner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentCucumberFormatter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/Report/cucumber.json", "pretty", "html:target/Report/cucumber.html"},
        features = "src/test/java/Feature",
        glue = "Steps",
        monochrome=true     
        )

public class RunCuke extends AbstractTestNGCucumberTests{
	@BeforeClass
    public static void setup() {
      /*  // Initiates the extent report and generates the output in the output/Run_<unique timestamp>/report.html file by default.
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");
		Date curDate = new Date();
		String strDate = sdf.format(curDate);
		String fileName = "D:\\SCB_Cucumber\\SCB_Cucumber\\ExtenReport\\report" + strDate+".html";
		File newFile = new File(fileName);
       // ExtentCucumberFormatter.initiateExtentCucumberFormatter(newFile,false);

		ExtentCucumberFormatter.initiateExtentCucumberFormatter(new File("D:\\A-SCB\\Automation Framework\\SCB_Cucumber_For Premises\\SCB_Cucumber\\ExtenReport\\extentreports.html"),true);
        // Loads the extent config xml to customize on the report.
        ExtentCucumberFormatter.loadConfig(new File("D:\\A-SCB\\Automation Framework\\SCB_Cucumber_For Premises\\SCB_Cucumber\\ExtenReport\\extentreports.html"));
        
        // User can add the system information as follows
        ExtentCucumberFormatter.addSystemInfo("Browser Name", "Firefox");
        ExtentCucumberFormatter.addSystemInfo("Browser version", "v31.0");
        ExtentCucumberFormatter.addSystemInfo("Selenium version", "v2.53.0");

        // Also you can add system information using a hash map
        Map systemInfo = new HashMap();
        systemInfo.put("Cucumber version", "v1.2.3");
        systemInfo.put("Extent Cucumber Reporter version", "v1.1.0");
        ExtentCucumberFormatter.addSystemInfo(systemInfo);*/
    }
}
