package cmu.sgangwar.problems;

/**
 * Implementing Algorithm to find whether any string is having all unique
 * characters or not.
 * 
 * Assumption: considering characters as extended ASCII (max 265 characters) and
 * string is not null.
 * 
 * 
 * 
 * @author Saksham Gangwar
 *
 */
public class IsUnique {
	public static void main(String[] args) {
		System.out.println(checkIfUnique("saksham"));

	}

	/**
	 * 
	 * This method returns true if the input string is having all unique
	 * characters.
	 * 
	 * 
	 * @param userInput
	 * @return boolean
	 */
	private static boolean checkIfUnique(String userInput) {

		if (userInput.length() > 256)
			return false;

		long bitRepresentation[] = new long[4];

		for (int i = 0; i < userInput.length(); i++) {

			int asciiValue = userInput.charAt(i);

			int selectedLong = asciiValue / 64;

			int loc = asciiValue % 64;

			switch (selectedLong) {

			case 0:
				if (((1L << loc) & bitRepresentation[0]) > 0)
					return false;
				bitRepresentation[0] = bitRepresentation[0] | (1L << loc);
				break;

			case 1:
				if (((1L << loc) & bitRepresentation[1]) > 0)
					return false;
				bitRepresentation[1] = bitRepresentation[1] | (1L << loc);
				break;

			case 2:
				if (((1L << loc) & bitRepresentation[2]) > 0)
					return false;
				bitRepresentation[2] = bitRepresentation[2] | (1L << loc);
				break;

			case 3:
				if (((1L << loc) & bitRepresentation[3]) > 0)
					return false;
				bitRepresentation[3] = bitRepresentation[3] | (1L << loc);
				break;
			}

		}

		return true;
	}

}
