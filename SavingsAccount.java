
public class SavingsAccount extends BankAccount {
	
	private double interest = 0.075;
	private int withdrawCounter = 1;
	private int wLimit = 4;
	
	@Override
	public void withdraw(double amount) {
		if (withdrawCounter < wLimit) {
			super.withdraw(amount);
			withdrawCounter++;
		}else {
			double interestToCharge = amount*interest;
			amount = amount + interestToCharge;
			System.out.println( "Interest applied:  $" +interestToCharge );
			super.withdraw(amount);
			withdrawCounter = 1;
		}
	}
	
	@Override
	public String toString() {
	
		return "Type: Savings, "+super.toString() +", Interest: %"+(interest*100); 
	}
	public int displayAcctNumber () {
		return getNumber();
	}
}
