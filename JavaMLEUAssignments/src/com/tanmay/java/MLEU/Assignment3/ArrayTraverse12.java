package com.tanmay.java.MLEU.Assignment3;

import java.util.Scanner;

public class ArrayTraverse12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			System.out.println("Enter num"+(i+1)+": ");
			arr[i] = scanner.nextInt();
		}
		System.out.println("CHecking Odd and Even in array");
		for(int i : arr) {
			if(i%2 == 0)
				System.out.println(i+": Even");
			else
				System.out.println(i+": Odd");
		}
	}
}
