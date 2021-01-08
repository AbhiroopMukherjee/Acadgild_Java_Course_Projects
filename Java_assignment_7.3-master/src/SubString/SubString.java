package SubString;

import java.util.Scanner;

public class SubString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String str = "Acadgild"; //initializing the screen
		int flag=0;
		int size= str.length();
		
     
		Scanner scan = new Scanner(System.in); //Taking the substring frm the user
		System.out.println("Enter any part of the password");
		String pass = scan.nextLine();
		int size1= pass.length();
		
		
	//Checkn if the substring is the part of the man string	
		for (int i=0;i<(size-size1);i++){
		
			if(str.charAt(i)==pass.charAt(0)){
				for(int k=0;k<size1;k++){
					if(str.charAt(i+k)==pass.charAt(k)){
						flag++;
					}
				}
				
			}
		}
		//Displaying the result
		if (flag==size1){
			System.out.println("Key found");
		}
		else{
			System.out.println("Key not found");
		}
		

	}

}
