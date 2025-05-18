package Lab10;

public class BankAccountAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccounts a=new SavingsAccount();
		BankAccounts b=new CurrentAccount();
		System.out.println("Amount: "+a.getBalance());
		System.out.println("After Deposit amount: "+a.deposit(500));
		System.out.println("After Withdraw amount: "+b.withdraw(600));
	}
}