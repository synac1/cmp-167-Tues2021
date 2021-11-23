
public class CheckingAccount extends Account{
	
	private double interest = 0.075;
	private int wCounter = 1;
	private int limit  = 4;
	
	
	public static void main(String[] args) {
		CheckingAccount acct = new CheckingAccount();
		CheckingAccount acct2 = new CheckingAccount();
		System.out.println(acct);
	//	acct.deposit(400.99);
		System.out.println(acct2);
		
		System.out.println();
//		acct.withdraw(2000);
//		acct.withdraw(250.00);
//		acct.withdraw(50);
//		acct.withdraw(80);
		
	}
	
	@Override
	public void withdraw(double amount) {
		if(wCounter < limit) {
			super.withdraw(amount);
			++wCounter;
		}else {
			double interestToCharge = amount*interest;
			System.out.println("Interest :"+interestToCharge);
			amount  = amount + interestToCharge;
			super.withdraw(amount);
			wCounter = 1;
		}
		
	}
	@Override
	public String toString() {
		return "Type: Checking, "+ super.toString() + ", Interest %"+(interest*100);
	}
	
}
