// 7 October

package Strings;

public class Word {
	public static String printEachWord(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				System.out.println(res);
				res = "";
			} else {
				res += s.charAt(i);
			}
		}
		return res;
	}
	
	// so many variations can be done using this method
	// like reverse word in sentence, print count next to word
	// just use look in main method, and play with for loop
	public static String[] printEachWord2(String s) {
		int wordCount = Traverse.countWords(s);
		String[] arr = new String[wordCount];
		String res = "";
		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				res += s.charAt(i);
			} else if (res.length() > 0) {
				arr[j] = res;
				j++;
				res = "";
			}
		}
		if (res.length() > 0) {
			arr[j] = res;
		}
		return arr;
	}

	public static String smallestWord(String s) {
		String[] arr = s.split("\\s+");
		int min = Integer.MAX_VALUE;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() < min) {
				min = arr[i].length();
				index = i;
			}
		}
		return arr[index];
	}
	
	public static String largestWord(String s) {
		String[] arr = s.split("\\s+");
		int max = Integer.MIN_VALUE;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > max) {
				max = arr[i].length();
				index = i;
			}
		}
		return arr[index];
	}

}
