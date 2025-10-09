// 2 September
// 4
// 5

package Array;

public class Sort {
	
	public static void OccurrenceOfElement(int[] arr) {
		int count = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i+1]) {
				count++;
			} else {
				System.out.println(arr[i] + " - " + count);
				count = 1;
			}
		}
		System.out.println(arr[arr.length - 1] + " - " + count);
	}

	public static void printElementWithoutRepeat(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i+1]) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println(arr[arr.length - 1]);
	}

	public static void printUniqueElement(int[] arr) {
		int count = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i+1]) {
				count++;
			} else {
				if (count == 1) {
					System.out.print(arr[i] + " ");
				}
				count = 1;
			}
		}
		if (count == 1) {
			System.out.println(arr[arr.length - 1]);
		}
	}

	public static int printCountOfUniqueElement(int[] arr) {
		int uniqueCount = 0;
		int count = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i+1]) {
				count++;
			} else {
				if (count == 1) {
					uniqueCount++;
				}
				count = 1;
			}
		}
		if (count == 1) {
			uniqueCount++;
		}
		return uniqueCount;
	}

	public static int largestRepeatingElement(int[] arr) {
		int largest = -1;
		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i] == arr[i-1]) {
				largest = arr[i];
			}
		}	
		return largest;
	}

	public static int smallestRepeatingElement(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arr[i+1]) {
				return arr[i];
			}
		}
		return -1;
	}

	public static int countOccurrenceOfK(int[] arr, int k) {
		int max = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (k == arr[i]) {
				max++;
			}
		}
		return max;
	}
	
	public static int smallestRepeatingElementDesc(int[] arr) {
		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i] == arr[i-1]) {
				return arr[i];
			}
		}
		return -1;
	}

	public static void printRepeatElementInTwoArray(int[] arr1, int[] arr2) {
		int i = 0;
		int j = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] == arr2[j]) {
				System.out.println(arr2[j]);
				i++;
				j++;
			} else if (arr1[i] > arr2[j]) {
				j++;
			} else {
				i++;
			}
		}
	}

	public static void printRepeatElementInTwoArrayOdd(int[] arr1, int[] arr2) {
	    int i = 0;
	    int j = 0;
	    while (i < arr1.length && j < arr2.length) {
	        if (arr1[i] == arr2[j]) {
	            if (arr1[i] % 2 != 0) {
	                System.out.println(arr2[j]);
	            }
	            i++;
	            j++;
	        } else if (arr1[i] > arr2[j]) {
	            j++;
	        } else {
	            i++;
	        }
	    }
	}

	// variation: first array ascending and second one descending
	public static void printRepeatElementInTwoArray2(int[] arr1, int[] arr2) {
		int i = 0;
		int j = arr2.length - 1;
		while (i < arr1.length && j >= 0) {
			if (arr1[i] == arr2[j]) {
				System.out.println(arr2[j]);
				i++;
				j--;
			} else if (arr1[i] > arr2[j]) {
				j--;
			} else {
				i++;
			}
		}
	}

	// variation: first array descending and second one ascending
	public static void printRepeatElementInTwoArray3(int[] arr1, int[] arr2) {
		int i = arr1.length - 1;
		int j = 0;
		while (i >= 0 && j < arr2.length) {
			if (arr1[i] == arr2[j]) {
				System.out.println(arr2[j]);
				i--;
				j++;
			} else if (arr1[i] > arr2[j]) {
				j++;
			} else {
				i--;
			}
		}
	}

	// variation: both arrays are in descending order
	public static void printRepeatElementInTwoArray4(int[] arr1, int[] arr2) {
		int i = arr1.length - 1;
		int j = arr2.length - 1;
		while (i >= 0 && j >= 0) {
			if (arr1[i] == arr2[j]) {
				System.out.println(arr2[j]);
				i--;
				j--;
			} else if (arr1[i] > arr2[j]) {
				j--;
			} else {
				i--;
			}
		}
	}
}
