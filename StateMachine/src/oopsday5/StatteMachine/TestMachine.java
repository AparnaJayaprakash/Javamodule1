package oopsday5.StatteMachine;

import java.util.Scanner;

public class TestMachine {

	public static void main(String[] args) {

		AtmCalculations ac = new AtmCalculations();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount needed: ");
		int amount = sc.nextInt();
		int ch = 1;
		int j=1;
		do {
			switch(ch) {

		case 1: {
			System.out.println("Enter the no. of 100 denominations: ");
			int c100 = sc.nextInt();
			ac.withdraw100(amount, c100);
			if(amount == ac.note) {
				break;
			}
		}
		case 2: {
			System.out.println("Enter the no. of 50 denominations: ");
			int c50 = sc.nextInt();
			ac.withdraw50(amount, c50);
			if(amount == ac.note) {
				break;
			}
		}
		case 3: {
			System.out.println("Enter the no. of 20 denominations: "); 
			int c20 =sc.nextInt();
			ac.withdraw20(amount, c20);
			if(amount == ac.note) {
				break;
			}
		}
		case 4: {
			System.out.println("Enter the no. of 10 denominations: "); 
			int c10 = sc.nextInt(); 
			ac.withdraw10(amount, c10);
			if(amount == ac.note) {
				break;
			}
			
		}
		case 5: {
			System.out.println("Enter the no. of 5 denominations: ");
			int c5 = sc.nextInt();
			ac.withdraw5(amount, c5);
			if(amount == ac.note) {
				break;
			}
		}
		default: {
			System.out.println("Wrong input");
			System.out.println("Enter again");
			j++;
		}
	}  
	}while(j<3 & amount != ac.note);
	}

}
