package digiboxx.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import QA.properties;
//include qa properties area path
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	static WebDriver driver;

	// create object of qaproperties like qaprop prop = new qaprop();
	// QAproperties prop = new QAproperties();
	public void getdigiboxxurl() {
		// read values from property file
		// eg: String readUrlPath = prop.getProperty("url"); // this reads url value
		// from properties file

		System.setProperty("webdriver.chrome.driver", "C:\\Roopa_Practice\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://apptest.digiboxx.com/login");// use readurlpath in get here

	}

	public boolean validateurl() {
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		//return wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//@[contains(text(),'step')]")))).isDisplayed();
		return wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("/html/body/app-root/main/app-dgb-login/article/div/div[2]/div/div[2]/h2")))).isDisplayed();
	}

	public void enterusername() {
		driver.findElement(By.id("workspace")).sendKeys("mozark14");

	}

	public void addemail() {
		driver.findElement(By.id("Username")).sendKeys("mozark14251093@gmail.com");

	}

	public void addpassword() {
		driver.findElement(By.id("Password")).sendKeys("Gaurav@123");

	}

	public void sighin() {
		driver.findElement(By.className("start-btn")).click();

	}

	public void checkhomepage() {

	}

}
