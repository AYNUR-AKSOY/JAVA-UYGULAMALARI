package with_CEMIL;
import java.util.Scanner;
public class _my_countTheNumbersOfDigits {

	public static void main(String[] args) {
		
		// Count the number of digits in an integer
		// In : 49
		// Out : 2 digits
		// In : 450102
		// Out : 6 digits
		Scanner sc = new Scanner(System.in);
		System.out.print("In: ");
		int number = sc.nextInt();
		int number2 = number;
		int digit = 0;
		while (number != 0) {
		    number = number / 10;
		    digit++;
		}
		System.out.println(number2 + " has " + digit + " digits");
	}

}
