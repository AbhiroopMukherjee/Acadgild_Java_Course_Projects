package Multithreading1;

public class FindPrime extends Thread{ //Defining thread using thread class
	int num=0;
	boolean flag=false;
	
	FindPrime(int num){
		this.num=num;
	}
	
	public void run(){ //defining run method of the thread
		
		for(int i=2;i<num;i++){ //Finding whether the number is prime
			if(num%i==0){
				flag=true;
				break;
			}
		}
		if(flag==false){ //Displaying the result
			System.out.println("Number is prime");
		}else{
			System.out.println("Numner is not prime");
		}
	}
}

class FindPrimeRunnable implements Runnable{ //Defining thread using runnable interface
	int num=0;
	boolean flag=false;
	
	FindPrimeRunnable(int num){
		this.num=num;
	}
	
public void run(){ //defining run method of the thread
		
		for(int i=2;i<num;i++){
			if(num%i==0){
				flag=true;
				break;
			}
		}
		if(flag==false){ //displaying the result
			System.out.println("Number is prime");
		}else{
			System.out.println("Numner is not prime");
		}
	}

	
	

	public static void main(String[] args) {


		FindPrime f1=new FindPrime(29); //Creating object of thread class
		f1.start();
		
		FindPrimeRunnable f2=new FindPrimeRunnable(27); //Creating object of the 2nd thread
		new Thread(f2,"f2").start(); 

	}

	}
