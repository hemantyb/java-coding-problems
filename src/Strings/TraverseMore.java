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
	
	public static String insertAstrix(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				res = res + "*" + s.charAt(i);
			} else {
				res += s.charAt(i);
			}
		}
		return res;
	}
}
