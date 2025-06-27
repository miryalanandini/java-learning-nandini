package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
//🔗 https://demoqa.com/select-menu
//✔ Handle:
//Static dropdown: select "Blue"
//Dynamic dropdown: choose "Group 2, option 1"
//Multi-select: choose multiple values
public class DropdownDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KSPL\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		//static dropdowm
		Select s = new Select(driver.findElement(By.id("oldSelectMenu")));
		s.selectByValue("1");
		//Dynamic dropdown
       driver.findElement(By.xpath("//*[text()='Select One']/following::div[contains(@class,'css-2b097c-container')][1]")).click();

     driver.findElement(By.xpath("//div[@id='selectOne']//div[text()='Dr.']")).click();
		driver.findElement(By.id("withOptGroup")).click();
		driver.findElement(By.xpath("//div[@id='withOptGroup']//div[text()='Group 2, option 1']")).click();
		//multi dropdown
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//*[text()='Multiselect drop down']/following::div[contains(@class, 'css-2b097c-container')][1]")));
		driver.findElement(By.xpath("//*[text()='Multiselect drop down']/following::div[contains(@class, 'css-2b097c-container')][1]")).click();
		driver.findElement(By.xpath("//*[text()='Multiselect drop down']/following::div[contains(@class, 'css-2b097c-container')][1]/descendant::div[text()='Green']")).click();
		driver.findElement(By.xpath("//*[text()='Multiselect drop down']/following::div[contains(@class, 'css-2b097c-container')][1]/descendant::div[text()='Black']")).click();
		
		Select s1= new Select(driver.findElement(By.name("cars")));
		s1.selectByVisibleText("Saab");
		
	}

}
