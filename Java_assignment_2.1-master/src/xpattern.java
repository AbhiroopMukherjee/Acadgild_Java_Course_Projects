// Objective is to learn  Loops and nested loops. 
public class xpattern {

	public static void main(String[] args) {
		
	
		
		for (int i=0;i <=6;i++){  //This loop is for number of lines and spaces and underscores
			System.out.println("");
			for (int j=0;j<=6;j++){  // This loop is for astrik's and break for spaces and underscores
				if (i==j){ //This conditional statement prints till 4th line
					System.out.print("*"); 
					if (i>=3){
						break;
					}
					continue;
				}
				if (j==(6-i)){ //This conditional statement prints from 4th line to 6th line
					System.out.print("*");
					if((6-i)>3){
						break;
					}
					continue;
					}
				System.out.print("_");
			}
		}

	}

}
