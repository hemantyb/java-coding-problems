// 30 September

package Strings;

public class TraverseMore {
	public static String trimSpaceStartAndEnd(String s) {
		int si = 0;
		int ei = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				si = i;
				break;
			}
		}
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ') {
				ei = i;
				break;
			}
		}
		String res = "";
		for (int i = si; i <= ei; i++) {
			res += s.charAt(i);
		}
		return res;
	}

	public static String trimExtraSpaces(String s) {
		int si = 0;
		int ei = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				si = i;
				break;
			}
		}
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ') {
				ei = i;
				break;
			}
		}
		String res = "";
		for (int i = si; i <= ei; i++) {
			if (s.charAt(i) != ' ' || 
			   (s.charAt(i) == ' ' && s.charAt(i+1) != ' ')) {
				res += s.charAt(i);
			}
		}
		return res;
	}
	
	public static String removeUnwantedSpaces(String s) {
		String res = "";
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) != ' ' || 
			   (s.charAt(i) == ' ' && s.charAt(i+1) != ' ')) {
				res += s.charAt(i);
			}
		}
		return res;
	}
	
	public static String insertStarBeforeChar(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				res += "*a";
			} else {
				res += s.charAt(i);
			}
		}
		return res;
	}

	public static String insertStarBeforeVowels(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
					ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
					res = res + "*" + ch;
				} else {
					res += ch;
				}
			}
		}
		return res;
	}

	public static String replaceWithStar(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				res += "*";
			} else {
				res += s.charAt(i);
			}
		}
		return res;
	}

	public static String lowercaseToStar(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				res += "*";
			} else {
				res += ch;
			}
		}
		return res;
	}
}
