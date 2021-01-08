package FindSubString;

import java.util.Scanner;

public class FindSubString {

	public static void main(String[] args) {
		String str = "Acadgild"; //Initializing the string
		
		Scanner scan = new Scanner(System.in); //Taking user input of the substring
		
		System.out.println("Enter any part of the password");
		String pass = scan.nextLine();
		
		boolean result = str.contains(pass);//Checking if the substring is part of the string

		//Printing the result
		if (result==true){
			System.out.println("Access granted");
		}
		else{
			System.out.println("Access denied");
		}
		
		scan.close();

	}

}
