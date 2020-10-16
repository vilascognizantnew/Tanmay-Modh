package com.tanmay.java.MLEU.Assignment3;

public class StringCheckStarContent21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Hello! How are you?.";
		String str2 = "Hey! Buddy how are you?.";

		// The String to check the above two Strings to see
		// if they start with this value (Red).
		String startStr = "Hello";

		// Do either of the first two Strings start with startStr?
		boolean starts1 = str1.startsWith(startStr);
		boolean starts2 = str2.startsWith(startStr);

		// Display the results of the startsWith calls.
		System.out.println(str1 + " starts with " + startStr + " yes or no? " + starts1);
		System.out.println(str2 + " starts with " + startStr + "yes or no? " + starts2);

	}

}
