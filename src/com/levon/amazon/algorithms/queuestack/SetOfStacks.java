package com.levon.amazon.algorithms.queuestack;

import java.util.ArrayList;
import java.util.List;


public class SetOfStacks {

	List<StackSimple> stacks = new ArrayList<>();
	
	public static void main(String[] args) {
		SetOfStacks stack = new SetOfStacks();
		stack.push(7);
		stack.push(2);
		stack.push(3);
		stack.push(9);
		stack.push(5);
		stack.push(1);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
	public void push(int data) {
		if(stacks.isEmpty()) {
			StackSimple stack = new StackSimple();
			stack.push(data);
			stacks.add(stack);
		}
		else {
			StackSimple stack = stacks.get(stacks.size()-1);
			if(stack.isFull()) {
				StackSimple newStack = new StackSimple();
				newStack.push(data);
				stacks.add(newStack);
			}
			else {
				stack.push(data);
			}
		}
	}
	
	public int pop() {
		StackSimple stack = stacks.get(stacks.size()-1);
		int data = stack.pop();
		if(stack.isEmpty()) {
			stacks.remove(stacks.size()-1);
		}
		return data;
	}
	
	public int peek() {
		StackSimple stack = stacks.get(stacks.size()-1);
		return stack.peek();
	}
	
}
