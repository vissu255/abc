package seleScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
static WebDriver driver;
	public static void main(String[] args) {

        driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		
		sendKeys(emailId, "viswanathbuchi@gmail.com");
		sendKeys(password, "9347273161");
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

//	public static void sendKeys(By locator, String keys) {
//		driver.findElement(locator).sendKeys(keys);
//	}
	public static void sendKeys(By locator, String keys) {
		getElement(locator).sendKeys(keys);
	}
}
