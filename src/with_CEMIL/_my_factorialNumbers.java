package with_CEMIL;

public class _my_factorialNumbers {

	public static void main(String[] args) {
		
		
		
		//int faktoriyel=1;
		//int sayi=6;
		
		//for(int i=sayi;i>=1;i--) {
		
		//faktoriyel= i*faktoriyel;
		//}
		//System.out.println(faktoriyel);
		
		
		
		System.out.println(factoriyel(5));
		
	}
		public static int factoriyel(int i) {
		
		
		if(i==1) {
			return 1;
		}
		else {
			
			return (i*factoriyel(i-1));
			
		}
			
		}
	
	

			
		
	}


