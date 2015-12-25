package com.levon.amazon.algorithms.sorting.questions;


public class SearchStringInInterspersedArray {
	public static void main(String[] args) {
		String[] str = new String[] {"a", "", "b", "c", "", "d", "t"};
		String x = "b";
		if(str == null || x == null || x == "") {
			throw new RuntimeException();
		}
		int pos = findString(str, 0, str.length-1, x);
		System.out.println(pos);
	}
	
	public static int findString(String[] str, int first, int last, String x) {
		if(first > last) {
			return -1;
		}
		int mid = (first +last)/2;
		if(str[mid].isEmpty()) {
			int left = mid - 1;
			int right = mid + 1;
			while(true) {
				if(left < first && right > last) {
					return -1;
				}
				else if(left >= first && !str[left].isEmpty()) {
					mid = left;
					break;
				}
				else if(right <= last && !str[right].isEmpty()) {
					mid = right;
					break;
				}
				left--;
				right++;
			}
		}
		
		if(str[mid].equals(x)) {
			return mid;
		}
		else if(str[mid].compareTo(x) > 0) {
			return findString(str, first, mid-1, x);
		}
		else {
			return findString(str, mid+1, last, x);
		}
	}
}
