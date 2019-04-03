package com.bridgelabz.algorithm;

public class MergeSortAlgorithm {
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print("  " + array[i]);
		}
	}

	public static int[] mergeSort(int[] array) {
		int right[];
		if (array.length <= 1) {
			return array;
		}
		int mid = array.length / 2;
		int left[] = new int[mid];
		if (array.length % 2 == 0) {
			right = new int[mid];
		} else {
			right = new int[mid + 1];
		}

		for (int i = 0; i < mid; i++) {
			left[i] = array[i];
		}
		// Arrays.sort(left);
		for (int j = 0; j < right.length; j++) {
			right[j] = array[mid + j];
		}
//Arrays.sort(right);
		int result[] = new int[array.length];
		left = mergeSort(left);
		right = mergeSort(right);
		result = merge(left, right);

		return result;
	}

	public static int[] merge(int[] left, int[] right) {

		int result[] = new int[left.length + right.length];

		int leftPointer = 0, rightPointer = 0, resultPointer = 0;
		// leftPointer = rightPointer = resultPointer = 0;
		while (leftPointer < left.length || rightPointer < right.length) {
			if (leftPointer < left.length && rightPointer < right.length) {

				if (left[leftPointer] < right[rightPointer]) {
					result[resultPointer++] = left[leftPointer++];
				} else {
					result[resultPointer++] = right[rightPointer++];
				}

			} else if (leftPointer < left.length) {
				result[resultPointer++] = left[leftPointer++];
			} else if (rightPointer < right.length) {
				result[resultPointer++] = right[rightPointer];
			}

		}
		return result;

	}

	public static void main(String[] args) {
		int[] array = { 99, 98, 97, 96, 95, 94, 93, 92, 91, 90 };

		System.out.println("Initial Array");
		printArray(array);
		System.out.println("Sorted Array");
		array = mergeSort(array);
		printArray(array);

	}
}