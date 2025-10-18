// 6 October

package Strings;

public class Substring {
	public static void printSubString(String s, int size) {
		for (int i = 0; i <= s.length() - size; i++) {
			String res = "";
			for (int j = i; j < i + size; j++) {
				res += s.charAt(j);
			}
			System.out.println(res);
		}
	}
	
	public static int countSubString(String s, int size) {
		int count = 0;
		for (int i = 0; i <= s.length() - size; i++) {
			count++;
		}
		return count;
	}
	
	public static String isSubstring(String s1, String s2) {
		int size = s2.length();
		for (int i = 0; i <= s1.length() - size; i++) {
			String res = "";
			for (int j = i; j < size + i; j++) {
				res += s1.charAt(j);
			}
			if (res.equals(s2)) {
				return "Yes";
			}
		}
		return "No";
	}
	
	public static int countOccurrence(String s1, String s2) {
		int count = 0;
		int size = s2.length();
		for (int i = 0; i <= s1.length() - size; i++) {
			String res = "";
			for (int j = i; j < size + i; j++) {
				res += s1.charAt(j);
			}
			if (res.equals(s2)) {
				count++;
			}
		}
		return count;
	}
	
	public static void palindromeSubstring(String s, int size) {
		for (int i = 0; i <= s.length() - size; i++) {
			String res = "";
			for (int j = i; j < i + size; j++) {
				res += s.charAt(j);
			}
			if (Index.checkPalindrome(res)) {
				System.out.println(res);
			}
		}
	}

	public static void notPalindromeSubstring(String s, int size) {
		for (int i = 0; i <= s.length() - size; i++) {
			String res = "";
			for (int j = i; j < i + size; j++) {
				res += s.charAt(j);
			}
			if (!(Index.checkPalindrome(res))) {
				System.out.println(res);
			}
		}
	}
	
	public static void printAllSubstring(String s) {
		for (int size = 1; size <= s.length(); size++) {
			for (int i = 0; i <= s.length() - size; i++) {
				String res = "";
				for (int j = i; j < i + size; j++) {
					res += s.charAt(j);
				}
				System.out.println(res);
			}
		}
	}

	public static void printAllSubstringDesc(String s) {
		for (int size = s.length(); size > 0; size--) {
			for (int i = 0; i <= s.length() - size; i++) {
				String res = "";
				for (int j = i; j < i + size; j++) {
					res += s.charAt(j);
				}
				System.out.println(res);
			}
		}
	}

	public static void printAllPalidromicSubstring(String s) {
		for (int size = 1; size <= s.length(); size++) {
			for (int i = 0; i <= s.length() - size; i++) {
				String res = "";
				for (int j = i; j < i + size; j++) {
					res += s.charAt(j);
				}
				if (Index.checkPalindrome(res)) {
					System.out.println(res);
				}
			}
		}
	}

	public static void longestPalidromicSubstring(String s) {
		for (int size = s.length(); size > 0; size--) {
			for (int i = 0; i <= s.length() - size; i++) {
				String res = "";
				for (int j = i; j < i + size; j++) {
					res += s.charAt(j);
				}
				if (Index.checkPalindrome(res)) {
					System.out.println(res);
					return;
				}
			}
		}
	}
}
