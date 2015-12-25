package com.levon.amazon.algorithms.queuestack;

public class QueueOnArray {
	
	public static void main(String[] args) {
		QueueOnArray queue = new QueueOnArray();
		queue.enqueue("a");
		queue.enqueue("b");
		queue.enqueue("c");
		System.out.println(queue.dequeue());
	}

	int n = 10;
	String[] queue = new String[n];
	int front = -1;
	int end = -1;
 	
	public void enqueue(String data) {
		if(isFull()) {
			return;
		}
		if(front == -1) {
			front++;
		}
		end = (end+1)%n;
		queue[end] = data;
	}
	public String dequeue() {
		if(front == -1 && end == -1) {
			throw new RuntimeException("cannot dequeue from an empty queue");
		}
		String value = queue[front];
		if(front == end) {
			
			front = -1;
			end = -1;
		}
		else {
			front = (front+1)%n;
		}
		return value;
		
	}
	public boolean isEmpty() {
		if(front == -1 && end == -1) {
			return true;
		}
		return false;
	}
	public boolean isFull() {
//		if(end+1 == queue.length) {
//			return true;
//		}
//		return false;
		return (end+1)%n == front;
	}
	
}
