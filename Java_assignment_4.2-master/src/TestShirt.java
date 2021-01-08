//Concept: Core Java Basics.

public class TestShirt {

	public static void main(String[] args) {
		
	// Creating objects of Shirt	
		Shirt AbhiFormal = new Shirt();
		Shirt NehaInformal = new Shirt(33.5,40);
		Shirt KakaInformal = new Shirt(38.85,50.43);
		
	//Printing details of each object
		System.out.println("Abhi's Shirt details:");
		AbhiFormal.printShirtDetails();
		
		System.out.println("Neha's Shirt details:");
		NehaInformal.printShirtDetails();
		
		System.out.println("Kaka's Shirt details:");
		KakaInformal.printShirtDetails();
		

	}

}
