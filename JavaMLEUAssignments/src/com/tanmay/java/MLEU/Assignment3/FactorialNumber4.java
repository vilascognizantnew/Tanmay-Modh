package com.tanmay.java.MLEU.Assignment3;

import java.util.Scanner;

public class FactorialNumber4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scanner.nextInt();
		int fact = 1;
		while(n!=0) {
			fact = fact*n;
			n--;
		}
		System.out.println(fact);

	}

}
