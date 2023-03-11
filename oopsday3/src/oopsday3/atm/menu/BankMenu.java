package oopsday3.atm.menu;

import oopsday3.atm.menu.Account;
import oopsday3.atm.menu.BankOfAmerica2;
import java.util.Scanner;

public class BankMenu {

	BankOfAmerica2 boa = new BankOfAmerica2();

	public BankMenu() {

		Account a1 = new Account(101, "John Doe", "savings", 500);
		Account a2 = new Account(102, "Jone Doe", "savings", 700);
		Account a3 = new Account(103, "Jason Doe", "salary", 850);
		Account a4 = new Account(104, "Jane Doe", "salary", 250);
		Account a5 = new Account(105, "Jonas Doe", "pension", 650);

		
		boa.addAccount(a1);
		boa.addAccount(a2);
		boa.addAccount(a3);
		boa.addAccount(a4);
		boa.addAccount(a5);

	}

	public void menu() {
			
			Scanner scanner = new Scanner(System.in);
			int choice = 0;
			loop: do {
				
				System.out.println("Enter yor choice 1...5");
				System.out.println("1. Display Account");
				System.out.println("2. Diposit Account");
				System.out.println("3. Withdraw Account");
				System.out.println("4. Balance Account");
				System.out.println("5. exit...");
				
				choice = scanner.nextInt();
				
				switch (choice) {
				
				case 1: {
					System.out.println("Enter account number");
					int actno = scanner.nextInt();
					boa.display(actno);
				
					
					
					break;
				}
				case 2: {
					System.out.println("Enter account number");
					int actno = scanner.nextInt();
					System.out.println("Enter amount to deposit");
					int amount = scanner.nextInt();
					double balance = boa.deposit(amount, actno);
					System.out.println(balance);
					break;
				}
				case 3: {
					System.out.println("Enter account number");
					int actno = scanner.nextInt();
					System.out.println("Enter amount to withdraw");
					int amount = scanner.nextInt();
					double balance = boa.withdraw(amount, actno);
					System.out.println(balance);
					break;
					
				}
				case 4: {
					System.out.println("Enter account number");
					int actno = scanner.nextInt();
					double balance = boa.balanceEnquiry(actno);
					System.out.println(balance);
					
					break;
				}
				case 5: {
					
					break loop;
				}
			}
		} while (choice != 5);
	}
}

	
			
