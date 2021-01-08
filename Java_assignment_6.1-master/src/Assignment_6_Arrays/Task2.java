package Assignment_6_Arrays;

public class Task2 {

	public static void main(String[] args) {
        int[] Array2={2,3,5,7,11,13,17,19,23,29}; //Initializing array of size 10 with prime numbers
		
		int[] Array3 = new int[10]; //Initializing another array
		
		for (int i=9;i>=0;i--){ //Storing into another array in reverse order
			Array3[i]= Array2[9-i];
		}
		
		for (int i=0;i<10;i++){ //Printing the elements of the 2nd array
			System.out.println(Array3[i]);
		}
		
		
		

	}

	}


