import java.util.Scanner;

public class BankOffice {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome");
		System.out.println("Enter a name for the bank");
		String bankName = input.nextLine();
		System.out.println("Enter the bank's address");
		String bankAddress = input.nextLine();
		
		Bank bank = new Bank(bankName, bankAddress);
		String answer;
		while(true) {
			System.out.println("Do you want to open an account?");
			answer = input.nextLine().toLowerCase();
			if(answer.equals("y")|| answer.contains("yes")|| answer.contains("yeah")|| answer.contains("yep")) {
				System.out.println("Enter a name for the owner");
				answer = input.nextLine();
				bank.openCheckingAcct(answer);
			}else if (answer.equals("no")) {
				System.out.println("Alright...");
				break;
			}
		}
		while(true) {
			System.out.println("Would you like to deposit?");
			answer = input.nextLine().toLowerCase();
			if(answer.equals("y")|| answer.contains("yes")|| answer.contains("yeah")|| answer.contains("yep")) {
				System.out.println("Enter the owner's name");
				answer = input.nextLine();
				System.out.println("Enter amount");
				double amount = input.nextDouble();
				bank.depositMoney(answer, amount);
				
			}
			
			if (answer.equals("no")) {
				System.out.println("Alright...");
				break;
			}
		}
		while(true) {
			System.out.println("Would you like to find an account's info");
			answer = input.nextLine().toLowerCase();
			if(answer.equals("y")|| answer.contains("yes")|| answer.contains("yeah")|| answer.contains("yep")) {
				System.out.println("Enter the owner's name");
				answer = input.nextLine();
				bank.findAccountInfo(answer);
			}else if (answer.equals("no")) {
				System.out.println("Alright...");
				break;
			}
		}
		
		
		while(true) {
			System.out.println("Do you want to display all accounts?");
			answer = input.nextLine().toLowerCase();
			if(answer.equals("y")|| answer.contains("yes")|| answer.contains("yeah")|| answer.contains("yep")) {
				bank.displayAllAccts();
			}else if (answer.equals("no")) {
				System.out.println("Alright...");
				break;
			}
		}
		System.out.println("_________________________________________________________________________");
		
		System.out.println(bank);
		
	}
}
