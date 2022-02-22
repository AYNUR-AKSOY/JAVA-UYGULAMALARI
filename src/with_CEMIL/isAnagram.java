package with_CEMIL;

import java.util.Arrays;

public class isAnagram {

	public static void main(String[] args) {
		
String s1="abcd";
String s2="bdca";
		
isAnagram(s1,s2);		
		
	}
	public static void isAnagram(String s1, String s2) {


        String a1[] = s1.toLowerCase().split("");
        Arrays.sort(a1);

        String a2[] = s2.toLowerCase().split("");
        Arrays.sort(a2);

        if (s1.length() != s2.length()) {
            System.out.println("Bu String'ler 'Anagram' degildir");
        } 
        else if (s1.isEmpty() || s2.isEmpty()) {
            System.out.println("Bu String'ler 'Anagram' degildir");
        }
        else if (Arrays.equals(a1, a2)) {
            System.out.println("Bu String'ler 'Anagram'dir");
        }
        else {
            System.out.println("Bu String'ler 'Anagram' degildir");

    }
}
}

