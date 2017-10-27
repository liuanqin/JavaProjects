package bankaccountap;

public class Checking extends Account {

	// list properties specific to checking account
	int debitCardNumber;
	int debitCardPin;
	// constructor
	public Checking(String name, String sSN, double initDeposit){
		super(name, sSN, initDeposit);
		accountNumber ="2"+accountNumber;
		setDebitNumber();
	}
	
	// list specific methods
	private void setDebitNumber(){
		debitCardNumber = (int) (Math.random()*Math.pow(10, 12));
		debitCardPin = (int) (Math.random()*Math.pow(10, 4));
	}
	
	public void showInfo(){
		super.showInfo();
		System.out.println("Account Type: Checking.");
		System.out.println("Your checking account features: "+
						"\ndebit card number: " + debitCardNumber+
						"\ndebit card pin: " + debitCardPin
					);
	}

	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		rate = getBaseRate() * .15;
		
	}
}
