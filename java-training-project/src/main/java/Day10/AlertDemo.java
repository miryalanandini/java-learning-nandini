package Day10;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.chrome.driver","C:\\Users\\KSPL\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.id("alertButton")));
		driver.findElement(By.id("alertButton")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.id("timerAlertButton")));
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.id("confirmButton")));
		driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert().dismiss();
		js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.id("confirmResult")));
		System.out.println(driver.findElement(By.xpath("//*[@id='confirmResult']")).getText());
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(3000);

		driver.switchTo().alert().sendKeys("Nandini12");
		driver.switchTo().alert().accept();
		 String promptResult = driver.findElement(By.id("promptResult")).getText();
		Assert.assertEquals(promptResult, "You entered Nandini", "Prompt alert result mismatch");
	}

}
