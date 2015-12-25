package com.levon.algorithms.queuestack;

import java.util.Stack;

public class StackSimple {

	public static void main(String[] args) {
		StackSimple stack = new StackSimple();
		stack.push(7);
		stack.push(2);
		stack.push(3);
		stack.push(1);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.getMin());
	}
	public final int CAPACITY = 4;
	private int size;
	private Node1 top;
	private Stack<Integer> minStack = new Stack<>();
	
	public Integer pop() {
		if(top != null) {
			int data = top.data;
			if(top.next != null) {
				top = top.next;
				minStack.pop();
			}
			size--;
			return data;
			
		}
			return null;
	}
	public void push(int data) {
		if(top != null) {
			Node1 newTop = new Node1(data);
			newTop.next = top;
			top = newTop;
			if(data < minStack.peek()) {
				minStack.push(data);
			}
			else {
				int min = minStack.peek();
				minStack.push(min);
			}
			
		}
		else {
			top = new Node1(data);
			minStack.push(data);
		}
		size++;
	}
	
	public Integer peek() {
		if(top != null) {
			return top.data;
		}
		return null;
	}
	public int getMin() {
		return minStack.peek();
	}
	public boolean isFull() {
		return size==CAPACITY;
	}
	public boolean isEmpty() {
		return size==0;
	}
}

class Node1 {
	
	public int data;
	public Node1 next;
	
	public Node1(int data) {
		this.data = data;
	}
} 
