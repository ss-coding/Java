package j001;

import java.util.Scanner;

public class ATMtest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ATM account = new ATM();
		System.out.print("Please enter how many money do you have:");
		int money = input.nextInt();
		account.setMoney(money);
		int x=1;
		
		while(x==1) {
			System.out.print("Would you like to save or withdraw?\nsave press 1, withdraw press 2.");
			int b = input.nextInt();
			if(b==1) {
				System.out.print("How many would you like to save:");
				int c = input.nextInt();
				account.save(c);
			}
			else if(b==2) {
				System.out.print("How many would you like to withdraw:");
				int c = input.nextInt();
				account.withdraw(c);
			}
			else {System.out.print("Please press 1 or 2!!\n");}
			System.out.printf("You have left %d dollars.\n\n",account.getMoney());
		}
	}
}
