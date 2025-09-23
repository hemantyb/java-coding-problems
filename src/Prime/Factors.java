package Prime;

public class Factors {

	public static int countFactors(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		return count;
	}

	public static void printFactors(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static boolean primeCheck(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void printFactorsBetween(int n, int m) {
		for (int i = n; i <= m; i++) {
			if (primeCheck(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static void primeFirstNFactors(int n) {
		int count = 0;
		for (int i = 2; count < n; i++) {
			if (primeCheck(i)) {
				count++;
				if (n == count) {
					System.out.println(i);
				}
			}
		}
	}

	public static void printFactorGreterThanM(int n, int m) {
		int count = 0;
		int candidate = m + 1;
		while (count < n) {
			if (primeCheck(candidate)) {
				System.out.println(candidate);
				if (count < n - 1) {
					System.out.print(" ");
				}
				count++;
			}
			candidate++;
		}
	}
}