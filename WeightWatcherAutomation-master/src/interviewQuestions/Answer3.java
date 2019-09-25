package interviewQuestions;

import java.util.Scanner;

import org.testng.annotations.Test;

import base.Config;

public class Answer3 extends Config{

	@Test
	public void Answer(){
		
		System.out.println("Please enter the smallest position you are searching for below");
	
		Scanner position=new Scanner(System.in);
		String p =position.next();
		int p1= Integer.parseInt(p);
		int[] a= generateIncreasingRandoms(500, 1000);
		
		for(int randnumbers : a ) {
			System.out.println(randnumbers);
			
		}
		System.out.println("The "+p1+"th number is "+a[p1]);
		position.close();
	}
}
