package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class Program {

	public static void main(String[] args) {
		
	    try {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();	
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("withdraw limit: ");
		double amountLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, amountLimit);
		
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		
		acc.withdraw(amount);
		
		System.out.println("New balance: " + acc.getBalance());	
		sc.close();
	    } 
	    catch(IllegalArgumentException e) {
	    	System.out.println("Withdraw error: " + e.getMessage());
	    }
	    catch(InputMismatchException e) {
	    	System.out.println("Program error!");
	    }

	}

}
