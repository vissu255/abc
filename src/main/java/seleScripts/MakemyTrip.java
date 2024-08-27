package seleScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakemyTrip {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		Thread.sleep(2000);

		By lightBox = By.xpath("//span[@class='commonModal__close']");
		By flightButton = By.xpath("//li[@data-cy='menu_Flights']//span[@data-cy='item-wrapper']//a");
		By fromCity = By.xpath("//input[@id='fromCity']");
		By toCity = By.xpath("//input[@id='toCity']");
		By fromCityList = By.xpath("//div[@class='flt_fsw_inputBox searchCity inactiveWidget activeWidget']//p");
		By toCityList = By.xpath("//div[contains(@class, 'flt_fsw_inputBox searchToCity inactiveWidget')]//li//p");
		By fromDatePicker = By.xpath("//div[@class='datePickerContainer']//div//p");
		By returnDateInputBox = By.xpath("//div[contains(@class, 'flt_fsw_inputBox dates reDates inactiveWidget')]  ");
		By returnDatePicker = By.xpath("//div[contains(@class, 'DayPicker-Month')][2]//div//p");

		Thread.sleep(2000);

		getElement(lightBox).click();

		Thread.sleep(2000);
		getElement(flightButton).click();
		Thread.sleep(5000);

		Actions act = new Actions(driver);
		act.moveToElement(getElement(fromCity)).click().perform();
		Thread.sleep(5000);

		getElementsListAndClick(fromCityList, "Chhatrapati Shivaji International Airport");

		Thread.sleep(10000);

		Actions action = new Actions(driver);
		action.moveToElement(getElement(toCity)).click().build().perform();

		Thread.sleep(5000);

		getElementsListAndClick(toCityList, "Bengaluru International Airport");

		Thread.sleep(10000);

		getElementsListAndClick(fromDatePicker, "17");
		Thread.sleep(5000);

		Actions actRt = new Actions(driver);
		actRt.moveToElement(getElement(returnDateInputBox)).click().perform();
         Thread.sleep(10000);
		getElementsListAndClick(returnDatePicker, "19");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void sendKeys(By locator, String keys) {
		getElement(locator).sendKeys(keys);
	}

	public static void getElementsListAndClick(By locator, String expValue) {
		List<WebElement> eleList = getElements(locator);
		for (WebElement d : eleList) {
			String txt = d.getText();
			System.out.println(txt);
			if (d.getText().contains(expValue)) {
				d.click();
				break;
			}
		}
	}
}
