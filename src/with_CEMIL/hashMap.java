package with_CEMIL;

import java.util.HashMap;
import java.util.Map;

public class hashMap {

	public static void main(String[] args) {
		String str="aastttnmmmm";
		repeatedChar(str);
		
		
		
	}
	public static  void repeatedChar(String str){

        // I convert str to charArray
        // I create HashMap, because HashMap has key-value pair. Key : Character Value: Integer
        // to count the characters occurance
        // Created for each loop, we want to iterate (traverse) in the char array

        // If else condition:

        char[] arr = str.toCharArray(); //'E' 'E' 'r'..

        Map<Character, Integer> map = new HashMap<>();
        for (char c: arr) {
            if(map.containsKey(c)){  //E
                map.put(c, map.get(c) +1); // E : 2
            }
            else {
                map.put(c, 1);  // z
            }


        }

        for(Map.Entry<Character, Integer> enrty : map.entrySet()){

            if(enrty.getValue() == 1){
                System.out.println(enrty.getKey());

            }
            else {
                System.out.println(enrty.getKey() + " " + enrty.getValue());
            }

        }
        // map.forEach((key, value) -> System.out.println(key + ": " + value));


    }
}
