package com.levon.amazon.algorithms.sorting;

import java.util.Random;

public class QuickSort2 {
	public static void main(String[] args) {
		int[] ar = new int[] {77,2,3,44,6,1,4,8};
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		quickSort(ar, 0, ar.length-1);
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}
	public static void quickSort(int[] ar, int start, int end) {
		if(start < end) {
			int partitionIndex = randomizedPartition(ar, start, end);
			quickSort(ar, start, partitionIndex-1);
			quickSort(ar, partitionIndex+1, end);
			
		}
	}
	public static int partition(int[] ar, int start, int end) {
		int pivot = ar[end];
		int partitionIndex = start;
		for (int i = start; i < end; i++) {
			if(ar[i] <= pivot) {
				int temp = ar[i];
				ar[i] = ar[partitionIndex];
				ar[partitionIndex] = temp;
				partitionIndex++;
			}
		}
		int temp = ar[partitionIndex];
		ar[partitionIndex] = ar[end];
		ar[end] = temp;
		return partitionIndex;
	}
	
	public static int randomizedPartition(int[] ar, int start, int end) {
		int partitionIndex = randomNumber(start, end);
		int temp = ar[partitionIndex];
		ar[partitionIndex] = ar[end];
		ar[end] = temp;
		return partition(ar, start, end);
	}
	public static int randomNumber(int start, int end) {
		Random rand = new Random();
	    return rand.nextInt((end - start) + 1) + start;
	}
}
