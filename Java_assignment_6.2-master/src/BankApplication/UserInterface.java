package BankApplication;

//Defining the user interface class with the main method where classes are instantiated and methods are checked
public class UserInterface {

	public static void main(String[] args)  {
		
		try{
			BankAtm Anil = new BankAtm(1234,"ICICI","bangalore",30000.00);

			Anil.withdraw(15000);
			Anil.withdraw(10000);
			Anil.withdraw(2000);
		} catch (MyException e) {
			System.out.println("Invalid request");
		}
		
		try{
			BankAtm Abhi = new BankAtm(1234,"ICICI","bangalore",20000.00);
			Abhi.withdraw(15000);
			Abhi.withdraw(2000);
			
		} catch (MyException e) {
			System.out.println("Invalid request");
		}
		
		try{
			BankAtm Ankur = new BankAtm(1234,"ICICI","bangalore",40000.00);
			Ankur.withdraw(15000);
			Ankur.withdraw(2000);
		} catch (MyException e) {
			System.out.println("Invalid request");
		}
				
			
		
	}

}
