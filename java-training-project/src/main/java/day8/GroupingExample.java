package day8;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupingExample {
	@Test(groups = {"smoke"})
	public void launchBrowser() {
		System.out.println("Launch Browser");
	}
	
	@Test(groups = {"regression"})
    public void closeBrowser() {
    	System.out.println("Close Browser");
    }
	@Test(groups = {"smoke"})
    public void startclass() {
    	System.out.println("Before class");
    }
    @Test(groups = {"regression"})
    public void endclass() {
    	System.out.println("After class");
    }
    @Test(groups = {"smoke"})
    public void method1() {
    	System.out.println("This is actual method");
    }
}
