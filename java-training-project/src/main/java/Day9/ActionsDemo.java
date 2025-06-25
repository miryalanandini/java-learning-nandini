package Day9;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class ActionsDemo {

	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver","C:\\Users\\KSPL\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/menu");
		driver.manage().window().maximize();
		Actions  action = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//*[contains(text(),'Main Item 2')]")));
		action.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Main Item 2')]"))).perform();
		List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'Main Item 2')]/following-sibling::ul/li/a"));
		for(WebElement l : list) {
			System.out.println(l.getText());
		}
		 WebElement subSubList = driver.findElement(By.xpath("//*[contains(text(),'Main Item 2')]/following-sibling::ul/li/a[contains(text(),'SUB SUB LIST')]"));
	        action.moveToElement(subSubList).click().perform();
	        WebElement subSubList1 = driver.findElement(By.xpath("//*[contains(text(),'Main Item 2')]/following-sibling::ul/li/a[contains(text(),'SUB SUB LIST')]/following-sibling::ul/li/a[contains(text(),'Sub Sub Item 1')]"));
	        action.moveToElement(subSubList1).click().perform();
	
	}

}
