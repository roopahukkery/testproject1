package digiboxx.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import QA.properties;
//include qa properties area path
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public static WebDriver driver;

	// loginPage lpage;

	public WebDriver BasePage(WebDriver driver) {

		System.setProperty("webdriver.chrome.driver", "C:\\Roopa_Practice\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://apptest.digiboxx.com/login");
		// lpage = new loginPage(driver);
		// DetermineBrowser("chrome");
		
		return driver;
	}

	public void DetermineBrowser(String browserName) {
		switch (browserName) {
		case "firefox":
			// code to system props and instantiate the driver
			break;
		case "chrome":
			// code to system props and instantiate the driver
			break;
		}

	}

}
