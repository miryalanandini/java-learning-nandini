package day7_SeleniumLocatorsAssertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Task 1: Locator Practice (LocatorPractice1.java)
//Go to: https://demoqa.com/text-box
//Automate:
//Enter Full Name, Email, Current Address, Permanent Address
//Click Submit
//Use the following locator strategies:
//id for Full Name
//name for Email (if available, else fallback to cssSelector)
//cssSelector for Address
//xpath for Submit button
public class LocatorPractice1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KSPL\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.id("userName")).sendKeys("Nandini Miryala");
		driver.findElement(By.cssSelector("input#userEmail")).sendKeys("nandi@gmail.com");
		driver.findElement(By.cssSelector("textarea#currentAddress")).sendKeys("Address");
		driver.findElement(By.cssSelector("textarea#permanentAddress")).sendKeys("Address");
		driver.findElement(By.xpath("//button[@id='submit']")).click();

	}

}
