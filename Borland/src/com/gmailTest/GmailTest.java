package com.gmailTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class GmailTest {
	private WebDriver driver;
	//private WebDriver driver=null;

	@Given("^User is on Home Page$")
	public void userisonHomePage() throws Throwable {
		driver = new FirefoxDriver();
		driver.get("http://www.google.com/");
		System.out.println("Borland is on Home Page");
	}

	@When("^User click the SignIn button$")
	public void userinputthevaluesontextbox() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='gb_70']")).click();
		System.out.println("online catalog input the values on textbox");
	}

	@And("^User enter the userName and Password$")
	public void user_enter_the_userName_and_Password(DataTable table) throws Throwable {
		System.out.println(table);
		List<List<String>> data=table.raw();
		System.out.println(data.get(1).get(1));
		
		driver.findElement(By.id("Email")).sendKeys(data.get(1).get(1));
		driver.findElement(By.id("next")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("Passwd")).sendKeys(data.get(2).get(1));

	}

	@Then("^User click the Submit button$")
	public void user_click_the_Submit_button() throws Throwable {
		driver.findElement(By.id("signIn")).click();
	}

	@Then("^System display Login Successfully$")
	public void systemdisplayLoginSuccessfully() throws Throwable {
		System.out.println("System display Login Successfully");
	}

	@And("^User click the LogOut button$")
	public void user_click_the_LogOut_button() throws Throwable {
		driver.findElement(
				By.xpath(".//*[@id='gbw']/div/div/div[2]/div[4]/div[1]/a/span"))
				.click();
		driver.findElement(By.xpath(".//*[@id='gb_71']")).click();
	}

	@Then("^System display LogOut Successfully$")
	public void system_display_LogOut_Successfully() throws Throwable {
		System.out.println("Welcome LogOut ");
	}

	@Then("^User click on the cross symbol to close the browser$")
	public void user_click_on_the_cross_symbol_to_close_the_browser()
			throws Throwable {
		driver.quit();
	}
}
