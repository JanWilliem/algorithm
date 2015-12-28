package com.nowcoder.sort;

public class MergeSort {
	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 5, 2, 3 };
		int n = 6;
		int[] r = mergeSort(A, n);
		System.err.println(r);
	}

	private static int[] mergeSort(int[] A, int n) {
		if (A == null || A.length < 2) {
			return null;
		}
		return process(A, 0, A.length - 1);
	}

	private static int[] process(int[] a, int left, int right) {
		if (left == right) {
			return null;
		}
		int mid = (left + right) / 2;
		process(a, left, mid);
		process(a, mid + 1, right);
		merge(a, left, mid, right);
		return a;
	}

	private static void merge(int[] a, int left, int mid, int right) {
		int[] help = new int[right - left + 1];
		int l = left;
		int r = mid + 1;
		int index = 0;
		while (l <= mid && r <= right) {
			if (a[l] <= a[r]) {
				help[index++] = a[l++];
			} else {
				help[index++] = a[r++];
			}
		}
		while (l <= mid) {
			help[index++] = a[l++];
		}
		while (r <= right) {
			help[index++] = a[r++];
		}
		for (int i = 0; i < help.length; i++) {
			a[left + i] = help[i];
		}
	}
}
