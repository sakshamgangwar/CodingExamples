package cmu.sgangwar.problems;

public class PallindromePermutation {

	public static void main(String[] args) {
		System.out.println(isPallindromePermutation("taco  cta"));
	}

	private static boolean isPallindromePermutation(String input) {

		long bitRepresentation[] = new long[4];

		for (int i = 0; i < input.length(); i++) {

			int asciiValue = input.charAt(i);
			
			

			int selectedLong = asciiValue / 64;

			int loc = asciiValue % 64;


			switch (selectedLong) {

			case 0:
				if (((1L << loc) & bitRepresentation[0]) > 0) {
					bitRepresentation[0] = bitRepresentation[0] & ~(1L << loc);
				} else {
					bitRepresentation[0] = bitRepresentation[0] | (1L << loc);
				}
				break;

			case 1:
				if (((1L << loc) & bitRepresentation[1]) > 0) {
		
					bitRepresentation[1] = bitRepresentation[1] & ~(1L << loc);
				} else {
					bitRepresentation[1] = bitRepresentation[1] | (1L << loc);
				}
				break;

			case 2:
				if (((1L << loc) & bitRepresentation[2]) > 0) {
					bitRepresentation[2] = bitRepresentation[2] & ~(1L << loc);
				} else {
					bitRepresentation[2] = bitRepresentation[2] | (1L << loc);
				}
				break;

			case 3:
				if (((1L << loc) & bitRepresentation[3]) > 0) {
					bitRepresentation[3] = bitRepresentation[3] & ~(1L << loc);
				} else {
					bitRepresentation[3] = bitRepresentation[3] | (1L << loc);
				}
				break;
			}

		}

		long ORResult = bitRepresentation[0] | bitRepresentation[1] | bitRepresentation[2] | bitRepresentation[3];
		
		long ANDResult = bitRepresentation[0] & bitRepresentation[1] & bitRepresentation[2] & bitRepresentation[3];

		if (((ORResult & (ORResult-1))==0) && ANDResult==0 &&((bitRepresentation[0] & (bitRepresentation[0] - 1)) == 0)
				&& ((bitRepresentation[1] & (bitRepresentation[1] - 1)) == 0)
				&& ((bitRepresentation[2] & (bitRepresentation[2] - 1)) == 0)
				&& ((bitRepresentation[3] & (bitRepresentation[3] - 1)) == 0)) {
			return true;

		}
		return false;
		
	}

}
