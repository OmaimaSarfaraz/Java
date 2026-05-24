package controlstatements;

public class NestedIfelse {

	public static void main(String[] args) {
		int age=20;
		if(age>=18){
			if(age<60){
				System.out.println("Adult");
				}
			else{
				System.out.println("Senior");
				}
			}
		else{
			System.out.println("Minor");
			}
	}
}