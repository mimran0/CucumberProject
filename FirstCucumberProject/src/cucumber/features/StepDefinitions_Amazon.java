package cucumber.features;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.os.WindowsUtils;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions_Amazon extends CommonAPI {

	@Given("^do search in home page$")
	public void do_search_in_home_page() throws Throwable {
		String[] list = new String[10];
		list[0] = "T-shart";
		list[1] = "panty";
		list[2] = "cap";
		list[3] = "tie";
		list[4] = "belt";
		list[5] = "bra";
		list[6] = "watch";
		list[7] = "Phone";
		list[8] = "Computer";
		list[9] = "Candle";

		for (int i = 0; i < list.length; i++) {
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys(list[i]);
			waitTime(3000);
			// Hit enter from the keyboard starts here
			Robot r = null;
			try {
				r = new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			// Hit enter from the keyboard Ends here
			waitTime(5000);
			driver.findElement(By.id("twotabsearchtextbox")).clear();
		}
	}

	@Given("^Select all data from dropdown list$")
	public void select_all_data_from_dropdown_list() throws Throwable {

		int i;
		i = 0;
		while (i <= 50) {
			Select dropdown2 = new Select(driver.findElement(By.id("searchDropdownBox")));
			dropdown2.selectByVisibleText("All Departments");
			// Hit enter from the keyboard starts here
			Robot r = null;
			try {
				r = new Robot();
			} catch (AWTException e) {

			}
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			// Hit enter from the keyboard Ends here
			waitTime(2000);
			Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
			dropdown.selectByIndex(i);
			waitTime(1000);
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bra");
			waitTime(3000);
			// Hit enter from the keyboard starts here
			// Robot r = null;
			try {
				r = new Robot();
			} catch (AWTException e) {

			}
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			// Hit enter from the keyboard Ends here
			waitTime(5000);
			driver.findElement(By.id("twotabsearchtextbox")).clear();
			i++;
		}
	}

	// Duplicate method with different names. I don't know why I kept it here.
	@Then("^Close All Browsers$")
	public void close_All_Browsers() throws Throwable {
		System.out.println("pre scenario criteria is executed");
		WindowsUtils.killByName("chromedriver.exe");
		WindowsUtils.killByName("iexplore.exe");
		WindowsUtils.killByName("geckodriver.exe");
		WindowsUtils.killByName("MicrosoftWebDriver.exe");
		WindowsUtils.killByName("MicrosoftEdge.exe");
	}

	@Given("^Open Browser Amazon - \"([^\"]*)\"$")
	public void open_Browser_MC(String BrowserName) throws Throwable {
		String vBaseURL = "https://www.amazon.com";
		CommonAPI CommonAPI = new CommonAPI();
		driver = CommonAPI.getDriver(BrowserName, vBaseURL);
		waitTime(15000);
	}
}
