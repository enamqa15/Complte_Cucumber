package southwest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class SouthWestTest {
	private WebDriver driver;

	@Given("^I am on the Southwest Home Page$")
	public void i_am_on_the_Southwest_Home_Page() throws Throwable {
		driver = new FirefoxDriver();
		driver.get("https://www.southwest.com/");
	  
	}
	
	@When("^User have to fill up Search Flight form$")
	public void user_have_to_fill_up_Search_Flight_form() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/a[1]"))
				.click();
		Thread.sleep(1000);

		driver.findElement(
				By.xpath("html/body/div[1]/div/div/div[2]/div/div/div/div[1]/div[1]/ul/li[1]/a"))
				.click();
		Thread.sleep(1000);

		driver.findElement(By.id("oneWay")).click();
		driver.findElement(By.id("originAirport_displayed")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("originAirport_displayed")).sendKeys(
				"Los Angeles, CA - LAX");
		driver.findElement(By.id("destinationAirport_displayed")).clear();
		driver.findElement(By.id("destinationAirport_displayed")).sendKeys(
				"New York (LaGuardia), NY - LGA");

		Thread.sleep(1000);

		driver.findElement(By.cssSelector("img.ui-datepicker-trigger")).click();
		driver.findElement(By.linkText("14")).click();
		driver.findElement(By.id("outboundTimeOfDay")).click();
		Thread.sleep(1000);

		new Select(driver.findElement(By.id("outboundTimeOfDay")))
				.selectByVisibleText("After 6pm");
		driver.findElement(By.id("outboundDepartTimeOfDayAfter6pm")).click();
		driver.findElement(By.id("adultPassengerCount")).click();
		Thread.sleep(1000);

		new Select(driver.findElement(By.id("adultPassengerCount")))
				.selectByVisibleText("2 Adults");
		driver.findElement(By.cssSelector("option[value=\"2\"]")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("seniorPassengerCount")).click();
		new Select(driver.findElement(By.id("seniorPassengerCount")))
				.selectByVisibleText("1 Senior");
		driver.findElement(
				By.cssSelector("#seniorPassengerCount > option[value=\"1\"]"))
				.click();
		Thread.sleep(1000);

		driver.findElement(By.id("points")).click();
		driver.findElement(By.id("dollars")).click();
		driver.findElement(By.id("submitButton")).click();
System.out.println("Successfully Flight Search");
	}


	@When("^User click the Flight Hotel and Car$")
	public void User_click_the_Flight_Hotel_and_Car() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/a[1]"))
		.click();
	}

	@Then("^To close the Popup window$")
	public void to_close_the_Popup_window() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("html/body/div[1]/div/div/div[2]/div/div/div/a/span"))
				.click();
	}
	
	@Then("^User close the Browser$")
	public void user_close_the_Browser() throws Throwable {
	    driver.quit();
	    System.out.println("Welcome PopUp Window");
	}


}

