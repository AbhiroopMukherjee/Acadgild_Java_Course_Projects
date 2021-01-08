package ComparatorTask;

public class HDTV { 
	//Initializing members
	private String brandname;
	private int size;
	
	HDTV(String bn, int s){ //Populating members with the help of constructor
		brandname = bn;
		size = s;
	}

	//Defining getters
	public String getBrandname() {
		return brandname;
	}


	public int getSize() {
		return size;
	}
	
	//Implementing toStrng method to get proper message when object is printed
	public String toString(){
		return "TV:"+ brandname + " Size:"+ size;
	}
}


