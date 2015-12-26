package com.nowcoder.sort;

import com.nowcoder.utils.ArrayUtils;

public class QuickSort {
	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 5, 2, 3 };
		int n = 6;
		int[] r = quickSort(A, n);
		ArrayUtils.printArray(r);
	}

	private static int[] quickSort(int[] A, int n) {
		if (A == null || A.length < 2) {
			return null;
		}
		return process(A, 0, A.length - 1);
	}

	private static int[] process(int[] a, int left, int right) {
		if (left < right) {
			int random = left + (int) (Math.random() * (right - left + 1));
			swap(a, random, right);
			int mid = partition(a, left, right);
			process(a, left, mid - 1);
			process(a, mid + 1, right);
		}
		return a;
	}

	private static int partition(int[] a, int left, int right) {
		int pivot = left - 1;
		int index = left;
		while (index <= right) {
			if (a[index] <= a[right]) {
				swap(a, ++pivot, index);
			}
			index++;
		}
		return pivot;
	}

	private static void swap(int[] a, int index1, int index2) {
		int tmp = a[index1];
		a[index1] = a[index2];
		a[index2] = tmp;

	}
}
