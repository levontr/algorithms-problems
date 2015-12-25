package com.levon.algorithms.sorting.questions;


public class LinkedListTest {

	private Node head;
	private Node tail;
	
	public static void main(String[] args) {
		LinkedListTest linkedList = new LinkedListTest();
		linkedList.add("1");
		linkedList.add("2");
		linkedList.add("3");
		linkedList.add("4");
		linkedList.add("5");
		linkedList.add("6");
		
		System.out.println(linkedList.findNthElement(2));
	}
	
	public void add(String data) {
		if(head == null) {
			head = new Node(data);
			tail = head;
		}
		else {
			Node temp = new Node(data);
			tail.next = temp;
			tail = temp;
		}
	}
	
//	public String findNthElementRec(Node node, int n) {
//		if(node.next == null) {
//			re
//		}
//	}
	public Node findNthElement(int n) {
		return findNthElement(head, n);
	}
	private Node findNthElement(Node head, int n) {
		Node iter1 = head;
		Node iter2 = head;
		for(int i = 1; i < n; i++){
			if(iter1 == null) {
				return null;
			}
			iter1 = iter1.next;
		}
		while(iter1.next != null) {
			iter1 = iter1.next;
			iter2 = iter2.next;
		}
		return iter2;
	}
}

class Node{
     public Node next;
    private String data;

    public Node(String data){
        this.data = data;
    }
  
    public String data() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node next() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
  
    public String toString(){
        return this.data;
    }
}