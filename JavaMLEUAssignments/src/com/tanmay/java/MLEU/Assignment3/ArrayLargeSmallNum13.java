package com.tanmay.java.MLEU.Assignment3;

import java.util.Scanner;

public class ArrayLargeSmallNum13 {
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
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i = 0;i<n;i++) {
			if(max<arr[i])
				max = arr[i];
			if(min>arr[i])
				min = arr[i];
		}
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
		
	}
}
