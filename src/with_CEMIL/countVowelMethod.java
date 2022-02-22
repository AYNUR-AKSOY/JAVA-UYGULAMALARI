package with_CEMIL;

public class countVowelMethod {
	
	//Write a method to count all words in a string
	// return type int
	public static void main(String[] args) {
		
		System.out.println(keepVowel("Hello"));
		System.out.println(keepVowel("Hey there!"));
		System.out.println(keepVowel("blablabla"));	
		
		
	}

	public static String keepVowel(String s) {
		char[] arr = { 'a', 'e', 'i', 'o', 'u' };
		s = s.toLowerCase();
		String result = " ";
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < arr.length; j++) {
				if (s.charAt(i) == arr[j]) {
					result += arr[j];
				}
			}
		}
		return result;


	
	}	
}
