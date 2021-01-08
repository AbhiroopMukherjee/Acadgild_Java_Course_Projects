package Multithreading;

import java.util.Scanner;

public class Timer extends Thread{ //Creating timer class thread
	
	int time=0;
	Timer(int t){ //Initializing timer using the constructor 
		time=t;
	}
	public void run(){ //defining the run method of the thread
		
		for(int i=time;i>0;i--){ //Implementing the counter
			System.out.println(i+" seconds to go");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Countdown has ended"); //Prints as the counter ends
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); //Taking user input for the counter
		System.out.println("Set timer to seconds:");
		int time=scan.nextInt();
		
		Timer t1=new Timer(time); //Instantiating the thread and starting it
		t1.start();
		
		scan.close();

	}

}
