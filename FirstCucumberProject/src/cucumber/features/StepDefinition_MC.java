package cucumber.features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.os.WindowsUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinition_MC extends CommonAPI {
	WebDriver driver=null;
	
	@Test(enabled=true)//this is the base test. this will be split and parameterized in Cucumber test.
	public void MyTest(){
		WindowsUtils.killByName("chromedriver.exe");
		String vBaseURL = "https://www.mortgagecalculator.org/";
		CommonAPI CommonAPI = new CommonAPI();
		WebDriver driver = CommonAPI.getDriver("CHROME", vBaseURL);
		waitTime(15000);
		scrolldown( driver,300);
		driver.findElement(By.name("param[homevalue]")).sendKeys("350000");
		driver.findElement(By.name("param[principal]")).sendKeys("300000");
		driver.findElement(By.name("param[interest_rate]")).sendKeys("2.25");
		driver.findElement(By.name("param[term]")).sendKeys("15");
		driver.findElement(By.name("param[property_tax]")).sendKeys(".5");
		driver.findElement(By.name("param[pmi]")).sendKeys("1.3");
		driver.findElement(By.name("param[hoi]")).sendKeys("2000");
		waitTime(2000);
		driver.findElement(By.name("cal")).click();
		waitTime(7000);
		scrolldown( driver,300);
		
		String vOutput=driver.findElement(By.xpath("//*[@id=\"calc\"]/form/section/section[2]/div/div/div[1]/div/div/div[3]/div[2]/div[2]/div[1]/div[1]/h3")).getText();
		System.out.println(vOutput);
		try {
			Assert.assertEquals( vOutput,"$2,602.75");
		} catch (Exception e) {			
			e.printStackTrace();
			System.out.println("Failed because"+e);
		}
	}
	
	@Given("^Open Browser MC - \"([^\"]*)\"$")
	public void open_Browser_MC(String BrowserName) throws Throwable {
		String vBaseURL = "https://www.mortgagecalculator.org/";
		CommonAPI CommonAPI = new CommonAPI();
		driver = CommonAPI.getDriver(BrowserName, vBaseURL);
		waitTime(15000);
	}

	@Then("^Enter all data in the calculator and click on calculate button$")
	public void enter_all_data_in_the_calculator_and_click_on_calculate_button() throws Throwable {
		scrolldown( driver,300);
		driver.findElement(By.name("param[homevalue]")).sendKeys("350000");
		driver.findElement(By.name("param[principal]")).sendKeys("300000");
		driver.findElement(By.name("param[interest_rate]")).sendKeys("2.25");
		driver.findElement(By.name("param[term]")).sendKeys("15");
		driver.findElement(By.name("param[property_tax]")).sendKeys(".5");
		driver.findElement(By.name("param[pmi]")).sendKeys("1.3");
		driver.findElement(By.name("param[hoi]")).sendKeys("2000");
		waitTime(2000);
		driver.findElement(By.name("cal")).click();
		waitTime(7000);
		scrolldown( driver,300);
	}

	@Then("^Check expected Payment with Actual Payment$")
	public void check_expected_Payment_with_Actual_Payment() throws Throwable {
		String vOutput=driver.findElement(By.xpath("//*[@id=\"calc\"]/form/section/section[2]/div/div/div[1]/div/div/div[3]/div[2]/div[2]/div[1]/div[1]/h3")).getText();
		System.out.println(vOutput);
		try {
			Assert.assertEquals( vOutput,"$2,602.75");
		} catch (Exception e) {			
			e.printStackTrace();
			System.out.println("Failed because"+e);
		}
	}

}
