package interviewQuestions;

import java.io.IOException;
import java.util.Scanner;

import org.testng.annotations.Test;

import base.Config;

public class Answer1 extends Config {
	
	@Test
	public void Answer() throws IOException {
	
		System.out.println("Please enter file name Dictionary.txt below, which is placed in the eclipse user.dir folder for this project");
		Scanner path=new Scanner(System.in);
		String p =path.next();
		doesfileExist(p);
		readFile(p);
		path.close();
		
	}
	
}
