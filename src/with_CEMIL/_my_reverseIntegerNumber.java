package with_CEMIL;
import java.util.Scanner;
public class _my_reverseIntegerNumber {

	public static void main(String[] args) {
		// Reverse an integer number
		// In : 1234
		// Out : 4321
		// In : 5001
		// Out : 1005
		Scanner sc = new Scanner(System.in);
		System.out.print("In: ");
		int number = sc.nextInt();
		int number2 = number;
		int reverseNum = 0;
		while (number > 0){
		    int remainder = number % 10;
		    reverseNum = (reverseNum * 10) + remainder; // 1
		    number = number / 10;
		}
		System.out.println(reverseNum);
		// Palindrome Number  1001
		if (reverseNum == number2){
		    System.out.println("Palindrome number");
		}else
		    System.out.println("Not palindrome");	
		
		
		
		
		
		
		
		
	}

}
