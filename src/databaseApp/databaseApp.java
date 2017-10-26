package databaseApp;

import java.util.Scanner;

public class databaseApp {
	public static void main(String[] args){
		//Student stu1 = new Student();
		//stu1.enroll();
		//stu1.payTuition();
		//System.out.println(stu1.showInfo());
		
		// ask how many new students to add
		System.out.println("Enter number of students to enroll: ");
		Scanner in = new Scanner(System.in);
		Student[] students = new Student[in.nextInt()];
		
		// create n new students
		for(int i = 0; i<students.length; i++){
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			System.out.println(students[i].showInfo());
		}
		
	}
}
