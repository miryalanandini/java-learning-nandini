package Day10;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WindowHandlingDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.chrome.driver","C:\\Users\\KSPL\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.id("tabButton")));
		driver.findElement(By.id("tabButton")).click();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		System.out.println("Parent "+driver.getCurrentUrl());
		Set<String> allWindows = driver.getWindowHandles();
		for (String win : allWindows) {
		    if (!win.equals(parent)) {
		        driver.switchTo().window(win);
		        System.out.println("Child "+driver.getCurrentUrl());
		        
		        
		        System.out.println("Tab " + driver.findElement(By.id("sampleHeading")).getText());
		        
		        driver.close(); // close child
		    }
		}
		driver.switchTo().window(parent); 
		driver.findElement(By.id("windowButton")).click();
		
		Set<String> allopenwindows = driver.getWindowHandles();
		 Thread.sleep(1000);
		for(String win: allopenwindows) {
			if(!win.equals(parent)) {
				driver.switchTo().window(win);
				 Thread.sleep(1000);
				System.out.println(driver.getCurrentUrl()+" "+ driver.findElement(By.id("sampleHeading")).getText());
		        
		        driver.close(); // close child
			}
		}
			driver.switchTo().window(parent); 
			
			driver.findElement(By.id("messageWindowButton")).click();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(driver1 -> driver1.getWindowHandles().size() > 1);
			Set<String> allwindows1 = driver.getWindowHandles();
			System.out.println(allwindows1);
			//System.out.println("Parent "+driver.getCurrentUrl());
			for(String win: allwindows1) {
				if(!win.equals(parent)) {
					
				//	System.out.println("Child "+driver.getCurrentUrl());				
					driver.switchTo().window(win.trim());
					//System.out.println("Child "+driver.getCurrentUrl()); 
					System.out.println(driver.findElement(By.xpath("//body")).getText());
			        
			        driver.close(); // close child
			}
			
		}
			driver.quit();
	}

}
