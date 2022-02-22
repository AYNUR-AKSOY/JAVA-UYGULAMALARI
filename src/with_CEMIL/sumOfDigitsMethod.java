package with_CEMIL;

public class sumOfDigitsMethod {
	 // write a method to sum digits of a number
     // int
     //850=8+5+3
	 // 13

	public static void main(String[] args) {
		
	System.out.println(sumDigit(1234));
}

	
public static int sumDigit(int number){
    int sum = 0;
    while (number != 0){
    	
        int remainder = number % 10;
        sum += remainder;
        number = number / 10;
    }
    return sum;
}

}
