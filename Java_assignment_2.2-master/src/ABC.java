// Learning on  Loops and nested loops, type casting

public class ABC {
	public static void main(String[] args) {
		String abc = "abc";
		for(int i = 1 ; i <= 5 ; i++){ // Iterates till the 5th line
			
			if (i <= 5/2 + 1) {
				for (int j = 3; j >= 1; j--) { //iterates till the 3rd char
					if (i - j >= 0) {
						System.out.print(abc.charAt(i - j)); // Prints specific characters from the string
					} else {
						System.out.print(" ");
					}
				}
				for (int j = i; j > 1; j--) {
					System.out.print(abc.charAt(j - 2));
				} 
				
			}else{
				for (int j = 3;j >= 1; j--) { // iterates from 3rd to 6th char
					if (j - (5 - i) < 2) {
						System.out.print(abc.charAt(3 - j - 1));
					} else {
						System.out.print(" ");
					}
				}
				for (int j = 5 - i; j >=1 ; j--) {
					System.out.print(abc.charAt(j - 1));
				} 
			}
				

			System.out.println();
	}
	}

}
