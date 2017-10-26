package databaseApp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance=0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	
	//Constructor: prompt user to enter students' names and years
	public Student(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student grade year: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
		System.out.println(firstName + lastName + gradeYear +" "+ studentID);

		
		
		
	}
	
	//Generate student ids, first digit is school year. 5 digits in total
		private void setStudentID(){
			id++; // when create a new student, increment his or her id by one
			studentID = Integer.toString(gradeYear)+id;
		}
	
	//Enroll in courses
		public void enroll(){
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals( "Q") && !course.equals( "q")){
				courses = courses + "\n  " + course;
				tuitionBalance +=costOfCourse;
			}
			else {break;}
		} while(true);
			System.out.println("Enrolled in: " + courses);
		}
	
	//View balance
		public void viewBalance(){
			System.out.println("Your balance is $" + tuitionBalance);
			
		}
	
	//Pay tuition
		public void payTuition(){
			viewBalance();
			System.out.println("Enter your payment: $");
			Scanner in = new Scanner(System.in);
			int payment = in.nextInt();
			tuitionBalance = tuitionBalance - payment;
			System.out.println("Thank you for your payment of $"+payment);
			viewBalance();
			
		}
	
	//Show status (print infos)
		public String showInfo(){
			return "Name: " +firstName +" "+ lastName +
					"\nGrade level: " + gradeYear +
					"\nStudent ID: " + studentID +
					"\nCourses enrolled: " + courses +
					"\nBalance:$" +tuitionBalance;
		}
}
