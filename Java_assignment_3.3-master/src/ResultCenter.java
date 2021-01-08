// Defining Parent Student class
class Student {
	
	String name;
	int studentId, semester;
	
	Student(){}
	
	Student(String name, int id, int sem){ // Getting student details as a constructor
		
		this.name = name;
		this.studentId = id;
		this.semester = sem;
		
	}
	
	public void getStudentInfo(){ // Displaying student details
		
		System.out.println("Student's name: "+ name);
		System.out.println("Student's ID: "+ studentId);
		System.out.println("Semester: "+ semester);
	}
}

// Defining child ResultCenter class
public class ResultCenter extends Student {
	
	
	int [] semMarks = new int[8];
	
	ResultCenter(String name, int id, int sem,int... semMarkArray ){ //Creating variable length constructor to receive marks
		super(name,id,sem);
		int length = semMarkArray.length;
		for (int i=0; i<length; i++){
			semMarks[i] = semMarkArray[i];
		}
	}
	
	public  void viewStudentResult(){ //Displaying the result with the student info
		
		super.getStudentInfo();
		System.out.println("Result-------");
		for (int i=0; i<8; i++){
			System.out.println("Semester " +(i+1) +" Marks: " +  semMarks[i]);
		}
		
	}
}


