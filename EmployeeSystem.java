package Lab04;

public class EmployeeSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Salary a=new Salary();
        a.calculateSalary();
        Manager b=new Manager();
        b.calculateSalary();
        Developer c=new Developer();
        c.calculateSalary();
	}
}