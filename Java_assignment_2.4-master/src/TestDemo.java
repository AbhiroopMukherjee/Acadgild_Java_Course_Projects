// Learning of  Control Structures/Loops and Conditional statements

import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a number"); //User enters a number 
		
		int num=s.nextInt();
		
		if (num == 0){ // Checks if number is negative, positive or zero.
			System.out.println("You Have Entered Zero");
		}
		if (num >0){
			System.out.println("You Have Entered Positive Value");
		}
		if (num <0){
			System.out.println("You Have Entered Negative Value");
		}
		
		s.close();

	}

}
