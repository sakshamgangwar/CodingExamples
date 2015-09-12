package cmu.sgangwar.problems;

public class OneAway {

	public static void main(String[] args) {
		System.out.println(checkIfOneAway("bale", "palew"));
	}

	private static boolean checkIfOneAway(String st1, String st2) {
		if (Math.abs(st1.length() - st2.length()) > 1)
			return false;

		if (st1.length() == st2.length()) {
			boolean diff = false;
			for (int i = 0; i < st1.length(); i++) {
				if (st1.charAt(i) != st2.charAt(i)) {
					if (diff) {
						return false;
					}
					diff = true;
				}
			}
		} else {
			if (st1.length() > st2.length()) {
				String temp = st1;
				st1 = st2;
				st2 = temp;
			}

			int currentPointer1 = 0;
			int currentPointer2 = 0;

			boolean diff = false;

			while (currentPointer1 < st1.length()
					&& currentPointer2 < st2.length()) {

				if (st1.charAt(currentPointer1) == st2.charAt(currentPointer2)) {
					currentPointer1++;
					currentPointer2++;
				} else {
					if (diff) {
						return false;
					}
					diff = true;
					currentPointer2++;
				}

			}

		}

		return true;
	}
}
