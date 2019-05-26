package _04charoccurence;

public class CharOccurence {

	public static void charOccurence(String str) {
		str = str.toLowerCase();
		while (str.length() > 0) {
			int occurence = 0;
			char firstIndex = str.charAt(0);
			String s = "Char " + firstIndex + " occurs ";
			for (int i = 0; i < str.length(); i++) {
				if (firstIndex == str.charAt(i)) {
					++occurence;
				}
			}
			System.out.println(s + occurence + " times");
			str = str.replace(firstIndex, ' ');
			str = str.replace(" ", "");
		}
	}

	public static void main(String[] args) {
		String str = "India";
		charOccurence(str);
	}
}
