package Lab07;

public interface ShapeInterface {
	default double Circle(double r) {
		return 2*3.141*r;
	}
	default double Rectangle(double l,double w) {
		return l*w;
	}
}