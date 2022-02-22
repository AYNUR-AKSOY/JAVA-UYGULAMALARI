package with_CEMIL;
import java.util.Scanner;
public class _my_luckyNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your number:");
		int n = s.nextInt();
		
		
		
		// ABCD
		int fourthDigit = n % 10;// D
		int thirdDigit = (n/10)% 10; // ABC % 10 = C
		int secondDigit =(n/100)%10 ;// AB % 10 =D
		int firstDigit=(n/1000)%10; // A% 10= A
		
		
		if (firstDigit + secondDigit== thirdDigit + fourthDigit)
			System.out.println("Lucky Number.");
		else
			System.out.println("Not lucky number");
		
		
		
		
		
		
		
		
	}

}
