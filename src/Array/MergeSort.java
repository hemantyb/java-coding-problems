// 8 September

package Array;

public class MergeSort {
	public static void mergeArray(int[] arr1, int[] arr2) {
		int[] bigArray = new int[arr1.length + arr2.length];

		for (int i = 0; i < arr1.length; i++) {
			bigArray[i] = arr1[i];
		}

		for (int i = 0 ; i < arr2.length; i++) {
			bigArray[arr1.length + i] = arr2[i];
		}

		for (int i = 0; i < bigArray.length; i++) {
			System.out.print(bigArray[i] + " ");
		}
	}

	public static int[] sortTwoArray(int[] arr1, int[] arr2) {
		int[] res = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] >= arr2[j]) {
				res[k++] = arr2[j++];
			} else {
				res[k++] = arr1[i++];
			}
		}

		while (i < arr1.length) {
			res[k++] = arr1[i++];
		}

		while (j < arr2.length) {
			res[k++] = arr2[j++];
		}

		return res;
	}
}
