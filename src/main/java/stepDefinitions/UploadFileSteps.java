package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import digiboxx.pages.UploadFilepage;

public class UploadFileSteps {
	
	@Given("^go to add button$")
	public void go_to_add_button() {
		UploadFilepage.clickAddbutton();
	}

	@Then("^click on upload file$")
	public void click_on_upload_file(){
		UploadFilepage.clickUploadFile();
	}

	@When("^click on desktop$")
	public void click_on_desktop() {
		UploadFilepage.goToDesktop();
	}

	@When("^click on folder$")
	public void click_on_folder() {
		UploadFilepage.selectFolder();
	}

	@When("^click on image$")
	public void click_on_image() {
		UploadFilepage.selectImage();
	}

	@Then("^click on open$")
	public void click_on_open() {
		UploadFilepage.openImage();
	}


}
