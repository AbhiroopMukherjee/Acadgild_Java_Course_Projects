
public class Shirt {
	
//defining member variables of the Class	
	private double collarSize;
	private double sleeveLength;
	private String material;
	
// Setting default constructor
	Shirt(){
		this.setCollarSize(45.00);
		this.setSleeveLength(36.50);
		this.setMaterial("Cotton");
	}
	
// Setting parameterized constructor
	Shirt(double collarSize, double sleeveLength){
		this.setCollarSize(collarSize);
		this.setSleeveLength(sleeveLength);
		this.setMaterial("Cotton");
	}

//Defining setters and getters
	public double getCollarSize() {
		return collarSize;
	}

	public void setCollarSize(double collarSize) {
		this.collarSize = collarSize;
	}

	public double getSleeveLength() {
		return sleeveLength;
	}

	public void setSleeveLength(double sleeveLength) {
		this.sleeveLength = sleeveLength;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	public void printShirtDetails(){
		System.out.println("Shirt Collar Size:"+ this.getCollarSize() + "  Shirt Sleeve Length:"+ this.getSleeveLength() + "  Shirt's material:"+ this.getMaterial());
		
	}

}
