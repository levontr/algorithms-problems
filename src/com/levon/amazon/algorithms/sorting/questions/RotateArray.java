package com.levon.amazon.algorithms.sorting.questions;

import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {

	}

	public static void rotateArray(int[] arr, int distance) {
		for (int i = 0; i < distance; i++) {
			int temp = arr[0];
			for (int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[arr.length - 1] = temp;
		}
		System.out.println("Rotated Arrays is :" + Arrays.toString(arr));
	}
}