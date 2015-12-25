package com.levon.amazon.algorithms.queuestack;


public class QueueSample {
	
	public static void main(String[] args) {
		QueueSample queue = new QueueSample();
		queue.queue("2");
		queue.queue("1");
		queue.queue("6");
		queue.queue("3");
		System.out.println(queue.dequeue());
	}

	private Node first;
	private Node last;
	
	public void queue(String data) {
		Node node = new Node(data);
		if(first == null) {
			first = node;
			last = node;
		}
		else {
			last.next = node;
			node.previous = last;
			last = last.next;
			
		}
	}
	
	public String dequeue() {
		String data = null;
		if(first != null) {
			data = first.data;
		}
		if(first.equals(last)) {
			first = null;
			last = null;
			return data;
		}
		first = first.next;
//		last = last.previous;
//		last.next = null;
		return data;
	}
}

class Node {
	
	public String data;
	public Node next;
	public Node previous;
	
	public Node(String data) {
		this.data = data;
	}
} 