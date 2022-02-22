package with_CEMIL;

public class StringPermutation {

	
//	A Permutation of a string is another string that contains same characters,
// only the order of characters can be different. 
//	For example, “abcd” and “dabc” are Permutation of each other.
	
	public static void main(String[] args) {
		
		
	String	s="asdf";
	String  t="snmz";
	
		
		
		
		
	}
	
	public static boolean permutation (String s, String t) {
		
		if (s == null || t == null) {
			return false;
			
		}
		
		if (s.length() != t.length()) {
			return false;
		}
		
		for (int i= 0; i< s.length(); i++) {
			if (s.charAt(i) != t.charAt(s.length() -1 - i)) {
				return false;
			}
		}
		
		return true;
		
	}
	
}




