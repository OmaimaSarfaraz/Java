package dataTypes;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
        double b=a+2.5; 
        char c='A';
        int d=c+5;
        byte e=(byte)(b+d); 

        System.out.println("a (int): "+a);
        System.out.println("b (double): "+b);
        System.out.println("c (char): "+c);
        System.out.println("d (c + 5): "+d);
        System.out.println("e (byte): "+e);
	}
}