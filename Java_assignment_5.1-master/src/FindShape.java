//Class with the main method for instantiating the figure objects and getting the details of area and perimeter

public class FindShape {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(4);
		Rectangle r1 = new Rectangle(4,5);
		Triangle t1 = new Triangle(4,5,6);
		
		c1.findArea();
		c1.findPerimeter();
		
		r1.findArea();
		r1.findPerimeter();
		
		t1.findArea();
		t1.findPerimeter();

	}

}
