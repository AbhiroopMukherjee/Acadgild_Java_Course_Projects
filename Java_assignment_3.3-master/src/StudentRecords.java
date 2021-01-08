// Registering students and displaying their marks

public class StudentRecords {

	public static void main(String[] args) {
		
		ResultCenter abhi = new ResultCenter("abhiroop", 653670, 5, 44, 55, 76, 89, 67);
		abhi.viewStudentResult();
		
		ResultCenter anil = new ResultCenter("anil", 653673, 7, 44, 55, 76, 89, 67, 99, 78);
		anil.viewStudentResult();
		
		ResultCenter sunil = new ResultCenter("sunil", 653678, 4, 44, 55, 76, 89, 6);
		sunil.viewStudentResult();
	}

}
