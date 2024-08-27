package seleScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithoutSelect {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		List<WebElement> countryList = driver.findElements(By.xpath("//select//option"));
		
		for(WebElement e : countryList) {
			String list =e.getText();
			System.out.println(list);
			if (e.getText().equals("India")) {
				e.click();
				break;
			}
		}
	}

}
