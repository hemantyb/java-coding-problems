// 24 September
// 25

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

	public static void printLongestConsecutiveSubArray(int[] arr) {
		int count = 1;
		int max = 0;
		int ei = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i+1] - arr[i] == 1) {
				count++;
			} else {
				if (count > max) {
					max = count;
					ei = i;
				}
				count = 1;
			}
		}
		if (count > max) {
			max = count;
			ei = arr.length - 1;
		}
		int si = ei - max + 1;
		for (int i = si; i <= ei; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void sortedConsecutiveSubArray(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i+1] >= arr[i]) {
				System.out.print(arr[i] + " ");
			} else {
				System.out.println(arr[i]);
			}
		}
		System.out.println(arr[arr.length - 1]);
	}

	public static void sortedLongestConsecutiveSubArray(int[] arr) {
		int count = 1;
		int max = 0;
		int ei = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i+1] >= arr[i]) {
				count++;
			} else {
				if (count > max) {
					max = count;
					ei = i;
				}
				count = 1;
			}
		}
		if (count > max) {
			max = count;
			ei = arr.length - 1;
		}
		int si = ei - max + 1;
		for (int i = si; i <= ei; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
