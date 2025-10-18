// 3 October

package Strings;

public class Index {
	public static int firstIndexOf(String s, char c) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				return i;
			}
		}
		return -1;
	}

	public static int lastIndexOf(String s, char c) {
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == c) {
				return i;
			}
		}
		return -1;
	}
	
	public static String isSubsequenceString(String s1, String s2) {
		int i = 0;
		int j = 0;
		while (i < s1.length() && j < s2.length()) {
			if (s1.charAt(i) == s2.charAt(j)) {
				i++;
				j++;
			} else {
				i++;
			}
		}
		return j == s2.length() ? "Yes" : "No";
	}
	
	public static boolean checkPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public static void printAllPalindrome(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j < s.length(); j++) {
				String subString = s.substring(i, j);
				if (checkPalindrome(subString)) {
					System.out.println(subString);
				}
			}
		}
	}
	
	public static String findLongestPalindrome(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				String subString = s.substring(i, j);
				if (checkPalindrome(subString) && subString.length() > res.length()) {
					res = subString;
				}
			}
		}
		return res;
	}
}
