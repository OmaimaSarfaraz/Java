package polymorphism;

public class Calc {
	public void add(int a, int b) {
		int res=0;
		res=a+b;
		System.out.println("Answer: "+res);
	}
	public void add(int a, int b, int c) {
		int res=0;
		res=a+b+c;
		System.out.println("Answer: "+res);
	}
}