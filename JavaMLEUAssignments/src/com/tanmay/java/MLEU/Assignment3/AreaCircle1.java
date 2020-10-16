package com.tanmay.java.MLEU.Assignment3;

import java.util.Scanner;

public class AreaCircle1 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		double pi = 3.14;
		System.out.println("Radius of circle: ");
		double r = scanner.nextDouble();
		System.out.println("Area: "+String.format("%.2f",pi*r*r));
		System.out.println("Perimeter: "+String.format("%.2f",2*pi*r));
	}
}
