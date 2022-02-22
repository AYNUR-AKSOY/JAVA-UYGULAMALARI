package with_CEMIL;

public class _my_primeNumber {

	public static void main(String[] args) {
		
		
	boolean sonuc=asalMi(10);
	
	
	if(sonuc==true) { 
		System.out.println("asal");
	}
		
	else {
		System.out.println("asal degil");
		
	}
	}
		
		public static boolean asalMi(int sayi) {
			for(int i=2;i<sayi;i++) {
				
				if(sayi%i==0) {
					return false;
				}
			}
			return true;
			
		}
		
	
		
		
	}


