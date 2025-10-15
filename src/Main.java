import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int[] arr1 = new int[a];
			for (int i = 0; i < arr1.length; i++) {
				arr1[i] = sc.nextInt();
			}
			Array.Rearrange.rearrangeArray2(arr1);
			for (int i = 0; i < arr1.length; i++) {
				System.out.print(arr1[i] + " ");
			}
		}
	}
}
