package day7_SeleniumLocatorsAssertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators {

//	Go to: https://demoqa.com/webtables
//		Automate:
//		Get Department of "Alden" using following-sibling
//		Get Salary of "Kierra" using contains() + following-sibling
//		Get the full row of "Cierra" using ancestor::div	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KSPL\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		System.out.println("Kierra age: " + driver.findElement(By.xpath("//*[contains(text(),'Cierra')]/following-sibling::div[4]")).getText());
		System.out.println("Alden detartment: " + driver.findElement(By.xpath("//*[contains(text(),'Alden')]/following-sibling::div[5]")).getText());
		System.out.println("Comple row: " + driver.findElement(By.xpath("//*[contains(text(),'Cierra')]/ancestor::div[@role='row']")).getText());
		driver.quit();
		
	}
}