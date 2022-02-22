package with_CEMIL;

import java.util.Scanner;

public class _my_fibonacciNumbers {

	public static void main(String[] args) {
		
		// fibonacci numbers	
		//starts with 0 and 1
		// sequence 0,1,1,2,3,5,8,13...	
			Scanner scanner=new Scanner(System.in);
			int limit=scanner.nextInt();
			
			int num1=0;
			int num2=1;
			
			int i=1;
			while(i<=limit){
				if(i==limit){
					System.out.println(num1);
					break;
					
				}
				System.out.println(num1+",");//0,1,1,...
				int temp=num1+num2;//1+1
				num1=num2;//1
				num2=temp;//2
				i++;
			}
//			int i = 1;
//	        while(i <= x){
//	            System.out.print(num1 + " ");
//	            int add = num1 + num2;
//	            num1 = num2;
//	            num2 = add;
//	            i++;
//	        }	
			
	}

}
