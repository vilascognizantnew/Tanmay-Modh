package com.tanmay.java.MLEU.Assignment3;

import java.util.Scanner;

public class MultiplicationTable16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Multiplication Table Number: ");
		int n = scanner.nextInt();
		usingForLoop(n);
		usingWhileLoop(n);
		usingDoWhileLoop(n);
	}
	
	static void usingForLoop(int n) {
		System.out.println("Using For Loop");
		for(int i=1;i<=10;i++) {
			System.out.println(n+"x"+i+"="+(n*i));
		}
	}
	static void usingWhileLoop(int n) {
		System.out.println("Using While Loop");
		int i = 1;
		while(!(i>10)) {
			System.out.println(n+"x"+i+"="+(n*i));
			i++;
		}
	}
	static void usingDoWhileLoop(int n) {
		System.out.println("Using Do-While Loop");
		int i=1;
		do {
			System.out.println(n+"x"+i+"="+(n*i));
			i++;
		}while(i<=10);
	}

}
