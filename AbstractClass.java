package Lab10;

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeAbstract a=new CircleAbstract();
		ShapeAbstract b=new RectangleAbstract();
		System.out.println("Area of circle: "+a.getArea());
		System.out.println("Area of rectangle: "+b.getArea());
	}
}