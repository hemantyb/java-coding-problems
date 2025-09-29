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

	public static void minPairSum(int[] arr) {
		int min = Integer.MAX_VALUE;
		int n = 0, m = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int sum = arr[i] + arr[j];
				if (sum < min) {
					min = sum;
					n = arr[i];
					m = arr[j];
				}
			}
		}
		System.out.println(n + " " + m);
	}

}
