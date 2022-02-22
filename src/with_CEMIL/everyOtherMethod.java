package with_CEMIL;

public class everyOtherMethod {
	// Write a method named everyOther
    // parameters string
    // String
    // prints string's every other character starting with first
    // str = "Cemil"
    // out = "Cml"
	public static void main(String[] args) {
		 System.out.println(everyOther("Cemil"));	
	}
	public static String everyOther(String str) {
        String str2 = "";
        for (int i = 0; i < str.length(); i = i + 2){
            str2 += str.charAt(i);
        }
        return str2;
	}
}
