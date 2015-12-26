package com.nowcoder.sort;

import com.nowcoder.utils.ArrayUtils;

public class SelectionSort {
	public static void main(String[] args) {
		int[] A = { 54, 35, 48, 36, 27, 12, 44, 44, 8, 14, 26, 17, 28 };
		int n = 13;
		int[] r = selectionSort(A, n);
		ArrayUtils.printArray(r);
	}

	private static int[] selectionSort(int[] A, int n) {
		int mini = 0;
		for (int i = 0; i < n - 1; i++) {
			mini = i;
			for (int j = i + 1; j < n; j++) {
				if (A[mini] > A[j])
					mini = j;
			}
			int swap = A[mini];
			A[mini] = A[i];
			A[i] = swap;

		}
		return A;
	}
}
