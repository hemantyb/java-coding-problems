// 28 August 2025

package Array;

public class Traverse {

	public static int minSum(int[] arr) {
		return Array.Arithmetic.sumOfAllElement(arr) - Array.Arithmetic.largestElement(arr);
	}

	public static int maxSum(int[] arr) {
		return Array.Arithmetic.sumOfAllElement(arr) - Array.Arithmetic.smallestElement(arr);
	}

	public static int minProduct(int[] arr) {
		return Array.Arithmetic.productOfAllElement(arr) / Array.Arithmetic.largestElement(arr);
	}

	public static int maxProduct(int[] arr) {
		return Array.Arithmetic.productOfAllElement(arr) / Array.Arithmetic.smallestElement(arr);
	}

	public static void productsWithoutN1(int[] arr) {
		int[] res = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			res[i] = Array.Arithmetic.productOfAllElement(arr) / arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(res[i]);
		}
	}

}
