package bankaccountap;

public interface IRate {

	//write a method that returns the base rate
	default double getBaseRate(){
		return 2.5;
	}
}
