package _03anagram;

import java.util.Arrays;

public class Anagram {

	public static boolean anagram(String str1, String str2) {

		if (str1.length() == str2.length()) {

			str1 = str1.toLowerCase();
			str2 = str2.toLowerCase();

			char[] c1 = str1.toCharArray();
			char[] c2 = str2.toCharArray();

			Arrays.sort(c1);
			Arrays.sort(c2);

			for (int i = 0, j = 0; i < c1.length; i++, j++) {
				if (c1[i] == c2[j]) {
					continue;
				} else {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String str1 = "Taher";
		String str2 = "Earth";
		boolean isAnagram = anagram(str1, str2);
		if (isAnagram) {
			System.out.println("Both Strings " + str1 + " and " + str2 + " are Anagram");
		} else {
			System.out.println("Both Strings " + str1 + " and " + str2 + " are not Anagram");
		}
	}

}
