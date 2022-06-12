package digiboxx.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadFilepage {

	public static void clickAddbutton() {
		WebDriverWait wait = new WebDriverWait(driver, 400);
		wait.until( ExpectedConditions.visibilityOfElementLocated(By.className("add-btn"))).click();
			
	}

	public static void clickUploadFile() {
		driver.findElement(By.className("text-box-wrap")).click();
		
		
	}

	public static void goToDesktop() {
		
		
	}

	public static void selectFolder() {
		
		
	}

	public static void selectImage() {
		
		
	}

	public static void openImage() {
		
		
	}

}
