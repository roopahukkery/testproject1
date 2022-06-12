package digiboxx.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage {

	// swati's way
	/*
	 * public Boolean EnterLoginDetails() { element("Digispacename").sendKeys("");
	 * return null;
	 * 
	 * }
	 */

	public WebDriver driver;

	public loginPage(WebDriver driver) {
		// super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "workspace")
	WebElement Digispacename;

	@FindBy(id = "Username")
	WebElement Email;

	@FindBy(id = "Password")
	WebElement password;

	@FindBy(className = "start-btn")
	WebElement loginButton;

	public void setspaceName(String spaceName) {
		Digispacename.clear();
		Digispacename.sendKeys(spaceName);
	}

	public void addEmail(String addemail) {
		Email.clear();
		Email.sendKeys(addemail);
	}

	public void addPassword(String Password) {
		password.clear();
		password.sendKeys(Password);
	}

	public void clicksignin1() {
		loginButton.click();
	}

	// Actual Methods for logic
	// -------------------------------------------------------------------------------------------------------------//
	public boolean validateurl() {

		WebDriverWait wait = new WebDriverWait(driver, 60);
		return wait
				.until(ExpectedConditions.visibilityOf(driver.findElement(
						By.xpath("/html/body/app-root/main/app-dgb-login/article/div/div[2]/div/div[2]/h2"))))
				.isDisplayed();

	}

	public void enterusername() {
		setspaceName("mozark14");
	}

	public void addemail() {
		addEmail("mozark14251093@gmail.com");
	}

	public void addpassword() {
		addPassword("Gaurav@123");

	}

	public void clicksignin() {
		clicksignin1();

	}

	public void checkhomepage() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 400);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("add-btn"))).click();

		driver.findElement(By.className("text-box-wrap")).click();

		try {
			Runtime.getRuntime().exec("C:\\Roopa_Practice\\DigiBoxx_UploadControl.exe");
			Thread.sleep(3000);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
