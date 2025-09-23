// 25 August 2025
// 26 August 2025

package Array;

public class Arithmetic {

	public static int sumOfAllElement(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static int productOfAllElement(int[] arr) {
		int prod = 1;
		for (int i = 0; i < arr.length; i++) {
			prod *= arr[i];
		}
		return prod;
	}

	public static int largestElement(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int indexOfLargestElement(int[] arr) {
		int max = Integer.MIN_VALUE;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				index = i;
			}
		}
		return index;
	}

	public static int smallestElement(int[] arr) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int indexOfSmallestElement(int[] arr) {
		int min = Integer.MAX_VALUE;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				index = i;
			}
		}
		return index;
	}

	public static int occurrenceOfElement(int[] arr, int k) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k)
				count++;
		}
		return count;
	}

	public static int occurrenceofLargestElement(int[] arr) {
		int max = Integer.MIN_VALUE;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				count = 1;
			} else if (arr[i] == max) {
				count++;
			}
		}
		return count;
	}

	public static int indexOfK(int[] arr, int k) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k) {
				return i;
			}
		}
		return -1;
	}

}
