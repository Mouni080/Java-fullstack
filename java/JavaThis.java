package com.mouni;

public class JavaThis {
	String name;
	JavaThis(String name){
		this(10,20);
		this.name = name;
		this.greeting();
	}
	JavaThis(int a, int b) {
		System.out.println("Sum: " + (a+b));
		
	}
		void greeting() {
		System.out.println("Welcome " + name);
		
	}
	

	public static void main(String[] args) {
		JavaThis obj = new JavaThis("Mouni");

	}

}
