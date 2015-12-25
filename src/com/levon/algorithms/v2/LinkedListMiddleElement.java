package com.levon.algorithms.v2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMiddleElement {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(6);
		list.add(5);
		list.add(9);
		list.add(1);
		list.add(78);
		list.add(23);
		list.add(72);
		list.add(1);
		list.add(45);
	
		System.out.println(findMiddle(list));
	}
	public static Integer findMiddle(List<Integer> list) {
		if(list.isEmpty()) {
			return -1;
		}
		Iterator<Integer> it = list.iterator();
		Iterator<Integer> itDouble = list.iterator();
		int middle = 0;
		while (itDouble.hasNext()) {
			int v = itDouble.next();
			middle = it.next();
			if (itDouble.hasNext()) {
				v = itDouble.next();
				
			}
		}
		return middle;
	}
}
