package cucumber.features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.os.WindowsUtils;

import cucumber.api.java.en.Then;

public class StepDefinition_Common extends CommonAPI {
	WebDriver driver=null;
	
	@Then("^Close all Open Browsers$")
	  public void close_all_Open_Browsers() throws Throwable {
		    WindowsUtils.killByName("chromedriver.exe");
			WindowsUtils.killByName("IEDriverServer.exe");
			WindowsUtils.killByName("geckodriver.exe");
			WindowsUtils.killByName("MicrosoftWebDriver.exe");
			WindowsUtils.killByName("MicrosoftEdge.exe");
	  } 

}
