package com.tanmay.java.MLEU.Assignment1;

public class ATMNote {

	public static void main(String args[]) {
		
		int balance = 20000;
		int amount = 7000;
		int note[] = new int[] {2000,500,200,100};
		int[] count = new int[4];
		
		for(int i = 0 ;i<4;i++) {
			if(amount>=note[i]) {
				count[i] = amount/note[i];
				System.out.println(count[i]);
				amount = amount - note[i]*count[i];
			}
		}
		for(int i=0;i<4;i++) {
			System.out.println(note[i]+" : "+count[i]);
		}
	}
}
