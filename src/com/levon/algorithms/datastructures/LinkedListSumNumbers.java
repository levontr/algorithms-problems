package com.levon.algorithms.datastructures;

public class LinkedListSumNumbers {

	
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		list1.insert(1);
		list1.insert(6);
		list1.insert(7);
		list2.insert(5);
		list2.insert(8);
		list2.insert(9);
		LinkedList<Integer> list3 = new LinkedList<>();
		Integer carry = new Integer(0);
		Node<Integer> result = addListSameSize(list1.head, list2.head, carry);
		list3.head = result;
		System.out.println(1);
	}
	
	public static Node<Integer> addListSameSize(Node<Integer> node1,
			Node<Integer> node2, Integer carry) {
		if (node1 == null) {
			return null;
		}
		Node<Integer> resultNode = new Node<>();
		resultNode.next = addListSameSize(node1.next, node2.next,
				carry);
		
		int sum = node1.data + node2.data + carry;
		resultNode.data = sum % 10;
		carry = sum / 10;
		System.out.println("carry = "+carry);
		return resultNode;
	}
}
