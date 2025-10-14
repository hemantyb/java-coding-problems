import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int size = sc.nextInt();
			int a = sc.nextInt();
			int[] arr1 = new int[a];
			for (int i = 0; i < arr1.length; i++) {
				arr1[i] = sc.nextInt();
			}
			Array.SubArray.printAllSubArraySum(arr1, size);
		}
	}
}
