package ExceptionHandling;

import java.util.Scanner;


//Defining the user defined exception class
class NegativeAgeException extends Exception {
	
	NegativeAgeException () {
		
		System.out.println("Wow!!.. Ur not born yet!! ");
		
	} 	
	
}

//Defining the class with main method
public class WhatsUrAge {
// Defining the method where user inputted age is verified	
	public static void ageCheck(int age) throws NegativeAgeException{
		
		if (age<0){
			throw new NegativeAgeException (); 
		}
		
		else{
			System.out.println("your age is:"+age);
		}
		
	}

	public static void main(String[] args) {
//User input of the age is done and method is called		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Enter your age:");
		int age=scan.nextInt();
		
		try{
		ageCheck(age);
		
		}catch (NegativeAgeException e){
			System.out.println("Invalid age");
		}finally{
			scan.close();
		}
	}
}
