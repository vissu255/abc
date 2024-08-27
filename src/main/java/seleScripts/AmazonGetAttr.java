package seleScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonGetAttr {
static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		By linksList = By.tagName("a");
		By imageList =By.tagName("img");
		
		getElementsList(linksList);
		getElementsList(imageList);
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static void getElementsList(By locator ) {
		List<WebElement> eleList = getElements(locator);
		for(WebElement e: eleList) {
			String txt = e.getAttribute("href");
			System.out.println(txt);
		}
	}
}


