package com.mouni;

public class Constructor {
	Constructor(String name) {
		System.out.println("Welcome " + name);
	}
	Constructor(int a , int b) {
		this("Mouni");
		System.out.println("Addition: " + (a + b));
	}
	Constructor(int n) {
		this(35,45);
		int fact = 1;
		for(int i = 1; i <= n; i++)
			fact = fact*i;
		System.out.println("Factorial : " + fact);
	}
	public static void main(String[] args) {
		Constructor obj1 = new Constructor(5);

	}

}
