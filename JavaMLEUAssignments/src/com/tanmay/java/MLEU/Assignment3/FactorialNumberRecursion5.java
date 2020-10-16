package com.tanmay.java.MLEU.Assignment3;

import java.util.Scanner;

public class FactorialNumberRecursion5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scanner.nextInt();
		int res = 0;
		res = factorial(n);

		System.out.println(res);
	}
	
	public static int factorial(int n) {
		if(n>=1)
			return n * factorial(n-1);
		else 
			return 1;
	}

}
