package atmPack;

import java.util.Scanner;

class ATM {
	float balance;
	final int PIN = 2004;

	public void checkPin() {
		System.out.print("Enter Your pin: ");
		Scanner s = new Scanner(System.in);
		int enterdPin = s.nextInt();
		if (enterdPin == PIN) {
			menu();
		} else {
			System.out.println("Enter a valid pin !");
		}
		return;
	}

	public void menu() {
		System.out.println();
		System.out.println("1. Check A/C Balance");
		System.out.println("2. Withdraw Money");
		System.out.println("3. Deposite Money");
		System.out.println("4. Exit");
		System.out.println();
		System.out.print("Enter Your Choice: ");

		Scanner s = new Scanner(System.in);
		int opt = s.nextInt();

		if (opt == 1) {
			checkBalance();
		} else if (opt == 2) {
			withdrawMoney();
		} else if (opt == 3) {
			depositeMoney();
		} else if (opt == 4) {
			return;
		} else {
			System.out.println("Enter a valid option");
			menu();
		}

	}

	public void checkBalance() {
		System.out.println("Balance: " + balance);
		menu();
	}

	public void withdrawMoney() {
		System.out.print("Enter Amount to withdraw: ");
		Scanner s = new Scanner(System.in);
		float amount = s.nextFloat();
		if (amount > balance) {
			System.out.println("Insuffiecient Balance");
		} else {
			balance = balance - amount;
			System.out.println("Money Withdraw Successful");
			menu();
		}
	}

	public void depositeMoney() {
		System.out.print("Enter the Amount: ");
		Scanner s = new Scanner(System.in);
		float amount = s.nextFloat();
		balance = balance + amount;
		System.out.println("Money Deposite Successfully");
		menu();

	}

}

public class ATMMachine {
	public static void main(String[] args) {
		ATM obj = new ATM();
		obj.checkPin();
	}
}
