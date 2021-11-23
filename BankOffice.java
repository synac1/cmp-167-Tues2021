import java.util.Scanner;

public class BankOffice {
	public static void main(String[] args) {
		System.out.println("Wecome");
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a bank name");
		String bankName = input.nextLine();
		
		System.out.println("Enter a bank address");
		String bankAddress = input.nextLine();
		
		
		Bank bank = new Bank(bankName, bankAddress);
		System.out.println("New Bank was created");
		System.out.println(bank);
		while(true) {
			System.out.println("Would you like to create an account?");
			String answer = input.nextLine().toLowerCase();
			if (answer.equals("y")||answer.equals("yes") || answer.equals("yep")|| answer.contains("yeah")){
				System.out.println("Enter a name:");
				answer = input.nextLine();
				bank.openSavingAccount(answer);
		
			}else if (answer.contains("no")) {
				
				System.out.println("alright...");
				break;
			}
		}
		
		while(true) {
			System.out.println("Would you like to find an account info");
			String answer = input.nextLine().toLowerCase();
			if (answer.equals("y")||answer.equals("yes") || answer.equals("yep")|| answer.contains("yeah")){
				System.out.println("Enter account owner's name:");
				answer = input.nextLine();
				bank.getAccountInfo(answer);
			}else if (answer.contains("no")){
				System.out.println("alright...");
				break;
			}
		}
		
		while(true) {
			System.out.println("Would you like see all info? ");
			String answer = input.nextLine().toLowerCase();
			if(answer.equals("y")||answer.equals("yes") || answer.equals("yep")|| answer.contains("yeah")) {
				bank.listAllAccounts();
			}
			else if (answer.contains("no")) {
				System.out.println("alright...");
				break;
			}
		}
		System.out.println("__________________________________________________________");
		System.out.println(bank);
	}

}
