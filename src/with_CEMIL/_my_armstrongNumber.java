package with_CEMIL;

public class _my_armstrongNumber {

	public static void main(String[] args) {
		
		
		// sayinin rakamlarinin kupleri toplami o sayiya esitse 
		//bu sayiya amstrong sayi denir.
		// 153=1+125+27 gibi
	
		
		
		int sayi=153;
		int rakam;
		int toplam=0;
		int sayininIlkHali=sayi;//153
		
		while(sayi>0) {
			rakam=sayi%10;
			sayi=sayi/10;
			toplam+=(rakam*rakam*rakam);
		}
		
		if(sayininIlkHali==toplam) {
			System.out.println("evet! Armstrong sayi");
		}
		else {
			System.out.println("hayir! Armstrong sayi degil.");
		}

	}

}
