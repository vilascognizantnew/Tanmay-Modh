package com.tanmay.java.MLEU.Assignment3;

class demo{
	
	private int id;    // instance variable
	private String name; // instance variable
	
	static String static_var; // static variable
}
public class Variable15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variable15 v = new Variable15();
		String loc_var = "Local variable"; // local variable
		
		// accessing static variable using class name
		demo.static_var = "Static variable";
		System.out.println("Local variable value: "+loc_var);
		System.out.println("Static variable value: "+demo.static_var);
		v.display(100,"Tanmay");
	}
	
	// method parameters
	void display(int id,String name) {
		System.out.println("Display Method Parameters");
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
	}

}
