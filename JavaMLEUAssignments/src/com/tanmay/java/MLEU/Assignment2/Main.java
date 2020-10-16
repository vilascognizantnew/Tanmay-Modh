package com.tanmay.java.MLEU.Assignment2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Account acc = new Account();
		Account acc2 = new Account();
		int choice = 0;
		while(choice!=5) {
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Transfer");
			System.out.println("4.Check Balance");
			System.out.println("5.Exit");
			System.out.println("Enter your choice:");
			choice = scanner.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.println("Enter amount to Deposit");
					int deposit = scanner.nextInt();
					acc.setDeposit(deposit);
					acc.setBalance(deposit+acc.getBalance());
					System.out.println("Amount Deposited");
					break;
				case 2:
					System.out.println("Enter amount to Withdraw");
					int withdraw = scanner.nextInt();
					acc.setWithdraw(withdraw);
					if(acc.getBalance()>withdraw) {
						acc.setBalance(acc.getBalance()-withdraw);
						System.out.println("Amount Withdrawn Successfully");
					}
					else
						System.out.println("Not Enough Balance");
					
					break;
				case 3:
					System.out.println("Transfer Amount");
					System.out.println("Account Number : ");
					int accNo = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Account Holder Name : ");
					String accHolName = scanner.nextLine();
					System.out.println("Amount to Transfer : ");
					int amt = scanner.nextInt();
					if(acc.getBalance()>amt) {
						acc2.setBalance(acc2.getBalance()+amt);
						acc.setBalance(acc.getBalance()-amt);
						System.out.println("Amount Transfered to Account: "+accNo);
					}
					else
						System.out.println("Not Enough Balance to Tranfer amount");
					break;
				case 4:
					System.out.println("Your Available Balance in Account 1 is: "+acc.getBalance());
					System.out.println("Your Available Balance in Account 2 is: "+acc2.getBalance());
					break;
				default:
					System.out.println("Thank You For Banking with Us!");
			}
		}
	}
}
