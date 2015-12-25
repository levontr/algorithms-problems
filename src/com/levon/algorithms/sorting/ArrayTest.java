package com.levon.algorithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayTest {
	
	public static void main(String[] args) {
		int[] A = new int[]{2,5,4,7,1,9,7,6,0,8,14};
		int[] m = new int[A.length];
		    Arrays.fill(m, 1);
		  
		    for(int x=1; x <A.length; x++)
		      for(int y = 0; y < x; y++) 
		        if(m[y] >= m[x] && A[y] < A[x]) 
		          m[x]++; 
		  
		    int max = m[0]; 
		    for (int i = 0; i < m.length; i++) 
		      if (max < m[i]) 
		        max = m[i]; 
		  
		    List<Integer> result = new ArrayList<Integer>(); 
		    for (int i = m.length-1; i >=0 ; i--) 
		      if (max == m[i]) { 
		        result.add(A[i]); 
		        max--; 
		      }
		  
		    Collections.reverse(result); 
		 for(Integer in : result) {
			 System.out.print(in+" ");
		 }
	}
	
//	public int[] findLongestSubsequence(int[] array) {
//		List<Integer> sequence = new ArrayList<>();
//		for(int i=0; i<array.length-1; i++) {
//			if(array[i] < array[i+1]) {
//				sequence.add(array[i]);
//			}
//			else {
//				Arrays.fi
//			}
//		}
//	} 

}
