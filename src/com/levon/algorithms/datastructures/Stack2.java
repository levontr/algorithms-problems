package com.levon.algorithms.datastructures;

public class Stack2<T> {

	StackNode<T> top;
	
	public void push(T data) {
		StackNode<T> node = getNewNode(data);
		if(top == null) {
			top = node;
			return;
		}
		node.next = top;
		top = node;
	}
	
	public void pop() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		top = top.next;
	}
	
	public T top() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		return top.data;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public void print() {
		StackNode<T> next = top;
		while(next != null) {
			System.out.println(next.data);
			next = next.next;
		}
	}
	
	private StackNode<T> getNewNode(T data) {
		StackNode<T> node = new StackNode<>();
		node.data = data;
		return node;
	}
}

class StackNode<T> {
	T data;
	StackNode<T> next;
}