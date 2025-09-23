package Numbers;

public class Digits {

	public static int findMax(int a, int b, int c) {
		int max = a;
		if (max < b)
			max = b;
		if (max < c)
			max = c;
		return max;
	}

	public static int findMix(int a, int b, int c) {
		int min = a;
		if (min > b)
			min = b;
		if (min > c)
			min = c;
		return min;
	}

	public static int sumOfDigit(int n) {
		int sum = 0;
		while (n > 0) {
			int last = n % 10;
			sum += last;
			n /= 10;
		}
		return sum;
	}

	public static int reverseDigit(int n) {
		int rev = 0;
		while (n > 0) {
			int last = n % 10;
			rev = rev * 10 + last;
			n /= 10;
		}
		return rev;
	}
}