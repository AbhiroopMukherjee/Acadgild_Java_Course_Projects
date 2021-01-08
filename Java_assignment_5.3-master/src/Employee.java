// Defining abstract class Employee
public abstract class Employee {
	
	static int empId = 0;
	String empName;
	int total_leaves;
	double total_salary;
	
	Employee(String name){
		empId++;  //Incrementing static entry by 1
		empName = name;
	}
	public abstract void calculate_balance_leaves();
	public abstract boolean avail_leave(int no_of_leaves, char type_of_leave);
	public abstract void calculate_salary();

}

// Defining child class PermanentEmp
class PermanentEmp extends Employee {
	
	int paid_leave, sick_leave, casual_leave;
	double basic, hra,pfa;
	
	PermanentEmp(String name,double basic,int pl,int sl,int cl){ // Defining the constructor
		super(name);
		this.basic= basic;
		paid_leave = pl;
		sick_leave = sl;
		casual_leave = cl;
		hra = (0.5 * this.basic);
		pfa = (0.12 * this.basic);
		
	}
	
//Implementing all the abstract methods
	void print_leave_details(){
		
		System.out.println("paid_leaves: " + paid_leave);
		System.out.println("sick leaves: " + sick_leave);
		System.out.println("casual Leaves: " + casual_leave);
				
	}
		
	public void calculate_balance_leaves(){
		total_leaves = paid_leave + sick_leave + casual_leave;
		System.out.println("Total leaves: "+ total_leaves);
		
	}
	
	
	public boolean avail_leave(int no_of_leaves, char type_of_leave){
		
		if (type_of_leave == 'p' && no_of_leaves<=paid_leave){
			paid_leave-=no_of_leaves;
			System.out.println("Paid leaves approved");
			return true;
		}
		else if (type_of_leave == 's' && no_of_leaves<=sick_leave){
			sick_leave-=no_of_leaves;
			System.out.println("Sick leaves approved");
			return true;
		}
		else if (type_of_leave == 'c' && no_of_leaves<=casual_leave){
			casual_leave-=no_of_leaves;
			System.out.println("Casual leaves approved");
			return true;
		}
		else if (type_of_leave != 'p' && type_of_leave != 's' && type_of_leave != 'c'){
			System.out.println("Enter correct leave type \n For casual leave:c \n For sick leave:s \n For paid leave:p");
			return false;
		}
		else if ((type_of_leave == 'p' && no_of_leaves>paid_leave) || (type_of_leave == 's' && no_of_leaves>sick_leave) || (type_of_leave == 'c' && no_of_leaves>casual_leave)){
			System.out.println("Not enough leaves");
			return false;
		}
		else {
			System.out.println("Please enter proper details");
			return false;
		}
		
	}
	
	public void calculate_salary(){
		total_salary =  (this.basic + this.hra - this.pfa);
		System.out.println("Total salary is:" + total_salary);
	}
	
	public void printEmployeeDetails(){
		System.out.println("Name: " + empName);
		System.out.println("Emp ID: "+ empId);
	}


}

//Defining child class TemporaryEmp
class TemporaryEmp extends Employee {
	
	TemporaryEmp(String name, double salary, int leaves){ //Defining constructor
		super(name);
		total_leaves = leaves;
		total_salary = salary;
	}
	
	//Implementing all the abstract methods
	public void calculate_balance_leaves(){
		System.out.println("Total leaves:" + total_leaves);
	}
	
	public boolean avail_leave(int no_of_leaves, char type_of_leave){
		
		if (no_of_leaves <= total_leaves){
			total_leaves-=no_of_leaves;
			System.out.println("Leaves applied");
			return true;
		}
		
		else if (no_of_leaves > total_leaves){
			System.out.println("Not enough leaves");
			return false;
		}
		else {
			System.out.println("Enter valid details");
			return false;
		}
		
	}
	public void calculate_salary(){
		System.out.println(" Total salary is:" + total_salary);
	}
	
	public void printEmployeeDetails(){
		System.out.println(" Name: " + empName);
		System.out.println("Emp ID: "+ empId);
	}
}
