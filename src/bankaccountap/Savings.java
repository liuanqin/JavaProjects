package bankaccountap;

public class Savings extends Account {

	// list properties specific to savings account
	int safetyDepositID;
	int safetyDepositKey;
	//constructor
	public Savings(String name, String sSN, double initDeposit){
		super(name, sSN, initDeposit);
		accountNumber ="1"+accountNumber;
		setSafetyDepositBox();
	}

	// list specific methods
	private void setSafetyDepositBox(){
		safetyDepositID = (int)(Math.random()*1000);
		safetyDepositKey = (int)(Math.random()*10000);
	}
	
	public void showInfo(){
		super.showInfo();
		System.out.println("Account type: Savings.");
		System.out.println(
				"Your savings account features: " +
				"\nsafetyDepositID is: " + safetyDepositID +
				"\nsafetyDepositKey is: " + safetyDepositKey
				);
	}

	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		rate = getBaseRate()-0.25;
	}
}
