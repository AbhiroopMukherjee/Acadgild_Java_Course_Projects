package BankApplication;

//Defining the User defined exception class
class MyException extends Exception {
	
	MyException () {
		
		System.out.println("Please Check Balance. \n The balance is either below 10,000 or there's not enough balance to withdraw");
		
	} 	
	
}

//defining the class BankAtm
public class BankAtm {
	
	int atmId;
	String bankName;
	String location;
	double balance;

	//Initializing the constructor
	BankAtm(int id,String bank,String loc,double bal){
		atmId = id;
		bankName=bank;
		location=loc;
		balance=bal;
	}

//Defining the withdraw method with the exception
	public void withdraw(double amt) throws MyException {
		
		if(balance<10000 || (balance-amt)<0){
			throw new MyException (); 
		}
		else {
			balance-=amt;
			System.out.println("Please collect the amount. \n Your current balance is:"+balance);
		}
		
	}

//Defining the deposit method
	public void deposit(double amt){
		
		balance+=amt;
		System.out.println("Balance deposited. \n Current balance is:"+balance);
	}


}