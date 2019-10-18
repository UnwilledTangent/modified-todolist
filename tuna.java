package test;

public class tuna {
	private int hour = 1;
	private int minute = 2;
	private int second = 3;
	
	// without using "this", the program below will look at the instance variable instead of the local variable
	// using "this", the program below will look at the local variable instead of the instance variable
	
	// instance variable is the variable at the top
	// instance variable is a variable inside of a class, but outside of the class methods
	public void setTime(int h, int m, int s) {
		hour = h;
		minute = m;
		second = s;
	}
	
	public String toMilitary() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	public String toString() {
		return String.format("%d:%02d:%02d %s", ((hour==0||hour==12)?12:hour%12), minute, second, (hour < 12?"AM":"PM"));
	}
}
