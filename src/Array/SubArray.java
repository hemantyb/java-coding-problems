// 18 September
// 19

package Array;

public class SubArray {

	public static void printSubArray(int[] arr, int size) {
		for (int i = 0; i <= arr.length - size; i++) {
			for (int j = i; j < i + size; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
	}

	public static void printSubArraySum(int[] arr, int size) {
		for (int i = 0; i <= arr.length - size; i++) {
			int sum = 0;
			for (int j = i; j < i + size; j++) {
				sum += arr[j];
			}
			System.out.println(sum);
		}
	}

	public static int countSubArrayEqualToK(int[] arr, int size, int k) {
		int count = 0;
		for (int i = 0; i <= arr.length - size; i++) {
			int sum = 0;
			for (int j = i; j < i + size; j++) {
				sum += arr[j];
			}
			if (sum == k)
				count++;
		}
		return count;
	}

	public static void printsubArrayEqualToK(int[] arr, int size, int k) {
		for (int i = 0; i <= arr.length - size; i++) {
			int sum = 0;
			for (int j = i; j < i + size; j++) {
				sum += arr[j];
			}
			if (sum == k) {
				for (int j = i; j < i + size; j++) {
					System.out.print(arr[j] + " ");
				}
				System.out.println();
			}
		}
	}

	public static void printAllSubArray(int[] arr) {
		for (int i = 1; i <= arr.length; i++) {
			printSubArray(arr, i);
		}
	}

	public static void printAllSubArraySum(int[] arr) {
		for (int i = 1; i <= arr.length; i++) {
			printSubArraySum(arr, i);
		}
	}

	public static int countAllSubArraySum(int[] arr, int k) {
		int count = 0;
		for (int size = 1; size <= arr.length; size++) {
			for (int i = 0; i < arr.length - 1; i++) {
				int sum = 0;
				for (int j = i; j < arr.length; j++) {
					sum += arr[j];
				}
				if (sum == k)
					count++;
			}
		}
		return count;
	}

	public static void printAllSubArraySum(int[] arr, int k) {
		for (int size = 1; size <= arr.length; size++) {
			for (int i = 0; i <= arr.length - size; i++) {
				int sum = 0;
				for (int j = i; j < i + size; j++) {
					sum += arr[j];
				}
				if (sum == k) {
					for (int j = i; j < i + size; j++) {
						System.out.print(arr[j] + " ");
					}
					System.out.println();
				}
			}
		}
	}
}
