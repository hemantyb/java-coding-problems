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
		return s.charAt(0) == ' ' ? count : count+1;
	}
	
	public static int countWords2(String s) {
		int count = 0;
		String[] words = s.split(" ");
		for (int i = 0; i < words.length; i++) {
			count++;
		}
		return count;
	}

	public static int countVowels(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'A' ||
				s.charAt(i) == 'e' || s.charAt(i) == 'E' ||
				s.charAt(i) == 'i' || s.charAt(i) == 'I' ||
				s.charAt(i) == 'o' || s.charAt(i) == 'O' ||
				s.charAt(i) == 'u' || s.charAt(i) == 'U') {
				count++;
			}
		}
		return count;
	}

	public static String printVowels(String s) {
		String vowels = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'A' ||
				s.charAt(i) == 'e' || s.charAt(i) == 'E' ||
				s.charAt(i) == 'i' || s.charAt(i) == 'I' ||
				s.charAt(i) == 'o' || s.charAt(i) == 'O' ||
				s.charAt(i) == 'u' || s.charAt(i) == 'U') {
				vowels += s.charAt(i);
			}
		}
		return vowels;
	}

	public static int countConsonant(String s) {
		int vowelCount = 0;
		int consonantCount = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
				if (s.charAt(i) == 'a' || s.charAt(i) == 'A' ||
					s.charAt(i) == 'e' || s.charAt(i) == 'E' ||
					s.charAt(i) == 'i' || s.charAt(i) == 'I' ||
					s.charAt(i) == 'o' || s.charAt(i) == 'O' ||
					s.charAt(i) == 'u' || s.charAt(i) == 'U') {
					vowelCount++;
				} else {
					consonantCount++;
				}
			}
		}
		return consonantCount;
	}

	public static void countEverything(String s) {
		int vowelCount = 0;
		int consonantCount = 0;
		int numericCount = 0;
		int specialCount = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
				if (s.charAt(i) == 'a' || s.charAt(i) == 'A' ||
					s.charAt(i) == 'e' || s.charAt(i) == 'E' ||
					s.charAt(i) == 'i' || s.charAt(i) == 'I' ||
					s.charAt(i) == 'o' || s.charAt(i) == 'O' ||
					s.charAt(i) == 'u' || s.charAt(i) == 'U') {
					vowelCount++;
				} else {
					consonantCount++;
				}
			} else if (ch >= '0' && ch <= '9') {
				numericCount++;
			} else {
				specialCount++;
			}
		}
		System.out.println(vowelCount);
		System.out.println(consonantCount);
		System.out.println(numericCount);
		System.out.println(specialCount);
	}

	public static String removeSpecialChar(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z' || 
				ch >= 'A' && ch <= 'Z' || 
				ch >= '0' && ch <= '9' ||
				ch == ' ') {
				res += ch;
			}
		}
		return res;
	}

	public static String toLowerCase(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				res = res + (char)(ch + 32);
			} else {
				res += ch;
			}
		}
		return res;
	}

	public static String toUpperCase(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				res = res + (char)(ch - 32);
			} else {
				res += ch;
			}
		}
		return res;
	}

	public static String upperToLowerToUpper(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				res = res + (char)(ch - 32);
			} else if (ch >= 'A' && ch <= 'Z') {
				res = res + (char)(ch + 32);
			} else {
				res += ch;
			}
		}
		return res;
	}
}
