
public class CashAccount extends CheckingAccount{
	public static void main(String[] args) {
		CashAccount acct = new CashAccount();
		
		acct.deposit(100);
	}
	@Override
	public void deposit(double amount) {
		super.deposit(amount);
	}
}
