package com.tanmay.java.MLEU.Assignment3;

import java.util.Scanner;

public class SwapNumbers3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter num1");
		int num1 = scanner.nextInt();
		System.out.println("Enter num2");
		int num2 = scanner.nextInt();
		System.out.println("Before Swapping");
		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		System.out.println("After Swapping");
		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);
	}

}
