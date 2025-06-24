package day7_SeleniumLocatorsAssertions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GroupRecordCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     System.setProperty("webdriver.chrome.driver","C:\\Users\\KSPL\\Downloads\\chromedriver-win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://demoqa.com/webtables");
	     List<WebElement> email = driver.findElements(By.xpath("//*[@class='rt-tbody']/div/div/div[4]"));
	     List<String> emaillist = new ArrayList<>();
	     for(WebElement email1:email) {
	    	 
	    	 emaillist.add(email1.getText());
	     }
	     System.out.println(emaillist);
	     for(String c: emaillist) {
	    	 System.out.println("Validating: " + c);
	    	 Assert.assertTrue(c.contains("@"),  c +" is invalid");
	    	 
	    	 
	     }driver.quit();
	}

}
