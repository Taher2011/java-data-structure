package reversestring;

public class ReverseString {

	public static String reverseString(String str) {

		String reverseStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			reverseStr += c;
		}
		return reverseStr;
	}

	public static void main(String[] args) {
		String str = "Taher";
		String reverseStr = reverseString(str);
		System.out.println("Reverse of " + str + " is " + reverseStr);
	}

}
