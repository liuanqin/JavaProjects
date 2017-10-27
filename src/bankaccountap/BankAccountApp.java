package bankaccountap;

import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) throws FileNotFoundException{
		//Testing purpose
		/*
		Checking check1 = new Checking("name", "ajskajda",1000);
		Savings sav1 = new Savings("Jason", "292430", 2500);
		sav1.showInfo();
		check1.showInfo();
		sav1.compound();
		*/
		
		//read a csv file then create new accounts based on that data
		String file = "/Users/Jason/Documents/Web search class/JavaProjects/bankAccount.csv";
		List<String[]> newCustomers = utilities.ReadCSV.read(file);
		
		List<Account> accounts = new LinkedList<>();
		
		for(String[] accountHolder : newCustomers){
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			
			if(accountType.equals("Savings")){
				//System.out.println("Open a savings account");
				accounts.add(new Savings(name,sSN,initDeposit)); 
			} else if (accountType.equals("Checking")){
				//System.out.println("Open a checking account");
				accounts.add(new Checking(name,sSN,initDeposit)); 

			} else {
				System.out.println("Wrong bank account type");
			}
			
		}
		for(Account acc : accounts){
			acc.showInfo();
		}
	}
}
