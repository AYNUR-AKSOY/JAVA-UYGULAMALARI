package with_CEMIL;

import java.util.HashSet;

public class Polindrom_Permutation {

	public static void main(String[] args) {
		
	String s="Taco cat";
	
		
		canPermutePalindrome(s);
		
		
		
	}
	
	 public static boolean canPermutePalindrome(String s) {
		 
	        HashSet<Character> app = new HashSet<Character>();
	        for (int i = 0; i < s.length(); i ++) {
	            char c = s.charAt(i);
	            if (app.contains(c)) {
	                app.remove(c);
	            }    
	            else {
	                app.add(c);
	            }
	        }
	        return app.size() <=1;
	    }
	}

