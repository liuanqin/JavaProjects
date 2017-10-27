package bankaccountap;

public abstract class Account implements IRate {
	
	// List common properties for savings and checking
	private String name;
	private String sSN;
	private double balance;
	static int index = 10000;
	protected String accountNumber;
	protected double rate;
	
	//constructor to set base properties and initialize the account
	public Account(String name, String sSN, double initDeposit){
		this.name = name;
		this.sSN = sSN;
		this.balance = initDeposit;
		
		this.accountNumber = setAccountNumber();
		setRate();
	}
	
	public abstract void setRate();
	// list common methods
	private String setAccountNumber(){
		String lastTwoOfSSN = sSN.substring(sSN.length()-2,sSN.length());
		int UniqueID = index++;
		int randomNumber = (int) (Math.random()*1000);
		return lastTwoOfSSN + UniqueID + randomNumber;
	}
	
	public void deposit(double amount){
		balance += amount;
		printBalance();
	}
	
	public void withdraw(double amount){
		balance -=amount;
		printBalance();
	}
	
	public void transfer(String toWhere, double amount){
		balance -=amount;
		printBalance();
	}
	public void printBalance(){
		System.out.println("Your balance is now: $"+balance);
	}
	
	public void compound(){
		double accuredInterest = balance *(rate/100);
		balance += accuredInterest;
		printBalance();
	}
	
	public void showInfo(){
		System.out.println(
				"\n*********************"+
				"\nName: " + name +
				"\nAccount number: " + accountNumber +
				"\nBalance: " + balance +
				"\nBase Rate: " + rate +"%"
				
				);
	}
}
