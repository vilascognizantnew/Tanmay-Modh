package com.tanmay.java.MLEU.Assignment3;

import java.util.Scanner;

public class SumOfDigit6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter num");
		int num = scanner.nextInt();
		int temp = num;
		int sum = 0;
		while(num!=0) {
			int r = num%10;
			sum = sum+r;
			num = num/10;
		}
		System.out.println("Sum of Number "+temp+" is: "+sum);
	}

}
