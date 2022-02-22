package with_CEMIL;

public class hasCharacterMethod {
	 // Write a method named hasCharacter that takes a string and a character
     // returns true if character is in the string
     // returns false otherwise

public static void main(String[] args) {
		System.out.println(hasCharacter("Java", 'a'));
		    }

public static boolean hasCharacter(String str, char ch){
    for (int i = 0; i < str.length(); i++){
        if (str.charAt(i) == ch)
            return true;
    }
    return false;

}
}