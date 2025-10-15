package Strings;

public class Traverse {
	public static String reverseString(String s) {
		String res = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			res += s.charAt(i);
		}
		return res;
	}

	public static String reverseString2(String s) {
		int i = 0;
		int j = s.length() - 1;

		while (i < j) {
			if (s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			} else {
				return "Not Palindrome";
			}
		}

		return "Palindrome";
	}

	public static int countSpaces(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				count++;
			}
		}
		return count;
	}

	public static int countWords(String s) {
		int count = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == ' ' && s.charAt(i+1) != ' ') {
				count++;
			}
		}
		return count+1;
	}
	
	public static int countWords2(String s) {
		int count = 0;
		String[] words = s.split(" ");
		for (int i = 0; i < words.length; i++) {
			count++;
		}
		return count;
	}
}
