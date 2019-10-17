package test;

public class tuna {
	// public means anyone can use it
	// void means this method is gonna do something, but it is not gonna return any data
	// private means only the methods inside the class can use it
	
	// whenever you have a variable that is outside of methods, but it's inside of a class, it is called an instance variable
	// for example, private String girlName is called an instance variable
	private String girlName;
	
	// a constructor method has to have the same name as the class
	public tuna(String name) {
		girlName = name;
	}
	
	public void setName(String name) {
		girlName = name;
	}
	
	public String getName() {
		return girlName;
	}
	
	public void saying() {
		System.out.printf("Your first gf was %s\n", getName());
	}
}
