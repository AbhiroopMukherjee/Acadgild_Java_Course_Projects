//// Objective is to learn  conditional statements.
import java.util.Scanner;

public class highestnumber {

	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in); // Scans for the entered numbers from user
		
		System.out.println("Enter three numbers");
		
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		if (a>b && a>c){
			System.out.println("Highest number is "+a);
		}
		if (b>a && b>c){
			System.out.println("Highest number is "+b);
		}
		else{
			System.out.println("Highest number is "+c);
		}
		
		s.close();

}
}
