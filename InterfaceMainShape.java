package Lab07;

public class InterfaceMainShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleInterface a=new CircleInterface();
		System.out.println(a.Circle(22.5));
		System.out.println(a.Rectangle(21.5, 41.5));
		Book b=new Book();
		Magzine c=new Magzine();
		b.print();
	    System.out.println("Author: "+b.author);
	    System.out.println("Book: "+b.title);
	    System.out.println("Issue Number: "+c.issuenum);
	    CalculatorClass d=new CalculatorClass();
	    d.add(5, 10);
	    d.sub(35, 31);
	    d.mul(20, 12);
	    d.div(20, 2);
	    Bike e=new Bike();
	    Bus f=new Bus();
	    CarInterface g=new CarInterface();
	    e.prints();
	    f.printed();
	    g.print();
	}
}