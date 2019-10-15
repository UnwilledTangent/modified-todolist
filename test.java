package test;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		// Lesson 14: Using Multiple Classes
		
		// anytime you run a java program, it looks for main as the first thing
		
		// tuna is a class
		// tunaObject is an object
		//tuna tunaObject = new tuna();
		
		// uses the method simpleMessage() inside tunaObject
		//tunaObject.simpleMessage();
		
		// Lesson 15: Methods with Parameters
		Scanner input = new Scanner(System.in);
		tuna tunaObject = new tuna();
		System.out.println("Enter your name here: ");
		String name = input.nextLine();
		
		tunaObject.simpleMessage(name);
	}
}
