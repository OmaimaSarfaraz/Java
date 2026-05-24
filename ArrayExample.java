package dataTypes;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[]={85,90,78,88,92};
		System.out.println("Marks:");
        for (int i=0;i<marks.length;i++) 
        {
            System.out.println("Student "+(i+1)+": "+marks[i]);
        }
	}
}