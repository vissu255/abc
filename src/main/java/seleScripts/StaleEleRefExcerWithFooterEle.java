package seleScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleEleRefExcerWithFooterEle {

	public static void main(String[] args) throws InterruptedException{

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
        List<WebElement> footerList = driver.findElements(By.xpath("//footer//a"));
        
        for(int i=0; i<footerList.size();i++) {
        	footerList.get(i).click();
        	driver.navigate().back();
//        	String text = footerList.get(i).getText();
//        	System.out.println(text);
			Thread.sleep(2000);

        	footerList = driver.findElements(By.xpath("//footer//a"));
        }
	}

}
