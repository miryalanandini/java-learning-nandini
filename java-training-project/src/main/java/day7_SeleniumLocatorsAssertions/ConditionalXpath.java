package day7_SeleniumLocatorsAssertions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class ConditionalXpath {
//Kierra has a salary > 2000. Based on her salary, locate her email and department.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KSPL\\Downloads\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		String salary = driver.findElement(By.xpath("//*[contains(text(),'Kierra')]/following-sibling::div[4]")).getText();
		int num = Integer.parseInt(salary);
		if(num >2000) {
			System.out.println("Email: " + driver.findElement(By.xpath("//*[contains(text(),'Kierra')]/following-sibling::div[3]")).getText());
			System.out.println("Email: " + driver.findElement(By.xpath("//*[contains(text(),'Kierra')]/following-sibling::div[5]")).getText());
		}else{
			System.out.println("No data");
		}driver.quit();
		
	}

}
