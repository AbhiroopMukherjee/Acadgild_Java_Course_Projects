package Assignment_6_Arrays;

import java.util.Scanner;  

public class Task3 {

	public static void main(String[] args) {

// Initializing array with the names of the month
		String[] months= {"January","February","March","April","May","June","July","August","September","October","November","December"};

//Initializing array with the no of days
		int[] monthDays={31,28,31,30,31,30,31,31,30,31,30,31};

//User input of the month
		Scanner scan=new Scanner(System.in);  
		
		System.out.println("Which month you want to query about?");
		String month=scan.next();

//Displaying the number of days for the month
		for(int i=0;i<12;i++){
			if(month.equalsIgnoreCase(months[i])){
				System.out.println("No of days in month of "+months[i]+ " is:"+ monthDays[i] );
			}
		}
		
//Task4:- to find the number of days in the mentioned interval
		
		//Taking user input
		System.out.println("Enter to find no of days from Jan1 2017 to Month:");
		String month1=scan.next();
		System.out.println("date:");
		int date=scan.nextInt();
		System.out.println("year:");
		int year=scan.nextInt();
		
		
		int yearDiff= (year-2017)*365;
		
		int days=0;
		int totalDays=0;

		//Calculating the number of days in the interval
		for(int i=0;i<12;i++){
			days+=monthDays[i];
			if(month1.equalsIgnoreCase(months[i])){
				totalDays = (days+yearDiff+date)-(monthDays[i]+1);
			}
		}

		//Printing the result
		System.out.println("Total days:"+totalDays);
		
		scan.close();
		
	}

}
