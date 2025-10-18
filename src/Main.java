import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s1 = sc.nextLine();
			System.out.println(Strings.Sort.sortString(s1));
		}
	}
}
