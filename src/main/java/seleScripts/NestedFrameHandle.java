package seleScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		
		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("selenium");
		
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("java");
		
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("automation");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.findElement(By.id("inp_val")).clear();
		driver.findElement(By.id("inp_val")).sendKeys("testing");
		
	}

}
