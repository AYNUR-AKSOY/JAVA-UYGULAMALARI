package with_CEMIL;

public class _my_swapNumbers {

	public static void main(String[] args) {
		
		// Write a java program to swap two numbers
		int a = 10;
		int b = 20;
		System.out.println("Before swapping the numbers:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		int temporary = a;
		a = b;
		b = temporary;
		System.out.println("After swapping the numbers:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
