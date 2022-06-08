package stepDefinitions;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import digiboxx.pages.BasePage;

public class BaseSteps {
	BasePage loginpage = new BasePage();

	@Given("^go to url$")
	public void go_to_url() {
		loginpage.getdigiboxxurl();

	}

	@Then("^Verify the url$")
	public void verify_the_url_is_as_expected() {
	Assert.assertTrue(loginpage.validateurl());
		//Assert.assertTrue(.isHomePageVisible();

	}

	@When("^enter space name$")
	public void enter_space_name() {
		loginpage.enterusername();

	}

	@When("^enter email$")
	public void enter_email() {
		loginpage.addemail();
	}

	@When("^enter password$")
	public void enter_password() {
		loginpage.addpassword();

	}

	@When("^click on sighnin button$")
	public void click_on_sighnin_button() {
		loginpage.sighin();

	}

	@Then("^display homepage$")
	public void display_homepage() {
		loginpage.checkhomepage();

	}

}
