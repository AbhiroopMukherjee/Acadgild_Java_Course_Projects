//Concept: Inheritance

public class EmployeeRegistration {

	public static void main(String[] args) {

//Creating objects of manager and trainee
		Manager M1 = new Manager(100000);
		Trainee T1 = new Trainee(30000);
		
//Calling for details of the objects
		System.out.println("Details of M1:");
		M1.printDetails();
		
		System.out.println("Details of T1:");
		T1.printDetails();

	}

}
