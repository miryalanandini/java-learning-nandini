package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDemo {

	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver","C:\\Users\\KSPL\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.findElement(By.id("userName")).sendKeys("Nandini");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.id("userEmail")));
	
		driver.findElement(By.id("userEmail")).sendKeys("nandini@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("nandini@gmail.com");
		driver.findElement(By.id("permanentAddress")).sendKeys("nandini@gmail.com");
		js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.id("submit")));
		driver.findElement(By.id("submit")).click();
		

	}

}
