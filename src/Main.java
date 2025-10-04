import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int[] arr1 = new int[a];
			for (int i = 0; i < arr1.length; i++) {
				arr1[i] = sc.nextInt();
			}
			int b = sc.nextInt();
			int[] arr2 = new int[b];
			for (int i = 0; i < arr2.length; i++) {
				arr2[i] = sc.nextInt();
			}
			Array.Sort.printRepeatElementInTwoArrayOdd(arr1, arr2);
		}
	}
}
