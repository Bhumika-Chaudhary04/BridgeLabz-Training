package constructors_access_modifiers;
public class Circle {
	//attribute
	private double radius;
	//default constructor
	Circle(){
		radius=5.67;
	}
	//parameterized constructor
	Circle(double radius){
		this.radius=radius;
	}
	//display method
	void display() {
		System.out.println("Radius of the circle is : "+radius);
		System.out.println("-----------------------------------------------");
	}
	public static void main(String[] args) {
		//object 
		Circle circle1=new Circle();
		Circle circle2=new Circle(4.545);
		circle1.display();
		circle2.display();
	}
}

