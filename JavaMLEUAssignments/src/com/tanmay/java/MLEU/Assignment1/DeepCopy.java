package com.tanmay.java.MLEU.Assignment1;

public class DeepCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ABC obj = new ABC();
		obj.i = 100;
		obj.j = 200;

		ABC obj1 = new ABC(); // another object // Deep Copy
		obj1.i = obj.i; // both object values will change
		obj1.j = obj.j;

		obj1.j = 300;

		System.out.println(obj1);
		System.out.println(obj);

		// Deep Copy:-It makes a copy of all the members of obj, allocates memory in a
		// different location for obj1 and then assigns the copied members to obj1 to
		// achieve deep copy.Deep Copy means call by value.
	}

}

class ABC {

	int i;
	int j;

	
	@Override
	public String toString() {
		return "Abc [i=" + i + ", j=" + j + "]";
	}

}
