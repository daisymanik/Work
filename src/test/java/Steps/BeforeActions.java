package Steps;

	import java.io.IOException;

import Utilities.SeleniumDriver;
import cucumber.api.java.Before;


	public class BeforeActions  {

		@Before
	    public static void setUp() throws IOException {
			//ExtentCucumberFormatter.initiateExtentCucumberFormatter();
	    	SeleniumDriver.setUpDriver();
	    }
	}


