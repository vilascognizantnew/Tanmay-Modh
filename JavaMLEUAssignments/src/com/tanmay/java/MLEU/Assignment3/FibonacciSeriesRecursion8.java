package com.tanmay.java.MLEU.Assignment3;

import java.util.Scanner;

public class FibonacciSeriesRecursion8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scanner.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print(fib(i)+" ");
		}
	}
	
	public static int fib(int n) {
		if(n == 0)
			return 0;
		else if(n==1 || n==2)
			return 1;
		else
			return fib(n-2) + fib(n-1);
	}

}
