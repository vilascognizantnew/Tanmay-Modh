package com.tanmay.java.MLEU.Assignment1;

public class CloneCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		ABC2 obj = new ABC2();
		obj.i = 100;
		obj.j = 200;

		ABC2 obj1 = (ABC2) obj.clone();

		obj1.j = 1000;
		System.out.println(obj1);
		System.out.println(obj);

		// Clone:- Cloning is the process of actually making another exact replica of
		// the object instead of its reference.

	}

}

class ABC2 implements Cloneable {

	int i;
	int j;

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Abc [i=" + i + ", j=" + j + "]";
	}

}
