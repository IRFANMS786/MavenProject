package basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstClss {
	@Test
	public static void print() {
		System.out.println("TestNg.....");
	}

	@BeforeClass
	public static void welcome() {
		System.out.println("Welcome...");
	}
	@AfterClass
	public static void bye() {
		System.out.println("Bye...");
	}
}
