package com.tanmay.java.MLEU.Assignment3;

import java.util.Scanner;

public class PalindromeNumber10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scanner.nextInt();
		int number = n;
		int reverse = 0;
		while(n!=0) {
			int rem = n%10;
			reverse = (reverse*10)+rem ;
			n=n/10;
		}
		System.out.println((reverse==number)?"Palindrome":"Not Palindrome");
	}

}
