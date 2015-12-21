package com.nowcoder.sort;

public class BubbleSort {
	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 5, 2, 3 };
		int n = 6;
		int[] r = bubbleSort(A, n);
		System.err.println(r);
	}

	private static int[] bubbleSort(int[] A, int n) {
		if (A.length == 0 || n == 0) {
			return null;
		}
		int temp = 0;
		for (int j = 0; j < A.length - 1; j++) {
			for (int i = 0; i < A.length - 1; i++) {
				if (A[i] >= A[i + 1]) {
					temp = A[i];
					A[i] = A[i + 1];
					A[i + 1] = temp;
				}
			}
		}

		return A;
	}

}
