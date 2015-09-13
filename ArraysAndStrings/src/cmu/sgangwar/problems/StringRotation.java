package cmu.sgangwar.problems;

public class StringRotation {

	public static void main(String[] args) {
		System.out.println(checkIfStringRotation("waterbottle", "rrbottlewat"));
	}
	
	private static boolean checkIfStringRotation(String s1, String s2){
		if(s1.length()==s2.length())
		{
			return isSubstring(s1+s1, s2);
		}
		
		return false;
		
	}

	private static boolean isSubstring(String s1, String s2) {
		if (s1.contains(s2))
			return true;
		return false;
	}

}
