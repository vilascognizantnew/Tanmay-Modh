package com.tanmay.java.MLEU.Assignment1;

public class ShallowCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Abc1 obj = new Abc1();
		obj.i = 100;
		obj.j = 200;

		Abc1 obj1 = obj; // another object // Shallow Copy
		obj1.i = 8; // both object values will change

		System.out.println(obj1);
		System.out.println(obj);

		// So Shallow copy means to make a copy of the reference to obj into obj1. It is
		// simply say that call bye value.
	}

}

class Abc1 {

	int i;
	int j;

	@Override
	public String toString() {
		return "Abc [i=" + i + ", j=" + j + "]";
	}

}
