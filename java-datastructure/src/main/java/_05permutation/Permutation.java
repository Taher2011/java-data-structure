package _05permutation;

public class Permutation {

	public static String swap(String str, int i, int j) {
		char temp;
		char[] c = str.toCharArray();
		temp = c[i];
		c[i] = c[j];
		c[j] = temp;
		return String.valueOf(c);
	}

	public static void permute(String str, int startingIndex, int lastIndex) {
		if (startingIndex == lastIndex) {
			System.out.println(str);
		} else {
			for (int i = startingIndex; i <= lastIndex; i++) {
				str = swap(str, startingIndex, i);
				permute(str, startingIndex + 1, lastIndex);
				str = swap(str, startingIndex, i);
			}
		}
	}

	public static void main(String[] args) {
		String str = "GOD";
		permute(str, 0, str.length() - 1);
	}
}
