package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String department;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private int defaultPasswordLength = 8;
	private String companySuffix = "NotreDame.edu";
	
	//constructor to receive names
	public Email (String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = setDepartment();
	    this.password = randomPassword(defaultPasswordLength);
	    email = firstName.toLowerCase() + "."+lastName.toLowerCase()+'@'+department +"."+ companySuffix;
	    
		//System.out.println(firstName +' ' + lastName + "'s department is "+department + " password is " + password + "\n" + email);

	}
	// Ask for department
	private String setDepartment (){
		System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice ==1) return "sales";
		else if(depChoice ==2) return "dev";
		else if(depChoice ==3) return "acct";
		else return "";
		
	}
		
	
	//generate random password
	private String randomPassword(int length){
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for(int i = 0; i<length; i++){
			password[i]= passwordSet.charAt((int)(Math.random()*passwordSet.length()));
		}
		return new String(password);
		
	}
	//set the mailbox capacity
	public void setMailboxCapacity (int capacity){
		this.mailboxCapacity = capacity;
	}
	//set the alternate email
	public void setAlternateEmail(String altEmail){
		this.alternateEmail = email;
	}
	
	//change the password
	public void changePassword (String password){
		this.password = password;
	}
	public int getMailboxCapacity(){
		return mailboxCapacity;
	}
	public String getAlternateEmail(){
		return alternateEmail;
	}
	public String getPassword(){
		return password;
	}
	public String showInfo(){
		return "Display Name: " + firstName + ' ' + lastName + ' '+ 
				"\nCompany Email: " + email + ' '+ 
				"\nMailbox Capacity: " + mailboxCapacity;
	}
}
