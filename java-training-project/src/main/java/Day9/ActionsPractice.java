package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsPractice {

	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver","C:\\Users\\KSPL\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.id("doubleClickBtn")));
		a.doubleClick(driver.findElement(By.id("doubleClickBtn"))).perform();
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.id("rightClickBtn")));

		a.contextClick(driver.findElement(By.id("rightClickBtn"))).perform();
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//button[text()='Click Me']")));

			

	}

}
