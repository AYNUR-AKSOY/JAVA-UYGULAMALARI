package with_CEMIL;

public class _my_shortestLongestWords {

	public static void main(String[] args) {
		
		String[] names = { "Ahmet", "Omer", "Murat", "Ilhan","caner"};

		int maxLengthString = names[0].length(); // 5
		int minLengthString = names[0].length();

		String longestword = names[0];
		String shortestWord = names[0];

		for (int i = 0; i < names.length; i++) {

			if (names[i].length() > maxLengthString) {
				maxLengthString = names[i].length();
				longestword = names[i];
			}

			if (names[i].length() < minLengthString) {
				minLengthString = names[i].length();
				shortestWord = names[i];
			}
		}
		System.out.println(longestword);
 	    System.out.println(shortestWord);
//		for (int i = 0; i < names.length; i++) {
//
//			if (names[i].length()== maxLengthString) {
//				System.out.println(names[i]);
//			}
//
//			if (names[i].length() == minLengthString) {
//				System.out.println(names[i]);
//			}
//		}
	}

}
