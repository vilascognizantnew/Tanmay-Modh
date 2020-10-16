package com.tanmay.java.MLEU.Assignment1;

import java.util.Scanner;

public class SumNaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number till summ need to findout");
		int n = scanner.nextInt();
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println(sum);

	}

}
