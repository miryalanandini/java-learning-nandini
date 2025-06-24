package day7_SeleniumLocatorsAssertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//Open https://www.google.com
//Assert that page title is "Google"

public class TitleAssertionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KSPL\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Google", "❌ Title mismatch!");

	}

}
