package Lab10;

public class CurrentAccount extends BankAccounts {
	int bal=67000;
	public int getBalance() {
		return bal;
	}
	public int deposit(int amount) {
		bal+=amount;
		return bal;
	}
	public int withdraw(int amount) {
		bal-=amount;
		return bal;
	}
}