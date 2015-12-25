package com.levon.algorithms.sorting.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class HeapTest {

	private List<Integer> heap = new ArrayList<>();

	public static void main(String[] args) {
		HeapTest heap = new HeapTest();
		heap.add(0);
		heap.add(1);
		heap.add(2);
		heap.add(3);
		heap.add(4);
		heap.add(5);
		heap.add(6);
		heap.add(7);
		heap.add(8);
		heap.delete();

	}

	public void add(int data) {

		heap.add(data);
		int k = heap.size() - 1;
		while (k > 0) {
			int p = (k - 1) / 2;
			if (heap.get(k).compareTo(heap.get(p)) > 0) {
				int temp = heap.get(k);
				heap.set(k, heap.get(p));
				heap.set(p, temp);
			} else {
				break;
			}
			k = p;
		}
	}

	public int delete() {
		if (heap.size() == 0) {
			throw new NoSuchElementException();
		}
		if (heap.size() == 1) {
			return heap.remove(0);
		} else {
			heap.set(0, heap.remove(heap.size() - 1));
			int data = heap.get(0);
			remove();
			return data;
		}
	}

	private void remove() {
		int k = 0;
		int left = 2 * k + 1;
		int right = 1;
		while (left < heap.size()) {
			right = left + 1;
			int max = left;
			if (right < heap.size()) {
				if (heap.get(left).compareTo(heap.get(right)) < 0) {
					max = right;
				}
			}
			if (heap.get(k) < heap.get(max)) {
				int temp = heap.get(k);
				heap.set(k, heap.get(max));
				heap.set(max, temp);
				k = max;
				left = 2 * k + 1;
			} else {
				break;
			}

		}
	}

}
