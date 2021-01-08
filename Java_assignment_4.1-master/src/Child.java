//Concepts:- Inheritance, method overloading, Access specifiers.


class Parent{ 
	private void method1(){        
		System.out.println ("Parent's method1()");  
		}    
	public void method2() {      
		System.out.println ("Parent's method2()");  
		this.method1();  
		}  
	} 


public class Child  extends Parent {

	 public void method1()  {       
		 System.out.println ("Child's method1()");  
		 }
	 
	public static void main(String[] args) {
		Parent p = new Child();   
		p.method2();  //Calls parent class's method2 which internally calls its method1. This hows the child class has inherited the parent's class methods.
	}
}


