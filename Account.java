
public class Account {
	public int number;
	public double balance;
	private static int numbersOfAccounts;
	
	public Account() {
		this.number = ++numbersOfAccounts;	
	}
	
	public void deposit(double amount ) {
		if (amount > 0) {
			balance += amount;
			displayMessage('d', true, amount);
		}else {
			displayMessage('d', false, amount);
		}
		
	}
	public void withdraw(double amount ) {
		if ((balance - amount )  >= 0) {
			balance -= amount;
			displayMessage('w', true, amount);
		}else {
			displayMessage('w', false, amount);
		}
	}
	
	@Override
	public String toString() {
		return " Number : " + this.number + ",  Balance: "+ this.balance;
	}
	
	public void displayMessage(char type, boolean state, double amount) {
		String message1 = "";
		String message2 = "" ;
		if( type == 'd' ) {
			message1 = " have been doposited to";
			message2 = "invalid amount";
		}else {
			message1 =" have been been withdrawn";
			message2 = "not enough balance";
		}
		if(state) {
			System.out.println("Transaction successful, $"+amount +message1+"to account #"+number+"\nNew balance: $"+ balance);
		}
		else {
			System.out.println("Transaction unsuccessful, "+message2);
		}
		
	}


	
}
