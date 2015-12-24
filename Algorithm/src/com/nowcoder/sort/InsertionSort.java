package com.nowcoder.sort;

public class InsertionSort {
	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 5, 2, 3 };
		int n = 6;
		int[] r = insertionSort(A, n);
		System.err.println(r);
	}

	private static int[] insertionSort(int[] A, int n) {
		for (int i = 1; i < n; i++) {
			int min = i;
			for (int j = i - 1; j >= 0; j--) {
				if (A[min] < A[j]) {
					int swap = A[j];
					A[j] = A[min];
					A[min] = swap;
					min = j;

				}
			}
		}
		return A;
	}
}
