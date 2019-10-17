package test;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
//		Lesson 14: Using Multiple Classes
//		
//		anytime you run a java program, it looks for main as the first thing
//		
//		tuna is a class
//		tunaObject is an object
//		tuna tunaObject = new tuna();
//		
//		uses the method simpleMessage() inside tunaObject
//		tunaObject.simpleMessage();
//		
//		Lesson 15: Methods with Parameters
//		Scanner input = new Scanner(System.in);
//		tuna tunaObject = new tuna();
//		System.out.println("Enter your name here: ");
//		String name = input.nextLine();
//		
//		tunaObject.simpleMessage(name);
		
		// Lesson 16: Many Methods and Instances
		
//		Scanner input = new Scanner(System.in);
//		tuna tunaObject = new tuna();
//		System.out.println("Enter name of first gf here: ");
//		String temp = input.nextLine();
//		tunaObject.setName(temp);
//		tunaObject.saying();
		
		// Lesson 17: Constructors
		// Constructors allows us to initialise variables as soon as we create an object
		
		tuna tunaObject = new tuna("Pokemon");
		tuna tunaObject2 = new tuna("Nicole");
		
		tunaObject.saying();
		tunaObject2.saying();
	}
}
