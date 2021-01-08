package Assignment_6_Arrays;

public class Task1 {

	public static void main(String[] args) {
		
		
		int[] Array1 = new int[10]; //Initializing array of size 10
		
		for (int i=0;i<10;i++){ //Storing elements in the array
			Array1[i] = i;
		}
		
		for (int i=0;i<10;i++){ //Printing only the even numbers
			if (Array1[i]%2==0){
				System.out.println(Array1[i]);
			}
		}
		
	}

}
