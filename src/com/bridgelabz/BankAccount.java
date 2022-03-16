package com.bridgelabz;
import java.util.Scanner;
public class BankAccount {
	static Scanner scanner = new Scanner(System.in);
    private double balance;
	
  public BankAccount(double intialBalance) {
		balance = intialBalance;

	}

   public void debit(double balance) {
		System.out.println("enter ammount to withdraws");
		double withdraw = scanner.nextDouble();

		if (withdraw > balance)
			System.out.println("Debit amount exceeded account balance");
		else
			balance = balance - withdraw;
		System.out.println("Remaining balance is " + balance);

	}

	public void deposit(double depositAmount) {
		balance = depositAmount;
	}

	public boolean withdraw(double withdrawAmount) {

		if (withdrawAmount > balance) {
			System.out.println("Insufficient Funds");
			return false;
		} else {
			balance = withdrawAmount;
			return true;
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the balance to mention in the account");
		BankAccount account = new BankAccount(scanner.nextDouble());
		account.debit(account.balance);
	}
}

