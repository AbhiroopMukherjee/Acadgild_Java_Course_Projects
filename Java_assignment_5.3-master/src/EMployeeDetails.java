//Defining employee details class with the main method
public class EMployeeDetails {

	public static void main(String[] args) {
		
		PermanentEmp Abhi = new PermanentEmp("Abhiroop",425000,5,5,5); //Creating PermanentEmp type object and calling all methods
		Abhi.calculate_salary();
		Abhi.avail_leave(3, 'c');
		Abhi.calculate_balance_leaves();
		Abhi.avail_leave(5, 's');
		Abhi.calculate_balance_leaves();
		
		Abhi.avail_leave(5, 's');
		Abhi.calculate_balance_leaves();
		Abhi.printEmployeeDetails();
		Abhi.print_leave_details();
		
		Abhi.avail_leave(5, 'u');
		
		
		TemporaryEmp Anil = new TemporaryEmp("Anil", 380000, 15); //Creating TemporaryEmp type object and calling all methods
		Anil.calculate_salary();
		Anil.avail_leave(3, 'c');
		Anil.calculate_balance_leaves();
		Anil.printEmployeeDetails();
		
		

	}

}
