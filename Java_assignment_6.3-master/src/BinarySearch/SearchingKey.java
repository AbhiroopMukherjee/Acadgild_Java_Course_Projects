package BinarySearch;

public class SearchingKey {
	
//Defining method where key, data array and the size of the array are passed from the main calls.
	    public static boolean binarySearch(int key,int[] data,int size) 
	    {
	         int low = 0;
	         int high = size - 1;
	          
	        while(high >= low) {
	             int middle = (low + high) / 2;
	             if(data[middle] == key) {
	                 return true;
	             }
	             if(data[middle] < key) {
	                 low = middle + 1;
	             }
	            if(data[middle] > key) {
	                high = middle - 1;
	             }
	       }
	       return false;
	   }

	public static void main(String[] args) {

//Array and its size are initialized
		int[] data= {10,20,30,44,55,67,87,90};
		int size = 8;
		
//Method is called and the result is stored		
		boolean result = binarySearch(67,data,size);
//Result is printed to the console		
		if (result==true){
			System.out.println("Key found");
		}
		else if (result==false){
			System.out.println("Key not found");
		}
		

	}

}
