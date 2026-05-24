package Lab05;

public class Area {
	static public double calculateArea(final double radius) {
		radius=4.12; //Radius variable cannot be reassigned due to final parameter
		return 2*3.14*radius;
	}
}