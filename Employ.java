package Lab09;
import java.util.ArrayList;

public class Employ {
	public static void main(String[] args) {
		
		ArrayList<Emp> list=new ArrayList<>();
		
		Emp e1 = new Emp();
        e1.id=1;
        e1.name="Ali";
        e1.salary=50000.00;
        
        Emp e2 = new Emp();
        e2.id = 2;
        e2.name = "Sara";
        e2.salary = 65000.00;

        Emp e3 = new Emp();
        e3.id = 3;
        e3.name = "Salar";
        e3.salary = 480000.00;
        
        list.add(e1);
        list.add(e2);
        list.add(e3);
        
		Emp highest=list.get(0);
		for(Emp e:list) {
			if(e.salary>highest.salary)
			{
				highest=e;
				}
			}
			System.out.println("Highest Paid: "+highest.name+" with salary "+highest.salary);
	}
}