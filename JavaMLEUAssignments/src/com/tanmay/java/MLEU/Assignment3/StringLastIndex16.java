package com.tanmay.java.MLEU.Assignment3;

import java.util.Scanner;

public class StringLastIndex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = scanner.nextLine();
		System.out.println("Last index of string: "+str.charAt(str.length()-1));
	}

}
