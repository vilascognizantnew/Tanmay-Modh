package com.tanmay.java.MLEU.Assignment1;

class StudentCloneExamp implements Cloneable {
	int rollno;
	String name;

	StudentCloneExamp(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String args[]) {
		try {
			StudentCloneExamp s1 = new StudentCloneExamp(101, "amit");

			StudentCloneExamp s2 = (StudentCloneExamp) s1.clone();

			
			System.out.println(s1.rollno + " " + s1.name);
			System.out.println(s2.rollno + " " + s2.name);

		} catch (CloneNotSupportedException c) {
		}

	}
}