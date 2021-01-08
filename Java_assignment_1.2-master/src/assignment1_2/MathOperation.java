package assignment1_2;

public class MathOperation {

	public static void main(String[] args) {
		int a=20, b=10;
		
		b= a-- - --a;
		System.out.println("b is "+ b);
		
		int c=a--;
		System.out.println("c is " + c);
		
		int d=a>>2;
		System.out.println("d is "+ d);
		
		int e=a&b;
		System.out.println("e is "+ e);

	}

}
