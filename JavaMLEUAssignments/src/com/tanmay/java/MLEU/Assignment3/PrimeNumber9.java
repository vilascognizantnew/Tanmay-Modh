package com.tanmay.java.MLEU.Assignment3;

import java.util.Scanner;

public class PrimeNumber9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = scanner.nextInt();
		boolean flag = true;
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				flag = false;
			}
		}
		if(flag)
			System.out.println("Prime Number");
		else
			System.out.println("Not Prime Number");
	}

}
