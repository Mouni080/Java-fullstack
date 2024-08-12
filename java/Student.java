package com.mouni;
import java.util.*;
class Assignment {
	int roll_no;
	String student_name;
	int marks1;
	int marks2;
	int marks3;
	int marks4;
	int marks5;
	int avg_mark;

	Assignment(int roll_no, String student_name){
		this.roll_no = roll_no;
		this.student_name = student_name;
		
	}
	void getmarks() {
		Scanner sc = new Scanner(System.in);
	    int marks1 = sc.nextInt();
		int marks2 = sc.nextInt();
		int marks3 = sc.nextInt();

		int marks4 = sc.nextInt();

		int marks5 = sc.nextInt();

        avg_mark = marks1+marks2+marks3+marks4+marks5/5;
        System.out.println("Average marks :" + avg_mark);
		
	}
	void displaygrade() {
		Scanner s = new Scanner(System.in);
		int roll_no = s.nextInt();
		 System.out.println("Register number  :" + roll_no);
		String student_name = s.nextLine();
		 System.out.println("Name :" + student_name);
		}
}
public class Student {

	public static void main(String[] args) {
		Assignment ass = new Assignment(102,"Mouni");
		ass.getmarks();
		ass.displaygrade();


	}

}
