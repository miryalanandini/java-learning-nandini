package day8;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LifecycleExample {
    @BeforeMethod
	public void launchBrowser() {
		System.out.println("Launch Browser");
	}
    @AfterMethod
    public void closeBrowser() {
    	System.out.println("Close Browser");
    }
    @BeforeClass
    public void startclass() {
    	System.out.println("Before class");
    }
    @AfterClass
    public void endclass() {
    	System.out.println("After class");
    }
    @Test
    public void method1() {
    	System.out.println("This is actual method");
    }
    @Test
    public void method2() {
    	System.out.println("This is 2nd method");
    }
}
