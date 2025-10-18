package Strings;

public class Sort {
	public static String sortString(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				if (s.charAt(i) > s.charAt(j)) {
					res += s.charAt(i);
				}
			}
		}
		return res;
	}

}
