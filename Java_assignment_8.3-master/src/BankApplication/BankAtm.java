package BankApplication;

//Exception class defined to handle user defined exception
class MyException extends Exception { 
	
	MyException () {
		
		System.out.println("Please Check Balance. \n The balance is either below 10,000 or there's not enough balance to withdraw");
		
	} 	
	
}

//BankAtm class defined with all methods 
public class BankAtm {

	
	int atmId;
	String bankName;
	String location;
	double balance;
	
	//Constructor defined
	BankAtm(int id,String bank,String loc,double bal){
		atmId = id;
		bankName=bank;
		location=loc;
		balance=bal;
	}
	
//Applying method with synchronized	
	public synchronized void withdraw(double amt) throws MyException {
		
		if(balance<10000 || (balance-amt)<0){
			throw new MyException (); 
		}
		else {
			balance-=amt;
			System.out.println("Please collect the amount. \n Your current balance is:"+balance);
		}
		
	}
	//Applying method with synchronized		
	public synchronized void deposit(double amt){
		
		balance+=amt;
		System.out.println("Balance deposited. \n Current balance is:"+balance);
	}
	
	public void balance(){
		System.out.println("Current balance is:"+balance);
	}


}