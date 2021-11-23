
import java.util.HashMap;
import java.util.Map.Entry;

public class Bank {
	private String name ;
	private String address;
	
	
	private HashMap<String, SavingsAccount> accountsWithOwner = new HashMap<String, SavingsAccount>();
	
	public Bank(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public void openSavingAccount(String accountOwner) {
		SavingsAccount acct  = new SavingsAccount();
		accountsWithOwner.put(accountOwner, acct);
		
		System.out.println("Account # "+acct.displayAcctNumber() + " has been created ");
		
		
	}
	
	
	public void listAllAccounts() {
		for (Entry<String, SavingsAccount> entry : accountsWithOwner.entrySet()) {
			System.out.println("owner" + entry.getKey() +" account "+entry.getValue());
		}
	}
	
	public void getAccountInfo(String owner) {
		if( accountsWithOwner.containsKey(owner)) {
			String info = accountsWithOwner.get(owner).toString();
			System.out.println(info);
		}else{
			System.out.println("No account with this owner");
		}
	}
	@Override
	public String toString() {
		return "Bank "+name + " address: "+address + " number of users :" + accountsWithOwner.size(); 
	}
}
