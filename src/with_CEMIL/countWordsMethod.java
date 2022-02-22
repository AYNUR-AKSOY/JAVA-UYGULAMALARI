package with_CEMIL;

public class countWordsMethod {
	// Write a method to count all words in a string
    // return type int
	public static void main(String[] args) {
		
		 String string1 = "The weather is rainy!";
	        int wordCount = countWords(string1);
	        System.out.println(wordCount);
	

	}
	 public static int countWords(String str){
	        String [] words = str.split("\\s+");
	        return words.length;
	 }
}
