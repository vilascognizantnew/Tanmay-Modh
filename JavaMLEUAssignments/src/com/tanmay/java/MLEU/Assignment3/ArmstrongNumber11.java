package com.tanmay.java.MLEU.Assignment3;

import java.util.Scanner;

public class ArmstrongNumber11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scanner.nextInt();
		int temp = n;
		int sum = 0;
		while(temp!=0) {
			int r = temp%10;
			sum = sum+(r*r*r);
			temp = temp/10;
		}
		System.out.println((sum==n)?"Armstrong Number":"Not Armstrong Number");
	}
}
