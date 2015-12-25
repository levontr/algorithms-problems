package com.levon.algorithms;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
//TODO - does not work
public class ReverseLinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		linkedList.add("e");
		linkedList.add("f");
		LinkedList<String> reversedLinkedList = reverseLinkedList(linkedList);


	}
	public static LinkedList<String> reverseLinkedList(LinkedList<String> linkedList) {

		Iterator<String> listIterator = linkedList.iterator();
		LinkedList<String> reversedLinkedList = new LinkedList<String>();

		return reverseRecursively(listIterator, reversedLinkedList);
	}

	public static LinkedList<String> reverseRecursively(Iterator listIterator, LinkedList<String> reversedLinkedList) {

		if(!listIterator.hasNext()) {
			reversedLinkedList.add((String)listIterator.next());
			System.out.println("The last element is - ");
			return reverseLinkedList(reversedLinkedList);
		}
		listIterator.next();
		return reverseRecursively(listIterator, reversedLinkedList);
	}
	
//	private void reverse(Node curr) {
//        if(isEmpty()) { return;}     //curr == null
//        if(curr.next == null) {
//            head = curr;
//            return;
//        }
//        reverse(curr.next);
//        curr.next.next = curr;
//        curr.next = null;
//    }
	
/*	public static LinkedList reverse(LinkedList node) {
	    LinkedList previous = null;
	    while (node != null) {
	        LinkedList next = node.next();
	        Node.next = previous;
	        previous = Node;
	        Node = next;
	    }
	    return previous;
	}*/
}
