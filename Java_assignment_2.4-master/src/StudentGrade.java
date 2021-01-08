// Learning of  Control Structures/Loops and Conditional statements

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
		
		System.out.println("Enter your age"); // User enters age
		int age=s.nextInt();
		
		System.out.println("Enter your marks"); // User enters marks
		int marks=s.nextInt();
		
		if (age>=0 && age<15){ // Condition decides grade for valid users younger than 15 years 
			
			
			if (marks>=60 && marks<=100){
				System.out.println("You have got Grade A");
			}
			else if (marks>45 && marks<=60){
				System.out.println("You have got Grade B");
			}
			else if (marks>=0 && marks<=45){
				System.out.println("You have got Grade C");
			}
			else {
				System.out.println("Enter valid marks please");
			}
		}
       if (age>=15 && age<60){  // Condition decides grade for valid users older or same age of 15 years 
			
			
			if (marks>70 && marks<=100){
				System.out.println("You have got Grade A");
			}
			else if (marks>60 && marks<=70){
				System.out.println("You have got Grade B");
			}
			else if (marks>=0 && marks<=60){
				System.out.println("You have got Grade C");
			}
			else {
				System.out.println("Enter valid marks please");
			}
       }
       
       s.close();
	}

}
