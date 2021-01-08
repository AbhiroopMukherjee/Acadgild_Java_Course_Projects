//Creating child class of employee as Manager

public class Manager extends Employee {

	Manager(int sal){
		this.setBasicSalary(sal);
		this.setTravelAllowance(.15*sal);
	}
	
	void printDetails(){
		System.out.println("Basic Salary:"+ this.getBasicSalary() + "  TA:"+ this.getTravelAllowance());
	}
}
