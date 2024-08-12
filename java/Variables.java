package com.mouni;
//Types of variables in java
public class Variables {
	int b = 20; // Instance or object variable
	static int c = 30; //Static or class Variables
	public static void main(String args[]) {
		int a = 10;//Local Variable
		System.out.println("Local  variables : " +a);
		
	Variables obj = new Variables();
	System.out.println(obj.b);
	System.out.println(Variables.c);
		
	}

}
