package com.levon.algorithms.sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Questions {

	public static void main(String[] args) {
		int[] a = new int[]{1,2,4,7,0,0,0,0,0,0,0,0,0};
		int[] b = new int[]{3,5,6,8,9};
		int[] c= mergeSortedArrays2(a, b);
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
		}
		
		///
	}
	//11.1
	public static int[] mergeSortedArrays(int[] a, int[] b) {
		int[] c = new int[a.length+b.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < a.length && j < b.length) {
			if(a[i] <= b[j]) {
				c[k] = a[i];
				i++;
			}
			else if(a[i] > b[j]) {
				c[k] = b[j];
				j++;
			}
			k++;
		}
		while(i < a.length) {
			c[k] = a[i];
			k++;
			i++;
		}
		while(j < b.length) {
			c[k] = b[j];
			k++;
			j++;
		}
		return c;
	}
	//11.2
	public static int[] mergeSortedArrays2(int[] a, int[] b) {
		int i = 4-1;
		int j = b.length-1;
		int k = 9-1;
		while(i >= 0 && j >= 0) {
			if(a[i] >= b[j]) {
				a[k] = a[i];
				i--;
			}
			else if(a[i] < b[j]) {
				a[k] = b[j];
				j--;
			}
			k--;
		}
		while(i >= 0 ) {
			a[k] = a[i];
			k--;
			i--;
		}
		while(j >= 0) {
			a[k] = b[j];
			k--;
			j--;
		}
		return a;
	}
	
}
