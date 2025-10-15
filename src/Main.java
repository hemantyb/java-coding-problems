import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.nextLine();
			int res = Strings.Traverse.countWords(s);
			System.out.println(res);
		}
	}
}
