// 9 September

package Array;

public class Merge {
	public static int[] mergeThreeArray(int[] arr1, int[] arr2, int[] arr3) {
		int i = 0;

		int[] res = new int[arr1.length + arr2.length + arr3.length];
		int k = 0;
		
		while (k < res.length) {
			if (i < arr1.length) {
				res[k] = arr1[i];
				k++;
			}
			if (i < arr2.length) {
				res[k] = arr2[i];
				k++;
			}
			if (i < arr3.length) {
				res[k] = arr3[i];
				k++;
			}
			i++;
		}
		return res;
	}
}
