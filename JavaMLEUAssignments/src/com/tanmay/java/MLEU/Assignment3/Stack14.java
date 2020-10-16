package com.tanmay.java.MLEU.Assignment3;

import java.util.Scanner;
import java.util.Stack;

public class Stack14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Stack stack = new Stack();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println("Pushed in Stack: "+stack);
		System.out.println("Popped out: "+stack.pop());
		System.out.println("Popped out: "+stack.pop());
		System.out.println("Peek stack: "+stack.peek());
		System.out.println("Check Stack is Empty or not: "+stack.isEmpty());
	}
}
