package com.levon.algorithms.datastructures;

public class LinkedListTest {

	public static void main(String args[]) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.print();
		linkedList.insert(5);
		linkedList.insert(3);
		linkedList.insert(8);
		linkedList.insert(1);
		linkedList.print();
		linkedList.reverseRecursively(linkedList.head);
		linkedList.print();
	}
	
	
}
