package com.stepdefination;

import java.util.List;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class BorlandTest {
	private WebDriver driver;

	@Given("^User is on Main Page$")
	public void User_is_on_Main_Page() throws Throwable {
		driver = new FirefoxDriver();
		driver.get("http://demo.borland.com/gmopost/");
		System.out.println("Welcome Demo Borland Home Page");
	}

	@When("^User click the GMO enter site$")
	public void user_click_the_GMO_enter_site() throws Throwable {
		driver.findElement(By.name("bSubmit")).click();
	}

	@And("^To fillup the OnLine Catalog form$")
	public void to_fillup_the_OnLine_Catalog_form(DataTable table)
			throws Throwable {
		System.out.println(table);
		List<List<String>> data = table.raw();
		System.out.println(data.get(1).get(1));

		driver.findElement(By.name("QTY_TENTS")).clear();
		driver.findElement(By.name("QTY_TENTS")).sendKeys(data.get(1).get(1));
		Thread.sleep(1000);
		driver.findElement(By.name("QTY_BACKPACKS")).clear();
		driver.findElement(By.name("QTY_BACKPACKS")).sendKeys(
				data.get(2).get(1));

	}

	@Then("^User click the place an order button$")
	public void user_click_the_place_an_order_button() throws Throwable {
		driver.findElement(By.name("bSubmit")).click();
	}

	@And("^User Proceed With order button$")
	public void user_Proceed_With_order_button() throws Throwable {
		driver.findElement(By.name("bSubmit")).click();
	}

	@Given("^User fill up form for billing Info$")
	public void user_fill_up_form_for_billing_Info(DataTable table)
			throws Throwable {
		System.out.println(table);
		List<List<String>> data = table.raw();
		System.out.println(data.get(1).get(1));

		driver.findElement(By.name("billName")).clear();
		driver.findElement(By.name("billName")).sendKeys(data.get(1).get(1));

		Thread.sleep(2000);

		driver.findElement(By.name("billAddress")).clear();
		driver.findElement(By.name("billAddress")).sendKeys(data.get(2).get(1));
		driver.findElement(By.name("billCity")).clear();
		driver.findElement(By.name("billCity")).sendKeys(data.get(3).get(1));
		Thread.sleep(2000);
		driver.findElement(By.name("billState")).clear();
		driver.findElement(By.name("billState")).sendKeys(data.get(4).get(1));

		Thread.sleep(2000);

		driver.findElement(By.name("billZipCode")).clear();
		driver.findElement(By.name("billZipCode")).sendKeys(data.get(5).get(1));
		driver.findElement(By.name("billPhone")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("billPhone")).sendKeys(data.get(6).get(1));

		Thread.sleep(2000);

		driver.findElement(By.name("billEmail")).clear();
		driver.findElement(By.name("billEmail")).sendKeys(data.get(7).get(1));

		// driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[1]/table/tbody/tr[10]/td[2]/select")).click();
		Thread.sleep(2000);

		new Select(driver.findElement(By.name("CardType")))
				.selectByVisibleText("Visa");

		driver.findElement(By.name("CardNumber")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("CardNumber")).sendKeys(data.get(8).get(1));

		driver.findElement(By.name("CardDate")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("CardDate")).sendKeys(data.get(9).get(1));

		Thread.sleep(2000);

		driver.findElement(By.name("shipSameAsBill")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("bSubmit")).click();

	}

	@When("^User check the Ship To$")
	public void User_check_the_Ship_To() throws Throwable {

		driver.findElement(By.name("bSubmit")).click();
	}

	@Then("^To close the browser$")
	public void to_close_the_browser() throws Throwable {
		driver.quit();
		System.out.println("Test has been done successfully");

	}

}
