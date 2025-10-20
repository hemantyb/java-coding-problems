import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s1 = sc.nextLine();
			String s2 = sc.nextLine();
			String res = Strings.Substring.isSubstring2(s1, s2);
			System.out.println(res);
		}
	}
}
