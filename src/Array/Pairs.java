package Array;

public class Pairs {
	public static void arrayPairs(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				System.out.println(arr[i] + " " + arr[j]);
			}
		}
	}

	public static void arrayPairsSumK(int[] arr, int k) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == k) {
					System.out.println(arr[i] + " " + arr[j]);
				}
			}
		}
	}

}
