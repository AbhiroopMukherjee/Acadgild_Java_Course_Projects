//  Concepts:- Inheritance , Method Overriding , super keyword 

class C {
	void test(){
		System.out.println("In class C");
	}
}

 class B extends C {
	void test(){
		//super.test()
		System.out.println("In class B");
		
	}
}

public class A extends B {
	
	void test(){
		super.test();
		System.out.println("In class A");
	}

	public static void main(String[] args) {
		A ob= new A();  //It is not possible to invoke test() method defined in C from a method in A until a super.test() is mentioned in class B as well.
		ob.test();

	}

}
