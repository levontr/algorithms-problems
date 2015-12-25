package com.levon.algorithms.datastructures;

public class LinkedList<T> {
	
	Node<T> head;
	
	public void reverse() {
		Node<T> node = head;
		Node<T> prev = null;
		while (node != null) {
			Node<T> next = node.next;
			node.next = prev;
			prev = node;
			node = next;
		}
		head = prev;
	}
	
	public void printRecursively(Node<T> node) {
		if(node == null) {
			return;
		}
		printRecursively(node.next);
		System.out.println(node.data);
	}
	
	public void reverseRecursively(Node<T> node) {
		if (node.next == null) {
			head = node;
			return;
		}
		Node<T> next = node.next;
		reverseRecursively(next);
		next.next = node;
		node.next = null;
	}
	
	public void insert(T data) {
		Node<T> newNode = new Node<T>();
		newNode.data = data;
		if(head == null) {
			head = newNode;
			return;
		}
		Node<T> temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	public void delete(int n) {
		Node<T> temp = head;
//		if(n == 1) {
//			head.next
//		}
		for(int i = 0; i <= n-2; i++) {
			if(temp.next != null) {
				temp = temp.next;				
			} else  {
				throw new RuntimeException("n is not valid");
			}
		}
		Node<T> nodeToBeDeleted = temp.next;
		if(nodeToBeDeleted.next != null) {
			temp.next = nodeToBeDeleted.next;
		} else {
			temp.next = null;
		}
	}
	
	
	
	void print() {
		
		if(head == null) {
			System.out.println("LinkedList is empty");
			return;
		}
		Node<T> node = head;
		while(node.next != null) {
			System.out.print(node.data+"  ");
			node = node.next;
		}
		System.out.print(node.data);
		System.out.println();
	}
}
class Node<T> {
	T data;
	Node<T> next;
}
