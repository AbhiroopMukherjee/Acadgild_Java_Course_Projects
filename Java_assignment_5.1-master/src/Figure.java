// Defining the base class figure and subclasses Circle, Rectangle and Triangle.

public abstract class Figure {
	
	double dim1, dim2, dim3;
	
	abstract void findArea();
	abstract void findPerimeter();

}


class Circle extends Figure {
	
	final static double pi = 3.14; // defining PI value
	
	Circle(double radius){  //Fetching radius and populating dim1 property of the base class
		dim1 = radius;         
	}
	
	void findArea(){   //Calculating area of circle
		System.out.println("Area of Circle is "+ (pi*(dim1*dim1)));
	}
	
	void findPerimeter(){        //Calculating perimeter of circle
		System.out.println("Perimeter of the Circle is "+ (2*pi*dim1));
	}
}

class Rectangle extends Figure {
	
	Rectangle(double length, double breadth){ //Fetching length and breadth and populating dim1 and dim2 properties of the base class
		dim1 = length;
		dim2 = breadth;
	}
	
	void findArea(){
		System.out.println("Area of Rectangle is "+ (dim1*dim2));
	}
	
	void findPerimeter(){
		System.out.println("Perimeter of the Rectangle is "+ (2*(dim1+dim2)));
	}
}

class Triangle extends Figure {
	
	Triangle(double s1, double s2, double s3){
		dim1 = s1;
		dim2 = s2;
		dim3 = s3;
	}
	
	void findArea(){
		double s = (dim1 + dim2 + dim3) / 2;
		System.out.println("Area of Triangle is "+ Math.sqrt(s * (s - dim1) * (s - dim2) * (s - dim3)));
	}
	
	void findPerimeter(){
		System.out.println("Perimeter of the Triangle is "+ (dim1+dim2+dim3));
	}
}


