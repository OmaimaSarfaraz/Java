package Lab04;

public class PrintDetails {
	public static void printDetails(int ID) {
     	System.out.println("Employee ID: "+ID); 
	}
	public static void printDetails(String name) {
		System.out.println("Employee Name: "+name); 
	}
	public static void printDetails(int ID,String name) {
		System.out.println("Employee ID: "+ID+ "\nEmployee Name: "+name); 
	}
}