package com.levon.algorithms.datastructures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stack<T> {

	private List<T> list = new ArrayList<>();
	
	public void push(T data) {
		list.add(data);
	}
	
	public void pop() {
		list.remove(list.size()-1);
	}
	
	public T top() {
		return list.get(list.size()-1);
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}

	public void print() {
		for(T element : list) {
			System.out.println(element);
		}
		
	}
}
