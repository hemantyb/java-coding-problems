package Array;

public class Rearrange {
	public static void rearrangeArray(int[] arr) {
		int i = arr.length - 1;
		int j = arr.length - 1;
		while (i >= 0) {
			if (arr[i] == -1) {
				i--;
			} else {
				arr[j--] = arr[i--];
			}
		}
		while (j >= 0) {
			arr[j--] = -1;
		}
	}

	public static void rearrangeArray2(int[] arr) {
		int i = 0;
		int j = 0;
		while (i < arr.length) {
			if (arr[i] == 0) {
				i++;
			} else {
				arr[j++] = arr[i++];
			}
		}
		while (j < arr.length) {
			arr[j++] = 0;
		}
	}

	public static void rearrangeArray3(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				System.out.print(arr[i] + " ");
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
