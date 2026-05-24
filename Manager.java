package Lab04;

public class Manager extends Salary {
	@Override
	public void calculateSalary() {
		System.out.println("Manager Salary: $5000 + $50");
	}
}