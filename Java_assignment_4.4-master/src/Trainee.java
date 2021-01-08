//Creating child class of Employee as Trainee

public class Trainee extends Employee {
	
	Trainee(int sal){
		this.setBasicSalary(sal);
		this.setTravelAllowance(.1*sal);
	}
	
	void printDetails(){
		System.out.println("Basic Salary:"+ this.getBasicSalary() + "  TA:"+ this.getTravelAllowance());
	}

}
