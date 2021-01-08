package BankApplication;

public class UserInterface {

	public static void main(String[] args) throws InterruptedException  {

		//Creating object of BankAtm
			BankAtm Anil = new BankAtm(1234,"ICICI","bangalore",30000.00);

			//Creating 1st thread to withdraw
				Thread t1 = new Thread(new Runnable()
						{
							public void run(){
								//Handling user-defined Myexception
										try {
											Anil.withdraw(1500);
										} catch (MyException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
							}
						});

				//Creating 2nd thread to withdraw
			Thread t2=new Thread(new Runnable(){
				public void run(){
					//Handling user-defined Myexception
						try {
							Anil.withdraw(1500);
						} catch (MyException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
			});
			
			t1.start(); //Starting 1st thread
			t2.start(); //Starting 2nd thread
			t1.join(); //Using join method in order to wait till the thread gets over
			t2.join();
			
			Anil.balance();
		
}}