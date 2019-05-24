package _02palindrome;

public class Palindrome {

	public static boolean palindrome(String str) {

		String reverseStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			reverseStr += c;
		}

		if (str.equalsIgnoreCase(reverseStr)) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		String str = "Malayalam";
		boolean isPalindrome = palindrome(str);
		if (isPalindrome) {
			System.out.println("String " + str + " is Palindrome");
		} else {
			System.out.println("String " + str + " is not Palindrome");
		}

	}

}
