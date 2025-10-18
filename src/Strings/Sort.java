package Strings;

public class Sort {
	public static String sortString(String s) {
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			for (int j = i + 1; j < chars.length; j++) {
				if (chars[i] > chars[j]) {
					char temp = chars[i];
					chars[i] = chars[j];
					chars[j] = temp;
				}
			}
		}
		return new String(chars);
	}

}
