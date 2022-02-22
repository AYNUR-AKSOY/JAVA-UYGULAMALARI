package with_CEMIL;
import java.util.Arrays;
public class _my_countingWordsInAString {

	public static void main(String[] args) {
		// Counting words in a string
        // In: Welcome to the world of Automation
        // Out: 6
		
        String str = "Welcome        to     the       world of Automation";
        String str2 = "Welcome1 2to 3python";
        String [] strArr = str.split("\\s+");// bosluklar cok olabilir, bilmiyoruz
        System.out.println(strArr.length);
        String [] strArr2 = str2.split("[0-9]");
        System.out.print(Arrays.toString(strArr2));

	}

}
