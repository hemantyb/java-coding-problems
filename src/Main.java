import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.nextLine();
			String res = Strings.TraverseMore.insertAstrix(s);
			System.out.println(res);
		}
	}
}
