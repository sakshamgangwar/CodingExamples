package cmu.sgangwar.problems;

public class StringCompression {

	public static void main(String[] args) {
		System.out.println(compressString("aaaabbc"));
	}

	private static String compressString(String st) {
		int count = 0;

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < st.length(); i++) {
			count++;

			if (i >= st.length() - 1 || st.charAt(i) != st.charAt(i + 1)) {
				sb.append("" + st.charAt(i) + count);
				count = 0;
			}
		}
		if (sb.length() < st.length())
			return sb.toString();
		else
			return st;
	}
}
