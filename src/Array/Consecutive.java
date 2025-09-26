// 24 September

package Array;

public class Consecutive {

	public static void consecutiveSubArray(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i+1] - arr[i] == 1) {
				System.out.print(arr[i] + " ");
			} else {
				System.out.println(arr[i]);
			}
		}
		System.out.println(arr[arr.length - 1]);
	}

	public static void lengthConsecutiveSubArray(int[] arr) {
		int count = 1;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i+1] - arr[i] == 1) {
				count++;
			} else {
				System.out.println(count);
				count = 1;
			}
		}
		System.out.println(count);
	}

	public static void longestConsecutiveSubArray(int[] arr) {
		int count = 1;
		int max = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i+1] - arr[i] == 1) {
				count++;
			} else {
				if (count > max) {
					max = count;
				}
				count = 1;
			}
		}
		if (count > max) {
			max = count;
		}
		System.out.println(max);
	}
}
