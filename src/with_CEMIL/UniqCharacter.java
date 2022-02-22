package with_CEMIL;

import java.util.HashSet;
import java.util.Set;

public class UniqCharacter {

	
	
	//Is Unique: Implement an algorithm to determine if a string has all unique characters.
	// What if you cannot use additional data structures?
	
	public static void main(String[] args) {
		String s = "arkadas";
      System.out.println(solution1(s));
      System.out.println(solution2(s));

      int number = 8; // 00000011  -> 00001000
      String binary = Integer.toBinaryString(number);
      System.out.println(binary);

  }

  public static boolean solution1(final String str){
      //O(n)
      for (int i = 0; i < str.length(); i++) {
          char currentChar = str.charAt(i);
          //O(n)
          for (int j = i+1; j < str.length(); j++) {
              char nextChar = str.charAt(j);
              if(currentChar == nextChar) {
                  return  false;
              }
          }
      }
      // time complexity O(n2)
      return true;
  }
  
  public static boolean solution2(final String str){
      //O(n) - daha hizli cozum ilk cozume gore
      // tradeoff - daha fazla space kullanarak daha hizli cozum elde ettik.
      Set<Character> set = new HashSet<>();
      for(char chr: str.toCharArray()){
          if(!set.add(chr)){
            return  false;
          }
      }
      return true;
  }

  public static boolean solution3(final String str){
      //abcdefg
      if(str.length()> 128) return false;
      boolean[] char_set = new boolean[128];
      for (int i = 0; i < str.length(); i++) {
          int value = str.charAt(i); // a - 97
          if(char_set[value]) {
              return false;
          }
          char_set[value] = true;
      }
      return true;
  }
}




