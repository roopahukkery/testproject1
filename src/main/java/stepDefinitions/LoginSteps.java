package stepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import digiboxx.pages.loginPage;

public class LoginSteps {
	public WebDriver driver;
	loginPage lpage;
	// loginPage lpage = new loginPage(driver);

	public LoginSteps() {
		System.setProperty("webdriver.chrome.driver", "C:\\Roopa_Practice\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://apptest.digiboxx.com/login");
		lpage = new loginPage(driver);
	}

	@Given("^Verify the url$")
	public void verify_the_url_is_as_expected() {
		lpage.validateurl();
		// Assert.assertTrue(.isHomePageVisible();
	}

	@When("^enter space name$")
	public void enter_space_name() {
		lpage.enterusername();
	}

	@When("^enter email$")
	public void enter_email() {
		lpage.addemail();
	}

	@When("^enter password$")
	public void enter_password() {
		lpage.addpassword();
	}

	@When("^click on sighnin button$")
	public void click_on_sighnin_button() {
		lpage.clicksignin();
	}

	@Then("^display homepage$")
	public void display_homepage() throws Exception {

		lpage.checkhomepage();
	}

	// Upload files to test

}
