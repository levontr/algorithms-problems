package com.levon.algorithms.datastructures;

public class StackTest {

	public static void main(String[] arge){
		//Stack2<Integer> stack = new Stack2<>();
		Stack<Integer> stack = new Stack<>();
		stack.push(4);
		stack.push(3);
		stack.push(7);
		stack.print();
		stack.push(1);
		stack.pop();
		stack.push(5);
		stack.print();
		
	}
}
