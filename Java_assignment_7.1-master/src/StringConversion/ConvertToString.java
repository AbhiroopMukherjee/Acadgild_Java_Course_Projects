package StringConversion;

import java.util.Scanner;

public class ConvertToString {

	public static void main(String[] args) {

		//Taking user input of an integer
		Scanner reader = new Scanner(System.in); 
		
		System.out.println("Enter a number:");
		int num = reader.nextInt();
		
		//Displaying the number feeded
		System.out.println("Entered number is:"+num+ " and is of datatye"+ ((Object)num).getClass().getName());
		
		//Converting the num to string
		String str = Integer.toString(num);
		System.out.println("Converted to String");
		
		//Displaying the string along with datatype
		System.out.println("Entered number is:"+num+ " and is of datatye"+ str.getClass().getName());

		reader.close();
	}

}
