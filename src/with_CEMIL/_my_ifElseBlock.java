package with_CEMIL;

import java.util.Scanner;

public class _my_ifElseBlock {

	public static void main(String[] args) {
		
		// if else block
		/*
		 * online store
		 * price, speed
		 * regular shipping rates==1
		 * purchase price      cost
		 * 1-100                17
		 * 101-300              10
		 * 300+                  free
		 * 
		 * express shipping rates==2
		 * purchase price       cost
		 * 1-100                 35
		 * 101-300               25
		 * 300+                   15
		 */
		 
		 
		 
			Scanner scanner = new Scanner(System.in);
			int shipping = scanner.nextInt();
			int price = scanner.nextInt();
			
			int cost = 0;
			
			if (shipping == 1) {
				System.out.println("---Regular Shipping---");
				if (price >= 1 && price <= 100) {
					cost = 17;
				}else if (price > 100 && price <= 300) {
					cost = 10;
				}else if (price > 300) {
					cost = 0;
				}
			}else if (shipping == 2) {
				System.out.println("---Express Shipping---");
				if (price >= 1 && price <= 100) {
					cost = 35;
				}else if (price > 100 && price <= 300) {
					cost = 25;
				}else if (price > 300) {
					cost = 15;
				}
			}
			
			System.out.println("Total shipping cost: " + cost);
			
			
	}

}
