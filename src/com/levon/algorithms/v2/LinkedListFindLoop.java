package com.levon.algorithms.v2;

import java.util.Iterator;
import java.util.List;

public class LinkedListFindLoop {
	
	public static boolean findMiddle(List<Integer> list) {
		if(list.isEmpty()) {
			return false;
		}
		Iterator<Integer> it = list.iterator();
		Iterator<Integer> itDouble = list.iterator();
		Integer fast = 0;
		Integer slow = 0;
		while (itDouble.hasNext()) {
			itDouble.next();
			if (itDouble.hasNext()) {
				itDouble.next();
				fast = it.next();
			}
			if(fast == slow) {
				return true;
			}
		}
		return false;
	}
}
