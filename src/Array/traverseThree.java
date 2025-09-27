package Array;

public class traverseThree {
	public static int findMissingElement(int[] array) {
		int n = array.length+1;
		int sum = n*(n+1)/2;
		int totalSum = 0;
		for(int i: array) {
			totalSum+= i;
		}
		return sum - totalSum;
	}
}
