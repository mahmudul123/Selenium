package TestScript;

import org.testng.annotations.Test;

public class prioritizeTests {

	
	@Test(priority=0)
	public void priority1Test() {
		System.out.println("This wilol run third");

	}
	
	@Test(priority=1)
	public void priority2Test() {
		System.out.println("This wilol run fourth");
	}
	
	@Test
	public void anoPriorityTest() {
		System.out.println("This will run alphabeticaly after priority. Default priority set as 0");
	}
	
	@Test
	public void bnoPriorityTest3() {
		System.out.println("This will run second");
	}
}
