package day8;

import org.testng.annotations.Test;

public class PriorityExample {
	@Test(priority=1)
	public void loginTest() {
		System.out.println("Testing Login");
	}
	@Test(priority =3)
	public void searchTest() {
		System.out.println("Search");
	}
	@Test(priority = 2)
	public void logoutTest() {
		System.out.println("Logout");
	}
}
