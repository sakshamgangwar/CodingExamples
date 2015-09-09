package cmu.sgangwar.problems;

/**
 * This class contains method which on providing two strings, it decides if one
 * is permutation of the other.
 * 
 * Assumption: considering characters as extended ASCII (max 265 characters) and
 * string is not null.
 * 
 * @author Saksham Gangwar
 *
 */
public class CheckPermutation {

	public static void main(String[] args) {
		System.out.println(checkIfPermutation("saksham", "sakhsam"));

	}

	/**
	 * Using integer array to store occurrence count of all possible ASCII
	 * characters in the string1 and decrementing the count if the character
	 * appears in other string thus making sure that if two strings are
	 * permutation of each other then occurrence array should contain all zeros.
	 * 
	 * @param string1
	 * @param string2
	 * @return - boolean
	 */
	private static boolean checkIfPermutation(String string1, String string2) {

		if (string1.equals(string2))
			return true;
		if (string1.length() != string2.length())
			return false;

		int[] occurance = new int[256];

		for (int i = 0; i < string1.length(); i++)
			occurance[string1.charAt(i)]++;

		for (int i = 0; i < string2.length(); i++)
			occurance[string2.charAt(i)]--;

		for (int i = 0; i < 256; i++) {
			if (occurance[i] > 0)
				return false;
		}

		return true;
	}
}
