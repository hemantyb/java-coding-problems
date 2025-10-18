import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s1 = sc.nextLine();
			String[] res = Strings.Word.printEachWord2(s1);
			for (int i = 0; i < res.length; i++) {
				System.out.print(res[i] + " ");
			}
			System.out.println();

			for (int i = res.length - 1; i >= 0; i--) {
				System.out.print(res[i] + " ");
			}
			System.out.println();
			
			for (int i = 0; i < res.length; i++) {
				System.out.print(res[i] + res[i].length() + " ");
			}
			System.out.println();
			
			for (int i = 0; i < res.length; i++) {
				System.out.print(Strings.Traverse.reverseString(res[i]) + " ");
			}
			System.out.println();
			
			for (int i = res.length - 1; i >= 0; i--) {
				System.out.print(Strings.Traverse.reverseString(res[i]) + " ");
			}
			System.out.println();
			
			for (int i = 1; i < res.length; i+= 2) {
				System.out.print(res[i] + res[i - 1] + " ");
			}
			System.out.println();
			
			int start = 0;
			int end = res.length - 1;
			while (start < end) {
				System.out.print(res[start] + res[end] + " ");
				start++;
				end--;
			}
			System.out.println();
			
		}
	}
}
