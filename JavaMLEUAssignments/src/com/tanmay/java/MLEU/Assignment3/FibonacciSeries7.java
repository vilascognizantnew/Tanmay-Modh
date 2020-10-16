package com.tanmay.java.MLEU.Assignment3;

import java.util.Scanner;

public class FibonacciSeries7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scanner.nextInt();
		int a = 0,b = 1;
		System.out.print(a+" "+b+" ");
		for(int i=2;i<n;i++) {
			int t = a+b;
			a = b;
			b = t;
			System.out.print(t+" ");
		}
	}

}
