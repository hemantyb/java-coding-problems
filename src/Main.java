import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s1 = sc.nextLine();
			Strings.Substring.longestPalidromicSubstring(s1);
		}
	}
}
