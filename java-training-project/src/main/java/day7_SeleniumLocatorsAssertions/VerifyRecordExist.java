package day7_SeleniumLocatorsAssertions;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class VerifyRecordExist {
//Write a test that asserts the presence of an employee named “Alden” whose department is Compliance
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver","C:\\Users\\KSPL\\Downloads\\chromedriver-win32\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://demoqa.com/webtables");
     List<WebElement> names = driver.findElements(By.xpath("//*[@class='rt-tbody']/div/div/div[1]"));
     List<String> namelist = new ArrayList<>();
     for(WebElement name:names) {
    	 namelist.add(name.getText());
       
	} 
     System.out.println(namelist);
     for(String n :namelist) {
     if(n.equals("Alden")) {
		 String dept =driver.findElement(By.xpath("//*[contains(text(),'"+n+"')]/following-sibling::div[5]")).getText();
		 Assert.assertEquals(dept, "Compliance1", "Department mismatch for Alden");
		  
		 
	 }else {
		 System.out.println("Alden does not exist");
	 }
 
     }driver.quit();

}
}
