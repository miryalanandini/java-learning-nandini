package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.chrome.driver","C:\\Users\\KSPL\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//*[@id='frame1Wrapper']")));
	//	driver.findElement(By.xpath("//*[@id='sampleHeading']")).getText();
		driver.switchTo().frame(driver.findElement(By.id("frame1")));
		System.out.println(driver.findElement(By.xpath("//*[@id='sampleHeading']")).getText());
	//	driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("frame2")));
		System.out.println(driver.findElement(By.xpath("//*[@id='sampleHeading']")).getText());
		
	}

}
